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
  return `飲料A有${countA}杯、飲料B有${countB}杯、共有${countA + countB}杯`;
}

function toNumber(input) {
  for (let i = 0; i < input.length; i++) {
    switch (input[i]) {
      case 'a':
        input[i] = 1;
        break;
        
      case 'b':
        input[i] = 2;
        break;
        
      case 'c':
        input[i] = 3;
        break;
        
      case 'd':
        input[i] = 4;
        break;
        
      case 'e':
        input[i] = 5;
        break;
    }
  }
  return input;
}

let input1 = ['a', 'b', 'c', 'a', 'c', 'a', 'c'];
console.log(countAandB(input1));
console.log(toNumber(input1));

let input2 = ['e', 'd', 'c', 'd', 'e'];
console.log(countAandB(input2));
console.log(toNumber(input2));