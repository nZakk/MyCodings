function rdnNum (min, max){
    min *= 1000;
    max *= 1000;
    return Math.floor(Math.random() * (max - min) + min);
 }

function esperaAi(msg, tempo) {
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            if (typeof msg !== 'string') {
            reject ('BAD VALUE');
            return;
            }

            resolve(msg.toUpperCase() + ' - Passei na promise');
        }, tempo);
    });
}

function baixaPagina() {
    const emCache = false;

    if(emCache) {
        return Promise.resolve('Página em cache');
    } else {
        return esperaAi('Baixei a página ', 3000);
    }
}

baixaPagina()
    .then(dadosPagina => {
        console.log(dadosPagina);
    })
    .catch(e => console.log(e));

// Promise.all Promise.race Promise.resolve Promise. reject
/*
const promises = [
    //'Primeiro valor',
    esperaAi('Promise 1', rdnNum(1, 3)),
    esperaAi('Promise 2', rdnNum(1, 3)),
    esperaAi('Promise 3', rdnNum(1, 3)),
    esperaAi(1000, rdnNum(1, 3)),
    //'Outro valor'
];
*/

//promise.all resolve todas as promises mandadas para ele e as 
//restorna em formato de array. caso tenha alguma promisse que caia no reject
//todos as outras são rejeitadas e mandadas para o catch para ser tratadas.

/*
Promise.all(promises).then(function(valor) {
    console.log(valor);
})
*/

/*
promise.race vai pegar e retornar a primeira promise que for resolvida e 
retornar o valor mas mesmo assim ele finaliza de resolver todas as promises
só retornando a mais rápida.
*/
/*
Promise.race(promises).then(function(valor) {
    console.log(valor);
})
.catch(error => {
    console.log(error);
});
*/