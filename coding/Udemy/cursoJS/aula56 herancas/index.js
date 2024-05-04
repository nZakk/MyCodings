// Produto -> aumento, desconto
//Camiseta = cor, caneca = material

function Produto (nome, preco){
    this.nome = nome;
    this.preco = preco;

}

Produto.prototype.aumento = function(quantia){
    this.preco += quantia;
}
Produto.prototype.desconto = function(quantia){
    this.preco -= quantia;
}

/*
Daqui vem o poder da herança pois nesse momento com a camiseta criada podemos tanto 
pegar tudo de Produto com o call, quanto especializar Camiseta ainda mais com coisas
que produto não tem
*/

function Camiseta(nome, preco, cor){
    Produto.call(this, nome, preco);
    this.cor = cor;
}
/*
 o Produto.call() como isso o CALL simula o metodo new chamando e retornando o objeto vazio
 no primeiro temos q passasr o THIS dentro da função mas dentro da função contrutora o this
 vai será oq for criado logo so passar o this  "THIS" (meio confuso eu sei) o resto passa o
 restantes dos argumentos q será preciso na função nesse caso "nome",e "preco" que Produto 
 precisa

 nesse momento as duas já estão linkadas e CAmiseta funcionar exatamente como Produto
 mas com a diferença que o proto dela não terá acesso ao métodos em proto de Produto
*/


Camiseta.prototype = Object.create(Produto.prototype);
Camiseta.prototype.constructor = Camiseta;
/*
linkando o proto de Produto em Camiseta diretamente deixamos passar que o construtor do
proto de Produto é Produto e isso muda também em Camiseta e tbm muda seu construtor,
pois se sobrescreve oq tinha antes de linkarmos o proto 
Camiseta.prototype.constructor = Camiseta;
para Produto então temos que linkar Camiseta denovo ao construtor
*/

Camiseta.prototype.aumento = function(percentual){
    this.preco = this.preco + ((this.preco * percentual)/100);
}

function Caneca(nome, preco, material, estoque){
    Produto.call(this, nome, preco);
    this.material = material;

    Object.defineProperty(this, "estoque", {
        enumerable: true,
        configurable: false,
        get: function() {
            return estoque;
        },
        set: function(valor){
            if(typeof valor !== "number") return;
            estoque = valor;
        }
    })
}


Caneca.prototype = Object.create(Produto.prototype);
Caneca.prototype.constructor = Caneca;

const camiseta = new Camiseta("Regata", 7.5, "Preta");
const caneca = new Caneca("Caneca-de-Flor", 15.25, "Azul-Ciano", 50);

caneca.estoque = 100;
// isso aqui estamos usando o setter

camiseta.aumento(10);

console.log(camiseta);

console.log(caneca);
console.log(caneca.estoque);
//isso aqui estamos utilizando o getter

console.log(Produto);

/*Herança?
O termo "Herança" é muito usado para descrever que as características de um objeto 
são passadas para outro objeto. Assim como uma filha ou filho pode herdar características
 da sua mãe ou pai (geneticamente). Por isso estamos usando esse termo para descrever o 
 comportamento desejado. Além disso, a maioria das literaturas, incluindo as documentações
  (como MDN) citam a palavra herança.

Vamos continuar usando o termo "Herança" até o final do curso, porém, Javascript não 
é uma linguagem que apresenta essa característica em específico, portanto não existe 
"herança" aqui. O que ocorre, na verdade, é "delegação". Esse seria o termo mais correto 
para descrever "Herança" em JS.

Quando fazemos algo como:

function Produto(nome, preco) {
  this.nome = nome;
  this.preco = preco;
}
 
Produto.prototype.aumento = function (quantia) {
  this.preco += quantia;
};
 
function Camiseta(nome, preco, cor) {
  Produto.call(this, nome, preco);
  this.cor = cor;
}
Camiseta.prototype = Object.create(Produto.prototype);
Camiseta.prototype.constructor = Camiseta;
Mais especificamente no trecho:

Camiseta.prototype = Object.create(Produto.prototype);
Estamos, claramente, falando que o Camiseta.prototype 
é um novo objeto vazio que tem como protótipo Produto.prototype.
 Dessa forma, estamos adicionando Camiseta.prototype na cadeia de protótipos de Produto. 
 Por consequência, tudo o que não existir em Camiseta nem em Camiseta.prototype 
 será delegado para Produto.prototype (e assim por diante até chegar no topo da cadeia de
protótipos). Por isso vejo o termo delegação como mais adequado para este 
comportamento.

Novamente, vamos continuar usando o termo "Herança", 
mas achei que seria interessante que você soubesse disso neste momento. */
