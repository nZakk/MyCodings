class ValidaForm {
    constructor() {
        this.formulario = document.querySelector('.formulario');
        this.checkbox = document.querySelector('input[name=checkbox-senha]');

        this.eventos();
    }

    eventos() {
        this.formulario.addEventListener('submit', e => {
            this.handleSubmit(e);
        });

        this.checkbox.addEventListener('change', function () {
            if (this.checked) {
                document.getElementById('senha').type = 'text';
                document.getElementById('senha-repetida').type = 'text';
            } else {
                document.getElementById('senha').type = 'password';
                document.getElementById('senha-repetida').type = 'password';
            }
        });
    }

    handleSubmit(e) {
        e.preventDefault();
        const camposValidos = this.camposSaoValidos();
        const senhasValidas = this.senhasSaoValidas();

        if (camposValidos && senhasValidas) {
            alert('Formulário enviado');
            this.formulario.submit();
        }
    }

    senhasSaoValidas() {
        let valid = true;

        const senha = this.formulario.querySelector('.senha');
        const senhaRepetida = this.formulario.querySelector('.senha-repetida');

        if (senha.value !== senhaRepetida.value) {
            valid = false;

            this.criaErro(senha, "Campos senha e repetir senha precisam ser iguais.");
            this.criaErro(senha-repetida, "Campos senha e repetir senha precisam ser iguais.");
        }

        if (senha.length < 6 || senha.length > 12) {
            this.criaErro(senha, 'Senha precisa ter entre 6 e 12 caracteres.');
            valid = false;
        }


        return valid;
    }

    camposSaoValidos() {
        let valid = true;

        for (let errorText of this.formulario.querySelectorAll(".error-text")) {
            errorText.remove();
        };

        for (let campo of this.formulario.querySelectorAll(".validar")) {
            let label = campo.previousElementSibling.innerText;
            
            if (!campo.value) {
                this.criaErro(campo, `Campo "${label}" não pode estar em branco.`);
                valid = false;
            }

            if (campo.classList.contains('cpf')) {
                if (!this.validaCPF(campo)) valid = false;
            }

            if (campo.classList.contains('usuario')) {
                if (!this.validaUsuario(campo)) valid = false;
            }
        };

        return valid;
    }

    validaUsuario(campo) {
        const usuario = campo.value;
        let valid = true;

        if (usuario.length < 3 || usuario.length > 12) {
            this.criaErro(campo, 'Usuário precisa ter entre 3 e 12 caracteres.');
            valid = false;
        }

        if (!usuario.match(/^[a-zA-Z0-9]+$/g)) {
            this.criaErro(campo, 'Usuário precisa conter letras e/ou números.');
            valid = false;
        }

        return valid;
    }

    validaCPF(campo) {
        const cpf = new ValidaCPF(campo.value);

        if (!cpf.valida()) {
            this.criaErro(campo, 'CPF inválido.');
            return false;
        }

        return true;
    }

    criaErro(campo, msg) {
        const div = document.createElement('div');
        div.innerHTML = msg;
        div.classList.add('error-text');
        campo.insertAdjacentElement('afterend', div);
    }
}

const valida = new ValidaForm();
