try {
    //console.log(a);
    console.log(`Abri um arquivo`);
    console.log(`Manipulei o arquivo e gerou um erro`);
    console.log(`Fechei o arquivo`);
    // É executada quando n há erros
} catch (E) {
    console.log(`Tratando o erro`);
    // É executada quando há erros
} finally {
    console.log(`FInally:  Eu sempre sou executado`)
    // Sempre é executado
}