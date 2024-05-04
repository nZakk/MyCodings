//const m1 =  require('./mod1');
//console.log(mod1);
//console.log(mod1.print());

//diferente do es6 modulos Node importamos com um require,
//normaly in a const variable, becaus you dont want change your moduls very often


//const print =  require('./mod1').print;
//console.log(print());

//this way you can export just what you need from that module

//const { name, lastName, print } = require('./mod1');
//console.log(name, lastName, print());

//this method, becaus it's a Obj you can use Destructuring assingment to
//get the exports in differents vars

const path = require ('path');
const axios = require('axios');

/*
to call other packages from node modules that they like path it's from base node
or packages you that you use npm to install it you dont need to give the full file
address,  just the name os the packages
*/
const { People } = require('./mod1');

const p1 = new People('Isaac');
console.log(p1);


