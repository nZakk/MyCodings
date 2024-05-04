// funcao construtora -> objetos
// Funçao fabrica fabrica -> objetos
//Construtora -> Pessoa (new) {inicial o camel case com maiuscula}

function Pessoa (nome,sobrenome){
// atribrutos ou metodos privadas so disponiveis dentro do corpo

const ID=987;
const metodoInterno = function(){

};
// atributos ou metodos publicos disponiveis fora do corpo
    this.nome= nome;
    this.sobrenome = sobrenome;

    this.metodo = function() {
        console.log(this.nome + ': sou uma pessoa');
    };
}

const p1 = new Pessoa('luiz','miranda');

console.log(p1);