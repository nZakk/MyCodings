// defineProperty (singular)
//defineProperties (plural)

function Produto(nome, preco, estoque){
    this.nome = nome;
    this.preco = preco;

    Object.defineProperty(this, "estoque", {
        enumerable: true, 
        //mostra a chave caso true
        //caso false oculta a chava tanto para
        //for in nas chaves quanto em Object.keys
        value: estoque,   
        // valor da chave
        writable: false,  
        //pode ser alterado o valor caso true
        configurable: false  
        // caso false n pode ser nem modificado nem
        //apagado algo chave
    });

    Object.defineProperties(this, {
        nome: {
            enumerable: true,
            value: estoque,
            writable: true,
            configurable: true
        },
        preco: {
            enumerable: true,
            value: preco,
            writable: true,
            configurable: true
        },

    })
}

const p1 = new Produto("Camiseta",20,3);
console.log(p1);