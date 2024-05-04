function* geradora1() {
// codigo ...
    yield 'Valor 1';
// codigo ...
    yield 'Valor 2';
// codigo ...
    yield 'Valor 3';
}

const g1 = geradora1();


function* gerador2 () {
    let i = 0;
    while(true){
        yield i;
        i++;
    }
}

const g2 = gerador2();

function* gerador3 () {
    yield 0;
    yield 1;
    yield 2;
}
function* gerador4(){
    yield* gerador3();
    yield 3;
    yield 4;
    yield 5;
}
//com o YIELD* ele delega tarefas a outras funcoes geradores
//a geradora 4 esta pegando o trbalho da geradora 3 e continuando



const g4 = gerador4();

function* gerador5 (){
    yield function(){
        console.log("vim do y1");
    }

    return function(){
        console.log("vim do return");
    }

//o RETURN dentro das function geradores tem o papel 
//acabar ela no ato ela retorna e qualquer codigo depois se torna
//inacansável

    yield function(){
        console.log("vim do y2");
    }
}

const g5 = gerador5();

const func1 = g5.next().value;
const func2 = g5.next().value;
const func3 = g5.next().value;

func1();
func2();
func3();
