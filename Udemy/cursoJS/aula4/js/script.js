const numero = Number(prompt(`Digite um número`));
const numeroTitulo = document.getElementById(`numero-titulo`);
const texto = document.getElementById(`txt`);

numeroTitulo.innerHTML =  numero;
texto.innerHTML =  `<p>Raiz quadrada: <strong>${numero ** 0.5}</p>`
texto.innerHTML +=`<p><strong>${numero}</strong> é inteiro?: <strong>${Number.isInteger(numero)}</strong></p>`
texto.innerHTML +=`<p>É NaN?: <strong>${Number.isNaN(numero)}</strong> </p>`
texto.innerHTML +=`<p>Areedondando para baixo: <strong>${Math.floor(numero)}</strong></p>`
texto.innerHTML +=`<p>Arredondando para cima: <strong>${Math.ceil(numero)}</strong></p>`
texto.innerHTML +=`<p>Com duas casas decimais: <strong>${numero.toFixed(2)}</strong></p>`

                 