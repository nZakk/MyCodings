
/*
O polimorfismo é um método de de um pai na herança dos protos
intereagir de um jeito com um dos filhos e ser alterado o
o comportamento com outro filho
*/

//Superclass

function Conta(agencia, conta, saldo){
this.agencia = agencia;
this.conta =  conta;
this.saldo = saldo;
}

Conta.prototype.sacar = function (valor) {
    if (this.saldo < valor) {
        console.log(`SALDO INSUFICIENTE. Saldo atual: R$${this.saldo.toFixed(2)}`)
        return 
    }

    this.saldo -= valor;
    this.verSaldo();
};

Conta.prototype.depositar = function (valor) {
    this.saldo += valor;
    this.verSaldo();
};

Conta.prototype.verSaldo = function () {
    console.log(`Ag./c: ${this.agencia}/${this.conta} Saldo: R$${this.saldo.toFixed(2)}`)
};

const conta1 = new Conta(11, 22, 10);
/*
Aqui criamos um CONSTRUCTION para o moedelo de uma conta bancária 
padrão com os métodos de sacar, depositar e visualizar o saldo
*/

function ContaCorrente(agencia, conta, saldo, limite){
    Conta.call(this, agencia, conta, saldo);
    this.limite = limite;
};
ContaCorrente.prototype = Object.create(Conta.prototype);
ContaCorrente.constructor = ContaCorrente;
/*
Aqui estamos criando uma nova CONSTRUCTION herdando os arguments da
CONTA padrão e também linkando o proto para ser utilizados os mesmos 
métodos e também setando seu CONSTRUTOR para ela mesmo(lembrando q quando se linka
    os protos o filho tbm herda o construtor do pai por isso setamos de volta o construtor
    para ela mesma)
*/

ContaCorrente.prototype.sacar = function (valor) {
    if ((this.saldo + this.limite) < valor) {
        console.log(`SALDO INSUFICIENTE. Saldo atual: R$${this.saldo.toFixed(2)}`)
        return 
    }

    this.saldo -= valor;
    this.verSaldo();
};

/*
Aqui modificamos o método valor para nossas exigências por ser uma poupança
ela tem um limite q pode ser sacado junto ao saldo
*/

function ContaPoupanca(agencia, conta, saldo){
    Conta.call(this, agencia, conta, saldo);
};
ContaPoupanca.prototype = Object.create(Conta.prototype);
ContaPoupanca.constructor = ContaPoupanca;

const cc = new ContaCorrente(11, 22, 0, 100);
cc.depositar(10);
cc.sacar(110);
cc.sacar(1);

console.log();
const cp = new ContaPoupanca(10, 21, 0, 100);
cp.depositar(10);
cp.sacar(110);
cp.sacar(1);