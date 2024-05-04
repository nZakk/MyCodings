const a1 = [1, 2, 3];
const a2 = [4, 5, 6];
//const a3 = a1.concat(a2, [7, 8, 9], "Isaac");

const a3 = [...a1 ,"Isaac", ...a2, ...[7, 8, 9]];
//usando o SPREAD para puxar os valores dos arrays
//metodo meso se eu alterar os valores no a3 n serao modificados
//no original pois o spred copia e n referencia os valores

//a3.splice(1, 2);
console.log(a3);