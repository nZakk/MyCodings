//Retorne a soma do dobro de todos os pares
// filtar pares
// dobrar os valores 
// reduzir (somar tudo)

const numeros = [5, 50, 80, 1, 2, 3, 5, 8, 7, 11, 15, 22, 27];

const total = numeros
    .filter(valor => valor % 2 === 0)
    .map(valor => valor * 2)
    .reduce((total,valor) =>total += valor);

//const dobra = pares.map(valor => valor * 2);

//const total = dobra.reduce((total,valor) =>total += valor);

//eu fiz separado mas pode usar eles seguidos um do outro
//so apos o fechamento dos parenteses da função colocar . e o proximo 
//que irá usar
console.log(total);