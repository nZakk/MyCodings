// IIFE -> Immediately invoked function expression
function Escopo(){
    console.log('oi');
}
Escopo();

//isso abaixo é uma IIFE
(function(){
    console.log('oi dnv');
})();