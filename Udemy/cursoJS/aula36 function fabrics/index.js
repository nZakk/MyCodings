//function fabric
//function constructor

function criaPessoa(nome,sobrenome,altura,peso) {
    return{
        nome,
        sobrenome,
        //getter
        get nomecompleto(){
            return `${this.nome} ${this.sobrenome}`
        },
        //setter
        set nomecompleto(valor){
            valor = valor.split(' '); 
            this.nome = valor.shift();
            this.sobrenome = valor.join(' ');
            //shift tira um valor do ccomeço do array, ao contrario do pop

        },
        fala(assunto = 'falando sobre nada...'){
            return `${this.nome} está ${assunto}.`
        },
        altura,
        peso,

        //getter qunado se quer só opter um valor
        get imc(){
            const indice = this.peso / (this.altura ** 2);
            return indice.toFixed(2);
        }
    }
}

const p1 = criaPessoa('Isaac','Santos',1.75,75);

const p2 = criaPessoa('shae','gregorio',1.75,75);

const p3 = criaPessoa('vic','Santos',1.75,75);

console.log(p1.imc,p1.nome,p1.sobrenome,p1.fala());
console.log(p2.imc,p2.nome,p2.sobrenome,p2.fala());
console.log(p3.imc,p3.nome,p3.sobrenome,p3.fala());