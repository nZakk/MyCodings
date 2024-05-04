const path = require('path');
const arquiveRoot = path.resolve(__dirname, 'test.json');
const write = require('./modules/write');
const read = require('./modules/read');

/*
const pessoas = [
    {nome : "Joao"},
    {nome : "maria"},
    {nome : "cleber"},
    {nome : "Joao II"}
];

const json = JSON.stringify(pessoas, '', 2);

write(arquiveRoot, json);
*/

async function readDocument(path){
    const data = await read(path);
    renderData(data);
}

function renderData(data){
    data = JSON.parse(data);
    data.forEach(val => console.log(val.nome))
}

readDocument(arquiveRoot);