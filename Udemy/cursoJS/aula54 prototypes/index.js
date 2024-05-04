/*
JS é baseado em protótipos para passar propriedades e métodos de um
objeto ao outro.

Definição de protótipo
Prótotipo é o termo usado para se referir ao que foi criado pela primeira
vez, servindo de modelo ou molde para futuras produções.

Todos os objetos tem uma refeêrencia interna para um prótotipo (__proto__)
que vem da propriedade prototype da função construtora que foi usada para
criá-lo. Quando tentamos acessar um membro de um objeto, primeiro o motor
do JS vai tentar encontrar este membro no próprio objeto e depois na cadeia
de prótotipos é usada até o topo (null) até encontrar (ou não) tal membro.
*/

/* o (__proto__) é uma propriedade prototype que já e criada e intanciada junto
o objeto criando a partir da construtora, o JS já faz essa atribuição automaticamente
digamos em rasas palavras que é um lugar que a gente joga métodos ou informações
que serão acessadas por todos os objedos criados a partir daquele contrutor 
sem q seja criado a mão o metódo em cada um deles assim otimizando o espaço da aplicação.

*/

// Construtora se parece com um molde (classes)

function Pessoa(nome, sobrenome){
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.nomeCompleto = () => this.nome + ' ' + this.sobrenome;
}

//Instância é a ação de criar novos objetos
const pessoa1 = new Pessoa("Isaac", 'S.');

const data = new Date();

console.log(pessoa1);
console.log(data);