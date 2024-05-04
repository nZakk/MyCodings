function recursiva (max) {
    console.log(max);
    if(max >= 10000) return; 
    max++
    recursiva(max);
}

recursiva(0);

// funcao recursiva uma funcao q se chama
//se comporta como uma loop pode ser usado
//com diversar logicas dependendo do seu proposito
//parece mais maleavel q as FOR LOOP
//IMPORTANTE a recursividade tende a ter um limite
//dependen de quantas recursividade vc está executando
