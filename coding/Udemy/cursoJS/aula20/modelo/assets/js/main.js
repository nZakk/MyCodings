const paragrafos = document.querySelector('.paragrafos');
const ps = paragrafos.querySelectorAll('p');

const estilos = getComputedStyle(document.body);
const backgroundColorBody = estilos.backgroundColor;

for (let p of ps) {
    p.style.backgroundColor = backgroundColorBody;
    p.style.color ="#FFFFFF" ;
}