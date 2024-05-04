/*
Classes em JS se comporta bastante como uma construction function
se cria com o class e o nome dela começando com letra maiúscula
e para a inserção de dados na classe utilizamos o metodo CONSTRUCTOR
que já é nativa da classe, que, basicamente pega os dados recebidos como
argumentos mesma maneira da construtor.

Outro ponto das classes é o fato de qualquer outro método feito dentro dela
já se comporta sendofeita no proto, sem toda aquela burócracia de cria um 
proto, linkar esse proto e mudar a contructor
*/

class Pessoa {
    constructor (nome, sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    falar (){
        console.log(`${this.nome} está falando`);
    }

    beber (){
        console.log(`${this.nome} está bebendo`);  
    }

    comer (){
        console.log(`${this.nome} está comendo`);   
    }
}

// Exemplo de constructor para comparação

function Pessoa2(nome, sobrenome){
    this.nome = nome;
    this.sobrenome = sobrenome;
}

Pessoa2.prototype.falar = function(){
    console.log(`${this.nome} está falando`);
};

Pessoa2.prototype.beber = function(){
    console.log(`${this.nome} está bebendo`); 
};

Pessoa2.prototype.comer = function(){
    console.log(`${this.nome} está comendo`); 
};

const p1 = new Pessoa('Isaac',"Santos")