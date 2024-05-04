//import { nome, sobrenome, idade, soma, Pessoa } from './modulo1';
//import * as MyModule from './modulo1';
// o * significa importa tudo do modulo em um objeto caso tenha a tag export
import padrao, { nome as n, sobrenome, idade, soma} from './modulo1'
//quando importamos sem as chaves vem o default do modulo que pode ser somente um



//const p1 = new Pessoa ('Raquel', 'Melo');

console.log(n, sobrenome, idade);
console.log(soma(5, 7));
//console.log(MyModule);
//console.log(p1);
console.log(padrao(5, 5));