//REDUCE

const numeros = [5, 50, 80, 1, 2, 3, 5, 8, 7, 11, 15, 22, 27];
//Com o REDUCE por ser versátil podendo ser usado paras as mesmas finalidades
//de map e filter mas diferente de SPLICE n é recomendado tal uso
//a diferença q temos mais um novo parametro que vem antes do valor'
//um acumulador tento q ser colocado seu valor inicial após o fecho dos colchetes {}
// uma virgula e seu valor inicial, e sempre retornar um valor para continuar o 
//acumuladpr pois ele so fica com o valor inicial no primiero 
//loop da iteração, caso n coloque nehum valor o valor do acumulador 
//será do primeiro valor do array

const total = numeros.reduce(function (acumulador,valor,indice,array){
    if (valor % 2 === 0) {
        acumulador += valor;
    };
    return acumulador;
},0);

//console.log(total);

// Retorne a pessoa mais velha
const pessoas = [
    { nome: 'Luiz', idade: 62 },
    { nome: 'Maria', idade: 23 },
    { nome: 'Eduardo', idade: 55 },
    { nome: 'Letícia', idade: 19 },
    { nome: 'Rosana', idade: 64 },
    { nome: 'Wallace', idade: 63 },
];

const maisVelhas = pessoas.reduce(function (acumulador,valor){
    if (acumulador.idade > valor.idade) return acumulador;
    return valor;
});
console.log(maisVelhas);

