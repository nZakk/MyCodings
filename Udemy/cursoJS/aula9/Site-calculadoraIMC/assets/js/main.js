function meuScopo() {
    const form = document.querySelector(`.form`);
    const resultado = document.querySelector(`.resultado`);

    function recebeEventoForm(evento) {
        event.preventDefault();
        resultado.innerHTML =""; 

        const peso = form.querySelector(`.peso`);
        const altura = form.querySelector(`.altura`);

        console.log(peso.value, altura.value)

        if (peso.value < 10 || peso.value > 300) {
            resultado.innerHTML += `<p id="erro">Peso inválido</p>`;
        } else if (altura.value < 1 || altura.value > 3) {
            resultado.innerHTML += `<p id="erro">Altura inválida</p>`;
        } else {

            const imc = peso.value / (altura.value * altura.value);

            if (imc < 18.5) {
                resultado.innerHTML += `<p>Seu IMC é ${imc.toFixed(2)}(Abaixo do peso)</p>`;
            } else if (imc >= 18.5 && imc <= 24.9) {
                resultado.innerHTML += `<p>Seu IMC é ${imc.toFixed(2)}(Peso normal)</p>`;
            } else if (imc >= 25 && imc <= 29.9) {
                resultado.innerHTML += `<p>Seu IMC é ${imc.toFixed(2)}(Sobrepeso)</p>`;
            } else if (imc >= 30 && imc <= 34.9) {
                resultado.innerHTML += `<p>Seu IMC é ${imc.toFixed(2)}(Obesidade grau 1)</p>`;
            } else if (imc >= 35 && imc <= 39.9) {
                resultado.innerHTML += `<p>Seu IMC é ${imc.toFixed(2)}(Obesidade grau 2)</p>`;
            } else {
                resultado.innerHTML += `<p>Seu IMC é ${imc.toFixed(2)}(Obesidade grau 3)</p>`;
            }

        }



    };

    form.addEventListener(`submit`, recebeEventoForm);



};
meuScopo();

