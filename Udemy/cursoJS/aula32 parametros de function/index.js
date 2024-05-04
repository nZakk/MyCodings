//function funcao(){
//    console.log(arguments[10]); 
//}
//funcao('valor',1,2,3,4,5,6,7,8,9,'Isaac');
//em funções FUNCTION os 
//parametros em JS são jogados automaticamente 
//em um objeto 'arguments'

function funcao(){
    let total = 0;
    for (let argumento of arguments){
        total += argumento;
    }
    console.log(total);
}
//funcao(1,2,3,4,5,6,7,8,9);

function conta(operador,acumulador, ...numeros){
    for (let numero of numeros){
        if (operador ==='+') acumulador+=numero;
        if (operador ==='-') acumulador-=numero;
        if (operador ==='*') acumulador*=numero;
        if (operador ==='/') acumulador/=numero;
    };
    console.log(acumulador);
}
conta('+',1,20,30,40,50);

//usar rest operator no paremetro para poder usar 
//'arguments' ,para jogar todos os parametros numa variavel