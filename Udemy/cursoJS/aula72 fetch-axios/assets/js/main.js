//fetch('pessoas.json').then(response => response.json())
//.then(json => carregaElementosNaPagina(json));

axios('pessoas.json')
.then(response => carregaElementosNaPagina(response.data));

let carregaElementosNaPagina = (json) => {
  const table = document.createElement('table');
 for(let pessoa of json) {
  const tr = document.createElement('tr');

  let td = document.createElement('td');
  td.innerHTML = pessoa.nome;
  tr.appendChild(td);

  td = document.createElement('td');
  td.innerHTML = pessoa.idade;
  tr.appendChild(td);

  td = document.createElement('td');
  td.innerHTML = 'R$ ' + pessoa.salario + ',00';
  tr.appendChild(td);

  table.appendChild(tr);
 }

 const resultado = document.querySelector('.resultado');
 resultado.appendChild(table);
}

