const nomes = ['Maria','Joao','Eduardo','Gabriel',"Julia"];


//nomes.splice(índice atual, delete, el1, el2, el3 ...);
//o primeiro parametro sendo o indice atual
//q será a ponot de partida para a manipulação
//o segundo sendo quandos elementos serao deletados
//e o terceiro pra frente sao elementos q serão adicionados

//indices negativos pode ser entendido como o inverso
// comça a contagem no final do array sendo o ultimo
// o indice -1 e do final para o começo respectivamente

//POP
//const removidos = nomes.splice(-1, 1);

//SHIFT
//const removidos = nomes.splice(0, 1);

//const removidos = nomes.splice(3, 0, 'Isaac');
//colocando um terceiro elemento ele adiciona no array no index 
//citado no primeiro elemento
//movendo (caso)haja ja algo no mesmo indice para o proximo indice 

//PUSH
//nomes.splice( nomes.length, 0,'Isaac');

//UNSHIFT
//nomes.splice(0, 0,'Isaac');



console.log(nomes);