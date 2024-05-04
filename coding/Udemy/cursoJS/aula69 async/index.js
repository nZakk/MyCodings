function rdnNum (min = 0, max = 3){
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

/*
esperaAi('fase 1', rdnNum(0, 3))
 .then(valor => {
    console.log(valor);
    return esperaAi('fase 2', rdnNum(0, 3))
})
.then(fase => {
    console.log(fase);
    return esperaAi('fase 3', rdnNum(0, 3))
})
.then(fase => {
    console.log(fase);
})
.catch(e => console.log(e));
*/

async function executa(){
    try {
    const fase1 = await esperaAi('fase 1', rdnNum(0, 3));
    console.log(fase1);

    const fase2 = await esperaAi(3, rdnNum(0, 3));
    console.log(fase2);

    const fase3 = await esperaAi('fase 3', rdnNum(0, 3));
    console.log(fase3);

    console.log('terminamos a fase: ', fase3);
    } catch(e) {
        console.log(e);
    }
}

executa();