// revisão array

// array são valor por referencia 
//quando referenciados e modificados na nova variavel
//se modifica a variavel array de origem

//const nomes = ["Eduardo","maria","joana"];
// string,objetos,funções,numeros

//const nomes = new Array("Eduardo","maria","joana",
//"Wallace","Marry","Rosana");

//-SPREAD mesmo conceito do REST(reticencia no final)
//só que para copiar os elementos para um novo array
//podendo modificar um sem referenciar o outro

//const novo = [...nomes];


//-DELETE nome[3] deleta o elemento no indices correspondente

//const removido = novo.pop();

//-POP elimina o ultimo elemento
//-SHIFT mesma logica mas para o primeiro elemento e move
//os restante elementos pra um a menos
//ambos retorna o elemento removido

//-PUSH insere um elemnto no final do array
//-UNSHIFT insere elemento no começo do array
//modificando os indices dos restantes

//const novo2 = nomes.slice(1,3);

//SLICE fatia o array nos indices correspondentes
//o primeiro valor sendo o primeiro valor q deseja no slice
//e o segundo valor sendo o um indice maior q o indice q 
//deseja incluir no slice
//tbm podendo ser usado para remover elementos do array
//basta colocar numero negativo no segundo parametro
//-1 remove o ultimo -2 remove os dois ultimos e assim vai

//console.log(nomes,nomes.length);
//console.log(novo,removido);

//console.log(novo2);

//const nome = "Isaac Gonçalves Santos";
//const nomes = nome.split(' ');

//SPLIT divide strings em arrays e o divisor será o
//elemento,letra ou espaço basta colocar entre as aspas

const nomes =[ 'Isaac', 'Gonçalves', 'Santos' ]
const nome = nomes.join(" ");

//JOIN sendo o contraparte de SPLIT junta uma array
//em uma string usando o elemnte dentro das aspas como 
//o separar oq vai ficar entr os dois elementos
//pensa q tipo o SPLIT vai pegar oq estiver dento das aspas
//e deletar dividindo e o JOIN vai adicionar oq estiver nas
//aspas sendo usando como cola pra juntar

console.log(nome);  
