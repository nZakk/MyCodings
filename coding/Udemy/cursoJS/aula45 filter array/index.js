 // FILTER - sempre retorna um array com a mesma quantidade de 
 //elementos ou menos.

 // Retorne os numeros maiores que 10
//const numeros = [5, 50, 80, 1, 2, 3, 5, 8, 7, 11, 15, 22, 27];

//let maiores=[];
//for(let i = 0; i < nums.length ; i++){
//    if (nums[i] > 10){
//       let contagem = maiores.push(nums[i]);
//    }  
//}

//professor fallu pra tentar filtrar o array e essa foi
// minha terrivel tentativa

//const numerosFiltrados = numeros.filter(valor => valor > 10)

//por ser comum usar funções anonimas para FILTER 
// por estar usando so um dos 3 parametros se retira os parenteses
//pode tbm tranformar em uma arrow function 
//por ter 1 linha so pode se retirar os colchetes diminuindo bastante

//FILTER funciona criando um novo array e usando o metodo, que
//recebendo os 3 parâmetros automaticamente
// valor indice e o valor total do array se for preciso
// dps para o FIlTER pegar o valor e filtrado dado o parametro 
// se vc quiser q o valor seja adicionado no novo array com os 
//valores filtrados precisa ser retornar um valor bolean TRUE se
//quiser ser adicionado e FALSE se n deseja tal valor

//console.log(numerosFiltrados);


// Retorne as pessoas que tem o nome com 5 letras ou mais.
//Retorne as pessoas com mais de 50 anos 
//Retorne as pessoas cujo o nome termina com a

const pessoas = [
    {nome: 'Luiz', idade: 62},
    {nome: 'Maria', idade: 23},
    {nome: 'Eduardo', idade: 55},
    {nome: 'Letícia', idade: 19},
    {nome: 'Rosana', idade: 32},
    {nome: 'Wallace', idade: 47},
];

const pessoasNomesMais5 = pessoas.filter(valor => valor.nome.length >= 5);
//console.log(pessoasNomesMais5);

const pessoasMais50 = pessoas.filter(valor => valor.idade > 50);
//console.log(pessoasMais50);

const pessoasTerminaA = pessoas.filter(valor => (valor.nome.toLowerCase().endsWith(`a`))); 
//const pessoasTerminaA = pessoas.filter(valor => (valor.nome[valor.nome.length -1] == 'a'));

//jeito correto e pratico é o de cima o debaico foi a minha logica sem saber do ENDSWITH

console.log(pessoasTerminaA);

