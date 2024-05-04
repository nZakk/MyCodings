function Calculadora() {
    this.display = document.querySelector('.display');

    this.inicia = () => {
        this.capturaCliques();
        this.CapturaEnter();
    };

    this.CapturaEnter = () => {
        document.addEventListener('keypress', e => {
            if (e.keyCode ===13){
            this.equal();
            }
        });
    }

    this.capturaCliques = () => {
        document.addEventListener('click', e => {
            const el = e.target;
            if (el.classList.contains('btn-num')) this.addNumDisplay(el);
            if (el.classList.contains('btn-clear')) this.clear();
            if (el.classList.contains('btn-del')) this.del();
            if (el.classList.contains('btn-eq')) this.equal();
        });
    };


    this.addNumDisplay = el => {
        this.display.value += el.innerText;
        this.display.focus();
    };
    this.clear = () => this.display.value = '';
    this.del = () =>this.display.value = this.display.value.slice(0, -1);
    
    this.equal = () =>{
        try{
            const conta = eval(this.display.value);

            if(!conta){
                alert('Conta Inválida');
                return
            }

            this.display.value = conta;
        }catch(e){
            alert('Conta Inválida');
            return
        }
    };

};

const calculadora = new Calculadora();
calculadora.inicia();