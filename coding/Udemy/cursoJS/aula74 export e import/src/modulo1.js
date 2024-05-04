const nome= 'Isaac';
const sobrenome = 'Santos';
const idade = 19;
//export const nome= 'Isaac';
//export const sobrenome = 'Santos';
//export const idade = 19;
//outra forma de já exportar qna inicialização da varivel

//const segredo = "sshhh";
//caso sem export mesmo no import * isso n será enviado


function soma(x, y) {
    return x + y;
}
export default (x, y) => x * y;

export {nome, sobrenome, idade, soma}

/*
export class Pessoa {
    constructor (nome, sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
}
*/