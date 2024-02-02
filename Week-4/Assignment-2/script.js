function ajax(src, callback) {
  const xhr = new XMLHttpRequest();

  xhr.onreadystatechange = function () {
    if (xhr.readyState === 4) {
      if (xhr.status === 200) {
        callback(xhr.responseText);
      }
    }
  };
  xhr.open("GET", src);
  xhr.send();
}

function render(data) {
  const parsedData = JSON.parse(data);
  const productsContainer = document.getElementById("products-container");

  parsedData.forEach((product) => {
    const name = document.createElement("h2");
    name.textContent = `Name: ${product.name}`;

    const description = document.createElement("p");
    description.textContent = `Description: ${product.description}`;

    const price = document.createElement("p");
    price.textContent = `Price: ${product.price}`;

    productsContainer.appendChild(name);
    productsContainer.appendChild(description);
    productsContainer.appendChild(price);
  });
}

ajax(
  "https://remote-assignment.s3.ap-northeast-1.amazonaws.com/products",
  function (response) {
    render(response);
  },
);
