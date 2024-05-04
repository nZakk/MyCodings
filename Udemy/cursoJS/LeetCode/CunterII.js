var createCounter = function(init) {
    let num1 = init;
    return {
        increment: () => {
            return num1 =+ 1;
        },
        decrement: () =>{
            return num1 =- 1;
        },
        reset: ()=>{
            return num1;
        }
    }
};

const counter = createCounter(5);
console.log(counter.increment());