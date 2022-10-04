function selectionSort(arr) {
  for (let i = 0; i < arr.length; i++) {
    let min = i;

    console.log(`This is now min: ${min}`);

    for (let j = i + 1; j < arr.length; j++) {
      if (arr[min] > arr[j]) {
        min = j;
      }
    }

    if (i !== min) {
      let temp = arr[i];

      arr[i] = arr[min];

      arr[min] = temp;
    }
  }
}

let arr1 = [8, 7, 10, 9, 16];
console.log(`This is original ${arr1}`);
console.log(selectionSort(arr1));