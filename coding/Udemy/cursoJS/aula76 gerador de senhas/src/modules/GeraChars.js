export default class GeraChars {

    randNum(min = 0, max = 9){
        let num = Math.floor(Math.random() * (max - min) + min);
        return num.toString();
    }

    randUpperChar(min = 0, max = 24){
        const charNum = 65 + (Math.floor(Math.random() * (max - min) + min));

        return String.fromCharCode(charNum);
    }

    randLowerChar(min = 0, max = 24){
        const charNum = 97 + (Math.floor(Math.random() * (max - min) + min));

        return String.fromCharCode(charNum);
    }

    randSpecial(min = 0, max = 31){
        let charNum = 33 + (Math.floor(Math.random() * (max - min) + min));

        while (charNum > 47 && charNum < 58 ){
            charNum = 33 + (Math.floor(Math.random() * (max - min) + min));
        }

        return String.fromCharCode(charNum);
    }

}
