// literal de uma string ''  "" ~~
//literal de array []
//literal de obj {}

const pessoa = {
    nome: "Isaac",
    sobrenome: 'Santos'
}

const pessoa2 = new Object();
pessoa2.nome = 'Raquel';
pessoa2.sobrenome = "Melo";

//Ambas da forma literal ou da contrutora são utilizadas
//a construtora por ser um pouco mais verboza e um pouco menos
//intuitiva acaba sendo usada menos
//mas existem o caso onde ela irá ser útil

//const chave = 'sobrenome';

//delete pessoa.nome;

//console.log(pessoa.nome);
//console.log(pessoa[chave]);

//console.log(pessoa2.nome);
//console.log(pessoa2[chave]);

//Como no exemplo acima vemos q tbm pode se usar uma constante 
//quando hipoteticamente iremos puxar a KEY no OBJ por exemplo
// de um banco de danos ent onde seria colocado a KEY como n sabemos
// colocamos entre colchetes sem aspas o nome da constante
//e nessa constante puxamos a key do banco de dados ou de onde for
//usado dessa forma como n sabemos de ante mão o nome da KEY

//também é mostrados as formas de acessar as chaves ou pelo nomeDoObj."nomeDaKey"
//ou nomeDoObj["nomeDaKey"]

pessoa2.idade = 18;

pessoa2.falarNome = function() {
    return (`${this.nome} está falando oi`);
}
pessoa2.getNascimento = function(){
    const date = new Date();
    return date.getFullYear() - this.idade;
}

//console.log(pessoa2.falarNome(), pessoa2.getNascimento());

//com os exemplos acima vemos que também podemos usar functions
//no objeto que são chamados de métodos são úteis pois podemos 
//utilizalos para obter dados manipulando os dados já existentes
//no objeto  usando o THIS dentro da função que é usado para apontar
//para o próprio objeto e nõo colocando seu nome em vez de 
// pessoa2.nome isso é utilizado só fora do objeto
//se utiliza this.nome dentro do objetos para se referir
//a dados em outras chaves que deseja buscar 

//-FOR IN

//for (let chave in pessoa2){
//    console.log(chave);
//}

// factory function - constructor functions
//ajudam qunado necessário criação de inumeros objetos
//agilizam o processo de ter q fazer no literal uma por uma 


//a diferenças sao sutís dos dois tipos mas o proprio JS
//muda certos comportamentos por traz dos panos 
//entre constructor e factory functions

//exemplo de factory function 
//function criaPessoa(nome, sobrenome){
//    return {
//        nome,
//        sobrenome,
//        get nomeCompleto(){
//            return `${this.nome} ${this.sobrenome}`
//        }
//    };
//}

//esse é um metodo GET usado mas ainda n explicado a fundo
//mas pode ser usado pra usar os dados pra certos coisas
//professor so falou por cima ainda
//mas pelo oq eu vi quando for usar o metedo ele n necessita os 
//parenteses como uma função na hora de ser chamado

//const p1 = criaPessoa("Isaac", "Santos");
//console.log(p1.nomeCompleto);

//exemplo de contruction function
//A primeira diferente já é na syntax onde n precisa usar
//nome como "cria" só o nome 
function Pessoa(nome, sobrenome){
    this.nome = nome,
    this.sobrenome = sobrenome;

    Object.freeze(this);
    //com o FREEZE no this dentro do constructor do objeto
    //ele impede qualquer alteração no THIS e como o THIS
    //serão todos os objetos criados agora todo objeto criado
    //será impedido de ser alterado ou modificado seus valores

}

//com construtoras colocar o new na frente so construtor
//nesse caso Pessoa
//a palavra new vai criar uma objeto vazio
//e atrela a palavra THIS ao objeto por ser uma contrutora
//vai criar diferentees pessoas em diferentes objetos 
//e posteriormente retornando o objeto
const p1 = new Pessoa('Isaac', 'Santos');

//Object.freeze(p1);
//o FREEZE impede qualquer alteração no objeto 
//nÃo retorna erro nem nd mas só impede a modificação
//(também funciona com arrays)

p1.nome = "Raquel";
console.log(p1);
//CONST e LET basicamente eles são referencias na memorias para
//determinado valor e o CONST limita essa troca de endereço da memoria
//enquanto o LET não, mas para um objeto que está sendo referenciado
//em CONST não se altera o endereço mas o valor q está no endereço
//então pode sim alterar os valores, fazer mudanças em valores
//dentro dos objetos em CONST mas n alterar o objeto em si exemplo
//trocalo pra um array ou outro valor literal