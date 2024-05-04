// 705.484.450-52 070.987.720.03

/*
7x  0x 5x 4x 8x 4x 4x 5x 0x
10  9  8  7  6  5  4  3  2 
70  0  40 28 48 20 16 15 0 = 237

11 - (237 % 11) = 5 (Primeiro dígito)
se o digito for maior q 9 consideramos 0

7x  0x 5x 4x 8x 4x 4x 5x 0x 5x
11  10 9  8  7  6  5  4  3  2
77  0  45 32 56 24 20 20 0 10 = 284
se o digito for maior q 9 consideramos 0

11 - (284 % 11) = 2 (Segundo dígito)
*/

//let cpf = "070.987.720-03";
let cpf = "708.611.201.16";

function verificaCpf(cpf) {
    let cpfLimpo = cpf.replace(/\D+/g, '');
    cpfArray = Array.from(cpfLimpo);

    corpoCpf = cpfArray.filter((valor, indice) => indice < (cpfArray.length - 2));

    firstDigit = 11 - ((corpoCpf.reduce((ac, val, indice) =>
        ac + (Number(val) * (10 - indice)), 0
    )) % 11);

    if (firstDigit > 9) {
        if (cpfArray[cpfArray.length - 2] === "0") {
            corpoCpf.push('0');
        };
    } else if (String(firstDigit) === cpfArray[cpfArray.length - 2]) {
        corpoCpf.push(String(firstDigit));
    } else { return console.log(false) };

    secondDigit = 11 - ((corpoCpf.reduce((ac, val, indice) =>
        ac + (Number(val) * (11 - indice)), 0
    )) % 11);

    if (secondDigit > 9) {
        if (cpfArray[cpfArray.length - 1] === "0") {
            corpoCpf.push('0');
            return console.log(true);
        };
    } else if (String(secondDigit) === cpfArray[cpfArray.length - 1]) {
        corpoCpf.push(String(secondDigit));
        return console.log(true);

    } else { return console.log(false) };
}

verificaCpf(cpf);