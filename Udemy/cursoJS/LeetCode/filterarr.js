
arr=[1,2,3];

function firstIndex(n, i) { 
    console.log(i);
    return i === 0; };

var filter = function(arr, firstIndex) {
    const filterArr = [];
    for (let i in arr){
        console.log(i,arr[i]);

        if (firstIndex(arr[i], i)){
        filterArr.push(arr[i]);
        }
    }
}