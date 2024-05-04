import './assets/css/style.css';
import GeraChars from './modules/GeraChars'

const geradorChars = new GeraChars;

let qtdChar;
const numCharInput = addEventListener('input', function(){
    let numChar = this.document.querySelector(".number-char")
    qtdChar = numChar.valueAsNumber;

    if (qtdChar > 20){qtd = 20}
})

const numberCheckBox = document.querySelector(".add-number");
const upperCaseCheckBox = document.querySelector(".add-uppercase");
const lowerCaseCheckBox = document.querySelector(".add-lowercase");
const specialCheckBox = document.querySelector(".add-special");


const btn = document.querySelector(".btn")
btn.addEventListener("click", gerarSenha);


const campoSenha = document.querySelector(".genereted-password");

function gerarSenha () {
    let senha = "";

    if (!numberCheckBox.checked && 
        !upperCaseCheckBox.checked && 
        !lowerCaseCheckBox.checked && 
        !specialCheckBox.check) {
            return ""
        }
        
    for (let currQtd = 0; currQtd < qtdChar; currQtd++) {
        const tempArrChars = [];
        if (numberCheckBox.checked){
            let tempNum = geradorChars.randNum();
            tempArrChars.push(tempNum);
        }

        if (upperCaseCheckBox.checked){
            let tempUpper = geradorChars.randUpperChar();
            tempArrChars.push(tempUpper);
        }
        if (lowerCaseCheckBox.checked){
            let tempLower = geradorChars.randLowerChar();
            tempArrChars.push(tempLower);
        }
        if (specialCheckBox.checked){
            let tempSpecial = geradorChars.randSpecial();
            tempArrChars.push(tempSpecial);
        }

        let randNum = Math.floor(Math.random() * (tempArrChars.length - 0) + 0);

        senha = senha + tempArrChars[randNum];

    }

    campoSenha.innerHTML = senha;
}