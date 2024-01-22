function avg(data) {
  let avgPrice = data.products
    .map(product => product.price)
    .reduce((acc, cur) => acc + cur) / data.products.length;
  return avgPrice;
}

console.log(
  avg({
    size: 3,
    products: [
      {
        name: "Product 1",
        price: 100,
      },
      {
        name: "Product 2",
        price: 700,
      },
      {
        name: "Product 3",
        price: 250,
      },
    ],
  })
);