class DispositivoEletronico{
    constructor(nome) {
        this.nome = nome;
        this.ligado = false;
    }

    ligar(){
        if(this.ligado) {
            console.log(this.nome + " já está ligado.")
            return
        };

        this.ligado = true;
        
        console.log(this.nome + " ligado.");
    }

    desligar(){
        if(!this.ligado) {
            console.log(this.nome + " já está desligado.")
            return
        };

        this.ligado = false;
        
        console.log(this.nome + " desligado.");
    }
}
/*
Acima está criado uma class base de exemplo e vamos criar uma
herança com ela abaixo usando o class nome da classe EXTENDS nomeDaClasseASerHerdado

a classe super(nome) vem de SuperClass que é a classe pai
ou seja a dispositiva eletronico usado para puxar o constructor
da classe pai e executar dentro da filha,ou seja, ele está executando 
o construtor do pai com o nome do produto do Smartphone pra ser utilizado no
constructor do pai.

Após caso necessário depois da chamada do super usa o this para apontar
para dentro do super caso necessite alterar algo.
*/
class Smartphone extends DispositivoEletronico{
    constructor(nome, cor, modelo){
        super(nome);

        this.cor = cor;
        this.modelo = modelo;
    }
}

class Tablet extends DispositivoEletronico{
    constructor(nome, cor, modelo, temWifi){
        super(nome);

        this.cor = cor;
        this.modelo = modelo;

        this.temWifi = temWifi;
    }

    ligar(){
        console.log('Olha, você alterou o método ligar.');
    }
}

const s1 = new Smartphone('iPhone', 'Azul', '14 Pro Max');
console.log(s1);

const t1 = new Tablet('iPad', 'Prata', '10th Gen', 'Tem');

t1.ligar();

console.log(t1);