
//try {
//   console.log(naoExisto);
//} catch (err){
//    console.log(`naoExisto ñ existe.`)
//}

function soma (x, y) {
    if (typeof x !== 'number' || typeof y !== 'number'){
      throw new Error("x e y precisam ser números.") ;
    }
    
    return x + y ;
}


try{ 
    console.log(soma(1, 2));
    console.log(soma(`1`,2));
} catch (error){
//    console.log(error);
    console.log('Alguma coisa mais amigavel')
}

//tentar nunca mostrar erros no front para usuario, por
//questão de aparencia e de segurança