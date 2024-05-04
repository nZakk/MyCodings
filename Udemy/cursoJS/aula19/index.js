// for of ja passa por todos os itéraveis(valores com index)

const nomes = ['Isaac','Goncalves','Santos'];

for (let valor of nomes) {
    console.log(valor);
};

nomes.forEach(function(valor , indice, array) {
    console.log(valor,indice,array);
});

// for classico - geralmente com iteráveis (arrays ou strings)
// for in - retorna o índice ou chave (string, array ou objetos)
// for of - retorna o valor em si (iteráveis, arrays ou strings)