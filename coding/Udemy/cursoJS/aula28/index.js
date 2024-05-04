function mostrarHora(){
    let data = new Date();

    return data.toLocaleTimeString(`pt-BR`, {});
}

const timer = setInterval(function(){
    console.log(mostrarHora());
}, 1000 ); // primeiro parametro referencia da função sem () e 
           // o segundo é o intervalo de tempo em ms

setTimeout(function(){
    clearInterval(timer);
},3000);
setTimeout(function(){
    clearInterval(timer);
    console.log(`Olá mundo!`)
},5000);