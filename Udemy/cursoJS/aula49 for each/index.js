//FOR EACH somente em array;

const a1 = [1, 2, 3, 4, 5, 6, 7, 8, 9]

//FOR OF que ítera o array completo
//for (let valor of a1){
//    console.log(valor);
//};

//tem a mesma base dos FILTER MAP e REDUCE mas digamos
//que é so os esqueleto basicamente o FOR EACH é o sistema de 
//iteraçao deles somente contendo o dados valor indice e array
// e funciona normalmente como um FOR
//n tendo os bonus de cada função dos 3 acima q usa o mesma
//íteração

let total = 0;
a1.forEach(valor=> {
    total += valor;
} );
console.log(total);