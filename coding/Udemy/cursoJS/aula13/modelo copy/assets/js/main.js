
const h1 = document.querySelector(`.container h1`);

const date = new Date();

function zeroAEsquerda (num){
    return num >= 10 ? num :`0${num}`;
}

function getDayWeek(date) {
    const dayWeek = date.getDay(date);
    let dayWeekText;

    switch (dayWeek) {
        case 0:
            return (dayWeekText = 'Domingo');
        case 1:
            return (dayWeekText = 'Segunda-Feira');
        case 2:
            return (dayWeekText = 'Terça-Feira');
        case 3:
            return (dayWeekText = 'Quarta-Feira');
        case 4:
            return (dayWeekText = 'Quinta-Feira');
        case 5:
            return (dayWeekText = 'Sexta-Feira');
        case 6:
            return (dayWeekText = 'Sábado');
    }
}

function getMonth(date) {
    const month = date.getMonth(date);
    let monthText;

    switch (month) {
        case 0:
            return (monthText = 'Janeiro');
        case 1:
            return (monthText = 'Fevereiro');
        case 2:
            return (monthText = 'Março');
        case 3:
            return (monthText = 'Abril');
        case 4:
            return (monthText = 'Maio');
        case 5:
            return (monthText = 'Junho');
        case 6:
            return (monthText = 'Julho');
        case 7:
            return (monthText = 'Agosto');
        case 8:
            return (monthText = 'Setembro');
        case 9:
            return (monthText = 'Outubro');
        case 10:
            return (monthText = 'Novembro');
        case 11:
            return (monthText = 'Dezembro');
    }

}
function formatDate(date) {

    const dayWeekText = getDayWeek(date);
    const exactDay = date.getDate(date);
    const monthText = getMonth(date);
    const year = date.getFullYear(date);
    const hours = date.getHours(date);
    const minutes = date.getMinutes(date);



    return (`${dayWeekText}, ${exactDay} de ${monthText} de ${year}`
    +` ${zeroAEsquerda(hours)}:${zeroAEsquerda(minutes)}`)
}
h1.innerHTML = formatDate(date);

