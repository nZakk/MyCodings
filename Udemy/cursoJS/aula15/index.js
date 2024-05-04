const pessoa= {
    nome: 'Isaac',
    sobrenome:"Santos",
    idade: 19,
    endereco: {
        rua: 'Allen rd',
        numero: 43
    }
};
//Atribuição via desestruturação
//const {nome='', sobrenome, endereco: {rua: r,numero}}=pessoa;
//console.log(nome,sobrenome,r,numero);

// operador rest
const {nome, ...resto}=pessoa;
console.log(resto);