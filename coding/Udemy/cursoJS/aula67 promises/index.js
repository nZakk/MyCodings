function rdnNum (min, max){
    min *= 1000;
    max *= 1000;
    return Math.floor(Math.random() * (max - min) + min);
 }

 //com as PROMISES e os termos reject e resolve colocamos o resolve bem onde seria 
 // o cb callback no metodo anterior,o reject e resolve basicamente é mecanismo de 
 // consfirmação se o codigo funcionou corretamente então chamamos o resolve e 
 // promise continua adiante caso ocorra algum erro usamos o reject para interromper
 //promise.
 //Com isso vem o .THEN e o .CATCH.
 //.then é usado para qunado o código cumpre seu dever e alcança o resolve sendo
 // sendo um function de parâmetro único, sendo assim após isso o código q está dentro
 // do .then é executado. Com isso gereando uma corrente de .then a ser executando em ordem
 //para um objetivo.
 //.catch é usado quando ocorre algum erro ou bug no código sento usado pra capturar o
 // erro para ser resolvido no futuro.

function esperaAi(msg, tempo) {
    return new Promise((resolve, reject)=>{
        if (typeof msg !== 'string') reject ('BAD VALUE');
        setTimeout(()=>{
            resolve(msg);
        }, tempo);
    });
}

esperaAi('Frase 1', rdnNum(1, 3))
.then(resposta => {  //then da frase 1
    console.log(resposta);
    return esperaAi(2222, rdnNum(1, 3));
}).then(resposta => {  //por prescisar retirnar outra promisse se cria mais um then para a frase 2
    console.log(resposta);
    return esperaAi('Frase 3', rdnNum(1, 3));
}).then(resposta => {  //then frase 3
    return resposta + ' vai pro proximo THEN';
}).then(resposta => {
    console.log(resposta);
})
.catch(e => {
    console.log('ERRO: ', e);
});


//metodo callback com as function sendo chamadas so após a antecessora terminar
//de ser executada para ai a proxima function será chamada, mas conforme o aumento
//function sendo necessária nos callbacks facilmente esse codigo se torna uma
//"árvore de nata" sendo assim de péssimo design.
/*

function esperaAi(msg, tempo, cb) {
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            console.log(msg);
            if(cb) cb();
        }, tempo);
    });
   
}

esperaAi('Frase 1', rdnNum(1, 3), function (){
    esperaAi('Frase 2', rdnNum(1, 3), function () {
        esperaAi('Frase 3', rdnNum(1, 3));
    });
});
*/


