const relogio = document.querySelector(`.relogio`);
const iniciar = document.querySelector(`.iniciar`);
const pausar = document.querySelector(`.pausar`);
const zerar = document.querySelector(`.zerar`);

let tempo = 0;
let timer;
let segundos;
let minutos;
let horas;

function converter(tempo) {
    segundos = zeroAEsquerda(tempo % 60);
    minutos = zeroAEsquerda(Math.floor(tempo / 60));
    horas = zeroAEsquerda(Math.floor(tempo / 360));
}

function zeroAEsquerda(num) {
    return num >= 10 ? num : `0${num}`;
}

function insert(horas, minutos, segundos) {
    relogio.innerHTML = `${horas}:${minutos}:${segundos}`;
}

iniciar.addEventListener(`click`, function (event) {
    relogio.style.color = `#000`;
    clearInterval(timer);
    timer = setInterval(function () {
        tempo++;
        converter(tempo);
        insert(horas, minutos, segundos);
    }, 1000);
});
pausar.addEventListener(`click`, function (event) {
    relogio.style.color = `#F00`;
    clearInterval(timer);
});
zerar.addEventListener(`click`, function (event) {
    relogio.style.color = `#000`;
    tempo = 0;
    clearInterval(timer);
    converter(tempo);
    insert(horas, minutos, segundos);
});