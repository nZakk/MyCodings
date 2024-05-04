let varA = `A`; // B
let varB = `B`; // C
let varC = `C`; // A

let slot1 = varA;

slot1 = varA;

varA = varB;
varB = varC;
varC = slot1;

console.log(varA,varB,varC);