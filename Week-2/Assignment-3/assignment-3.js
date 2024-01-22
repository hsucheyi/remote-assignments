function count(input) {
  const counter = {};

  input.forEach(alphabet => counter[alphabet] = counter[alphabet] ? counter[alphabet] + 1 : 1);
  return counter;
}

let input1 = ["a", "b", "c", "a", "c", "a", "x"];
console.log(count(input1));

function groupByKey(input) {
  const group = {};

  input.forEach(item => {
    const key = item.key;
    const value = item.value;
    if (!group[key]) {
       group[key] = 0;
    }
      group[key] += value;
  });
  return group;
}

let input2 = [
  { key: "a", value: 3 },
  { key: "b", value: 1 },
  { key: "c", value: 2 },
  { key: "a", value: 3 },
  { key: "c", value: 5 },
];

console.log(groupByKey(input2));