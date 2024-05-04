function Produto(nome, preco, estoque){
    this.nome = nome;
    this.preco = preco;

    //tomar cuidado para não gerar loops quando 
    //usar setter e getter exemplo:
    //digamos q coloquei o this.estoque no setter
    //isso fario o programa ficar se chamando para
    // settar o estoque com o atributp
    //então jogamos numa variavel o atributo
    //então caso for mexer com propriedades do objeto
    //dentro dos setter e getter coloque numa 
    //variavel privada

    let estoquePrivado = estoque;
    Object.defineProperty(this, "estoque", {
        enumerable: true, 
        configurable: true,
        get: function(){
            return estoquePrivado;
        },
        set: function(valor){
            if (typeof valor !== 'number'){
                throw new TypeError("NaN");
            }
            estoquePrivado = valor;
        }
    });
}

function criaProduto(nome){
    return {
        get nome(){
            return nome;
        },
        set nome(valor){
            valor = valor.replace('coisa.', '');
            nome = valor;
        }
    };
}

//const p1 = new Produto("Camiseta", 20, 3);
//console.log(p1);
//p1.estoque = "olas";
//console.log(p1.estoque);

const p2 =criaProduto("Camiseta");
p2.nome = "Qualquer coisa."
console.log(p2.nome);
