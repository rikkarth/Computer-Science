function linearSearch(array, findValue) {
  for (let i = 0; i <= array.length; i++) {
    if (array[i] === findValue) {
      return `We have found your value ${findValue} in the ${i + 1} position`;
    }
  }
}

function linearSearchRecursive(array, findValue) {
  if (array[0] === findValue) {
    return `We have found your value ${findValue}`;
  }

  if (array[0] !== findValue) {
    let shiftedElement = array.shift();
  }

  return linearSearchRecursive(array, findValue);
}

console.log(linearSearchRecursive([8, 11, 15, 5, 3, 55, 10, 100], 10));

console.log(linearSearch([8, 11, 15, 5, 3, 55, 10, 100], 10));
console.log(linearSearch([2, 8, 30, 100005, 0, 55, 15456, 1564], 0));
console.log(linearSearch([8, 11, 15, "monkey", 3, 55, null, 100], "monkey"));
