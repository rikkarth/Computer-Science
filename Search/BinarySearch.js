function binarySearch(arr, target) {
  //SELECTION OF THE VALUE IN THE MIDDLE OF THE ARRAY  
  let half = Math.round(arr.length / 2);
  
  //IF VALUE SELECTED IS EQUAL TO TARGET VALUE
  if (arr[half] === target) {
    return `Your value ${target} has been found.`;
  }

  //IF TARGET VALUE IS NOT PRESENT IN ARRAY
  if(!arr.includes(target)){
    return `You have selected ${target}, your value is not present in the array.`
  }

  //IF SELECTED VALUE IS INFERIOR THAN TARGET VALUE THEN CHOP ALL VALUES INFERIOR TO SELECTED VALUE 
  if (arr[half] < target) {
    arr = arr.slice(half);
    console.log(arr);
  }
  //IF SELECTED VALUE IS SUPERIOR THAN TARGET VALUE THEN CHOP ALL VALUES SUPERIOR TO SELECTED VALUE 
  if (arr[half] > target) {
    arr = arr.slice(0, half);
    console.log(arr);
  }

  //IF TARGET IS NOT FOUND, RECURSIVELY INSERT NEW (NOW CHOPPED) ARRAY INTO FUNCTION
  return binarySearch(arr, target);
}

//ORDERED ARRAY GENERATOR - WILL GENERATE ARRAY OF DESIRED SIZE
function generateOrderedArray() {
    let orderedArray = [];
    for (let i = 0; i <= 10000; i++) {
        orderedArray.push(i);
    }
    return orderedArray;
}

console.log(binarySearch(generateOrderedArray(), 4578));
console.log(generateOrderedArray());
