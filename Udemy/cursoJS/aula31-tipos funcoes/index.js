//declaraçaeão de função (function hoisting)
function falaOi(){
    console.log(`oi`);
}

// first-class objects 
//function expression

const souUmDado = function() {
    console.log('sou um dado');
}

//arrow function 
const funcaoArrow = () => {
    console.log('sou um arrow function');
}

// dentro de um objeto
const obj = {
    falar(){
        console.log('eu estou falando...');
    }
}