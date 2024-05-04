const pessoas =[ 
    {id: 3, nome: "luiz"},
    {id: 2, nome: "Maria"},
    {id: 1, nome: "helea"},
];

//const novasPessoas = {};
//for (const pessoas of pessoas){
//    const { id } = pessoa;
//    
//    novaspessoas[id] = {...pessoa};
//}
//console.log(novasPessoas);

const novasPessoas = new Map();

for (const pessoa of pessoas){
    const { id } = pessoa;
    
    novasPessoas.set(id, {...pessoa});
}
/*
Pode ver q descontruimos o id da chave pessoas para usarmos 
como a chave no nosso map
*/

/*
com o Map iniciado na const acima, usamos o set para começar o mapeamento
o primeiro é a chave q no map pode ser qualquer coisa 

  A Map's keys can be any value (including functions, 
    objects, or any primitive).

ai o primeiro argumento é a chave que vocÊ quer
e o segundo argumento é o valor do map que você quer
com o map a ordem de inserção no map continua o mesmo diferente 
q no exemplo anterior q o motor do javascript coloca em ordem crescente
 então é usado o set para configurar o map e seu valor e o .get para ter 
 o retorno do valor
*/
console.log(novasPessoas.get(2));

novasPessoas.delete(2);
console.log(novasPessoas);

/*
Também o Map tem o .has() e colcoa o nome q procura para saper
se aquele map já tem uma key no nome q está procurando
bom para ser verificado antes de set um novo map para n sobrescrever dados

*/