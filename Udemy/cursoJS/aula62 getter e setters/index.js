const _velocidade = Symbol('velocidade');

class Carro {

    constructor(nome, velocidade) {
        this.nome = nome;
        this[_velocidade] = 0;
    }

    set velocidade(valor){
        if (typeof valor !== "number") return;
        if (valor >= 100 || valor <= 0) return;
        this[_velocidade] = valor;
    }
    /*
    Setter ele é utilizado para gerar os valores sendo chamado com o '='
    nesse caso por estarmos protejento a velocidade dentro da classe num
    range de numeros de 0 a 100 o Symbol q e a propriedade privada 
    ai com esse setter sendo chamado ele confirma q o valor inserido está
    no cmapo de validade e se é um numero e altera nossa velocidade privada
    dando assim uma noção que pode mexer diretamente na velocidade mas ela 
    está protegida para erros de inserção de valores inválidos
    */

    get velocidade(){
        return this[_velocidade];
    }
    /*
    Getter utilizado para resgatar um valor
    como nesse getter estamos utilizando ele para ser entregue nossa 
    velocidade privada dentrro do Symbol, a protejendo caso seje 
    alterada fora do codigo por um valor inválido ent caso algum valor seja
    inválido e dps eles usem o .velocidade o getter é ativado e mostra o atual
    valor da velocidade válido
    */

    acelerar() {
        if (this[_velocidade] >= 100) return;
        this[_velocidade]++;
    }

    freiar() {
        if (this[_velocidade] <= 0) return;
        this[_velocidade]++;
    }
}

const c1 = new Carro ("Fusca");

for (let i = 0; i <= 200; i++){
    c1.acelerar();
}

//console.log(c1.velocidade);

//Outro exemplo de getters e setter mais simples

class Pessoa {
    constructor(nome, sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

//    get nomeCompleto(){
//        return this.nome + ' ' + this.sobrenome; 
//    }

    //E esse getter retorna um nome completo a partir do nome e sobrenome


    set nomeCompleto(valor){
        valor = valor.split (' '); 
        
        //split divide o array no q está sendo pedido
            //no caso em ' ' espaços. Dividiu em "Isaac", "Santos" .

        this.nome = valor.shift(); 

        // retirna o peimeiro elemento do array 
        //e retorna eele. Aqui ele retorna "Isaac" como nome.

        this.sobrenome = valor.join(' ');

        // ele concaterna os elementos por um
        // no caso em ' ' espaços ent ele retirou o espaço. Aqui ele Retorna o
        //"Santos" pois estava dps do separador ' ' .

    }

    //nesse caso o setter do nome completo ele seta o nome e sobrenome 
    //a partir de um nome completo
}
 const p1 = new Pessoa ("Isaac", "Santos");
 p1.nomeCompleto = "Isaac Santos"
 console.log(p1.nome);
 console.log(p1.sobrenome);