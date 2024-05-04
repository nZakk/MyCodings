function random(min, max) {
    const r = Math.random() * (max - min) + min;
    return Math.floor(r);
}

const min = 1;
const max = 50;

let a = random(min, max);
let b = random(min, max);

console.log(a, b);

function maiorNum(numA, numB) {
    if (numA > numB) return (numA);
     
    return (numB);

}

numMaior = maiorNum(a, b);
console.log(`maior número é ${numMaior}`);

// arrow functiom
//  const max2 = (x, y) => x > y ? x : y;






