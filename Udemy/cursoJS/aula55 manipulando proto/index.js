//new Object -> Object.prototype

const objA = {
    chaveA: "A"
    // __proto__:Object.prototype
};

const objB = {
    chaveA: "B"
    // __proto__:objA
};

const objC = new Object();
objC.chaveC = "C";
// __proto__:objB


Object.setPrototypeOf(objB, objA);

Object.setPrototypeOf(objC, objB);
//com essa Function altera o prototype de um objeto
// ai a cadeia do ObjB fica 
//objB->objA->Object.prototype

function Produto(nome, preco){
    this.nome = nome;
    this.preco = preco;
}

Produto.prototype.desconto = function(percentual){
    this.preco = this.preco - ((this.preco * percentual)/100);
}

Produto.prototype.aumento = function(percentual){
    this.preco = this.preco + ((this.preco * percentual)/100);
}

const p1 = new Produto("caneca", 10);

//Literal
const p2 ={
    nome: "camisa",
    preco: 100
};

//já que o método de manipular o preço está no proto da construtora Produto podemos
//setar o proto desse obj literal para o da contrutora Produto para termos acesso 
//aos métodos

Object.setPrototypeOf(p2, Produto.prototype)

p1.desconto(10);
p2.aumento(25);

/* com o Object.create(PaiDoObj, {
    chaves,valores e etc
}) o primeiro valor inseris seria o "pai" no caso setando o porotype q ele
herdará e o segundo valor seria o objeto em si canso queria confugurar ou 
inserir valores manualmente
*/
const p3 = Object.create(Produto.prototype, {
    preco:{
        writable: true,
        configurable: true,
        enumerable: true,
        value: 42
    },
    tamanho:{
        writable: true,
        configurable: true,
        enumerable: true,
        value: 40
    },
});

p3.aumento(10);

console.log(p1);
console.log(p2);
console.log(p3);