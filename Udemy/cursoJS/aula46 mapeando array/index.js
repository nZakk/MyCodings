 // MAP - sempre retorna um array com a mesma quantidade de 
 //elementos mas sendo usando para modifica-los.

// dobre os numeros

//const numeros = [5, 50, 80, 1, 2, 3, 5, 8, 7, 11, 15, 22, 27];

// mesmo modos operando da FILTER mudando somente o RETURN dos
//dados pois usamos o MAP para modificar os dados do array
// diferente de FILTER o MAP continua com a mesma quantidade de 
// dados no array, só os modificando

//const dobro = numeros.map(valor => valor * 2);
//console.log(numeros, dobro);

//Para cada elemento:
//Retorne apenas uma string com o nome da pessoa
//Remova apenas a chave "nome" do objeto
//Adicione uma chave ID em cada Objeto

const pessoas = [
    { nome: 'Luiz', idade: 62 },
    { nome: 'Maria', idade: 23 },
    { nome: 'Eduardo', idade: 55 },
    { nome: 'Letícia', idade: 19 },
    { nome: 'Rosana', idade: 32 },
    { nome: 'Wallace', idade: 47 },
];

//const stringNome = pessoas.map(obj => obj.nome);
//console.log(stringNome)

//const delNome = pessoas.map(obj => ({idade : obj.idade}));
//console.log(delNome);
//Com isso retorna um novo objeto somente com os dados das
//idades sendo fechado por chaves
//CUIDADO as chaves para a criação do novo obj iria ser 
//lido com os da função por isso colocamos outro parente envolta
// se tornando uma expressão

const addId = pessoas.map(function (obj,indice) {
//    obj.id = indice + 1;
//Com isso pois objetos arrays e funções sao referenciados e n criam
//com isso adicionando o id no objetos pessoas inicial podendo 
//atrapalhar em projetos reais por isso criar um novo objeto
//usando o spread
    const newObj = {...obj }
    newObj.id = indice;
//criar um novo item em um objeto so referencia o objeto '.' e o 
//nome do dado e o valor
    return newObj;
});
console.log(addId);