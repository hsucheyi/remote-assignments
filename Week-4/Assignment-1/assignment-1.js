// A. Complete the function below to show a delayed result in the console.

function delayedResult(n1, n2, delayTime, callback) {
  setTimeout(() => {
    callback(n1 + n2);
  }, delayTime);
}

delayedResult(4, 5, 3000, function (result) {
  console.log(result);
});

delayedResult(-5, 10, 2000, function (result) {
  console.log(result);
});

// B. To implement delayedResult again using promise this time.
function delayedResultPromise(n1, n2, delayTime) {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve(n1 + n2);
    }, delayTime);
  });
}

delayedResultPromise(4, 5, 3000).then(console.log);

// C. To implement it using async/await this time.
async function main() {
  const result = await delayedResultPromise(4, 5, 3000);
  console.log(result);
}

main();