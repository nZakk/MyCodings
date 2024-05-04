class ControleRemoto {
    constructor(tv){
        this.tv = tv;
        this.volume = 0;
    }
//  Método de instância

    aumentarVolume() {
       this.volume += 2;
    }
     diminuirVolume() {
       this.volume -= 2;
    }

//  Método de estático
/*
O método estático está ligado a classe e não na instância da classe, ou seja,
n tem acesso ao dados da instância mas o this desse método é a classe em si
e não o objeto global, vai ser utíl no futuro pois pode ter mais utilidades
q fazer uma função externa e executar dentro da classe pelo fato do this.

A causa de não ter acesso ao dados pois pelo método static a gente não
usa o new então não se tem acesso ao constructor pois ele não foi inicializado

*/
    static soma(x, y){
        return x + y;
    }
    
}

const controle = new ControleRemoto('Sony');

controle.aumentarVolume();

controle.aumentarVolume();

controle.aumentarVolume();

console.log(controle);

console.log(ControleRemoto.soma(2, 4));
