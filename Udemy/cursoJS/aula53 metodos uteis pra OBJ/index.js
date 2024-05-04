/*
Object.values(obj)(retorna os valores do objetos em um array)
Object.entries(obj)(retorna a chaves e os valores cada uma em um array)
Object.assign(target, source)(usado para copiar e insesir dados no objeto
    geralmente usado para copiar objetos)
Object.getOwnPropertyDescriptor(obj, "prop")(descreve as propriedades do objeto)
... (SPREAD)

//Já vimos
Object.keys(retorna as chaves do objeto num array)
Object.freeze(congela o estado do objeto)
Object.defineProperties(define várias propriedades)
Object.defineProperty(define uma propriedade)
*/

//const produto = {nome:"produto" , preco: 1.8};
/*
const caneca = {
    ...produto,
    material: "porcelana"
};
*/
//const caneca =Object.assign({}, produto , {material: "porcelana"});
/*Object.assign ele funciona para copia dos dados em um objeto
ele funciona n o primeiro parametro sendo o alvo do metodo e o segundo 
parametro sendo a fonte dos dados podendos ser manipulados usando o que
já sabemos para a tranferencias de valores.Possa ser também que seja só um valor 
então apos o alvo a fonte dos dados pode ser um objeto completo e também
acompanhado por mais objetos serem inseridos
 */
/*
caneca.nome = "Caneca";
console.log(produto);
console.log(caneca);
*/

const produto = {nome:"Produto", preco: 1};
console.log(Object.getOwnPropertyDescriptor(produto, 'nome'));

/*
for (let [chave,valor] of Object.entries(produto)){
    console.log(chave,valor);
}
podemos fazer descontruir a função ja de cara n lmebro oq era
 :l
 pela desestruturação ja que estamos criando um array
 com chave e valor do OBject.entries que já retorna esses valores com as chaves
 com os mesmos nomes eles cria a variavel pela destruturação

 let numeros = {a: 1 , b: 2, c: {valor 1: 10, valor2: 20}};
 exemplo const {a, b} = numeros;

 assim por essa assimilação pela destruturação cria si a partir do obj
 já q puxamos pelo mesmo nome das chaves duas constantes cada uma com mesmo 
 valor que tem dentro do obj

 exemplo const {a = 'valor padrão', b} = numeros;
 se no moemnto da destruturação vc jogar um valor na que pretente extrair
 esse valor se comportará como um valor padrão caso o seu alvo não tenha uma 
 variável com aquele mesmo nome retornará o valor padrão inserido


 caso precise trocar o nome dele pela destruturação basta no ato de 
 destruturar fazer const {a: num1, b}=numeros;
 agora a constante q será criada com o valor de a do obj se chamara num1

 caso queira puxar valores do obj que seja uma objeto tbm similar como o trocar o nome 
 da constante criada faz const{c: {valor1, valor2}, c} = numeros;
 agr serão criadas duas novas constantes cada uma com o valor1 e valor2 respectivamente

 colocando so o nome do obj consegue extrair o obj completo para se tornar
um objeto independente

algo para se levar em conra é que caso a quantidade de variveis q está criando
na hora da destruturação se 
let numeros = {a: 1 , b: 2, c: 3};
 exemplo const {a} = numeros;
 será criando somento uma varivel a partir desse destruturaçào
 caso  queira uma valor no meio pode tbm usar as virgular para pular certos valores
 const {,,c} = numeros;
 que seria extraido somente o valor c
 e também para refrescar a memória usar o rest para tacar o resto numa so variavel
 const {a, ...resto} = numeros;
 ai sera criado a varivel "a" e a resto com os valores de b e c
 */

for (let entry of Object.entries(produto)){
    console.log(entry[0],entry[1]);
}
