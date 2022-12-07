function insertionSort(arr) {
  for (let i = 0; i <= arr.length; i++) {
    for (let j = 0; j <= arr.length; j++) {
      if (arr[j] > arr[j + 1]) {
        [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
      }
    }
  }
  return arr;
}

console.log(insertionSort([5, 3, 8, 7]));
console.log(insertionSort([10, 8, 11, 3, 55, 1, 3]));
console.log(insertionSort([0, 0, 1, 1, 0, 1, 0]));
console.log(insertionSort([1, 2, 3, 4, 5, 6, 7]));
