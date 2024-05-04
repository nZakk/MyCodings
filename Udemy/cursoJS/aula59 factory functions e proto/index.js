/*
A vantagem do proto em facroty functions mesmo sendo um pouco
mais verbosa é poder na hora q está colocando os valores por ser
uma chave ja pode-se também configurar o objeto sendo enumerable
writeble etc...
*/

const falar = {
    falar() {
        console.log(`${this.nome} está falando`);
    }
}

const beber = {
    beber() {
        console.log(`${this.nome} está bebendo`);
    },    
}

const comer = {
    comer() {
        console.log(`${this.nome} está comendo`);
    },    
}

/*
Nesse modelo criamos cada método em sua própria constante e dps usamos o
Object.assign para fazer a cópia dele para o pessoaPrototype q está linkada para 
ser o proto da function factory
assim qualquer mudança na constante já se reflete no método diretamente

No assign peimeiro colocamos o alvo q é um objeto vazio e dps oq será copiado para
o alvo

Também podemos usar o spread nesse caso
*/

const pessoaPrototype = Object.assign({}, falar, comer, beber);
/*
Do jeito q estava anteriormente com o pessoaPrototype dentro da função acoplado nle
por preferencia do professor ele mostrou como desacoplar e criar os métodos separados
e que tbm podem ser reutilizados n só por essa factory mas como qualquer outra parte do código

*/
function criaPessoa(nome, sobrenome){

    /*
    Na factory funtions o proto necessita ser criado a mão e ser linakdo
    objeto para ser manipuladoos métodos
    */

    return Object.create(pessoaPrototype, {
        nome: {value: nome},
        sobrenome: {value: sobrenome},

    });
}

const p1 = criaPessoa('Isaac','Santos');

console.log(p1);