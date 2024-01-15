function countAandB(input) {
  let countA = 0;
  let countB = 0;

  for (let i = 0; i < input.length; i++) {
    if (input[i] === 'a') {
        countA++;
    } else if (input[i] === 'b') {
        countB++;
    }
  }
  return countA + countB;
}

function toNumber(input) {
  const result = [];

  for (let i = 0; i < input.length; i++) {
    switch (input[i]) {
      case 'a':
          result.push(1);
          break;
      case 'b':
           result.push(2);
          break;
      case 'c':
          result.push(3);
          break;
      case 'd':
          result.push(4);
          break;
      case 'e':
          result.push(5);
          break;
    }
  }
  return result;
}

let input1 = ['a', 'b', 'c', 'a', 'c', 'a', 'c'];
console.log(countAandB(input1));
console.log(toNumber(input1));

let input2 = ['e', 'd', 'c', 'd', 'e'];
console.log(countAandB(input2));
console.log(toNumber(input2));