//const name = 'Isaac';
//const lastName = 'Santos'

//const print = () => name + ' ' + lastName


//module.exports.name = name;
//module.exports.lastName = lastName;
//module.exports.print = print;
/*
exports.name = name;
exports.lastName = lastName;
exports.print = print;
this.anything = 'anything to export'
*/

//não muito usado mas o .This nesse contexo se refere ao obj do module

// exports sendo uma refência para module.exports

//console.log(module.exports)

/*ferramente do node que é um Object module do node.

console.log(modules);

 o .exports também sendo um Object que tudo inserido nele será exportado e podendo
 ser usado em outra implementação*/

class People {
    constructor(name){
        this.name = name;
    }
}

exports.People = People; 