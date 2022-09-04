var number1;
var number2;
var operator;
var currentNumber = "";

function press(number) {
    currentNumber += parseFloat(number);
    getDisplay().innerText = number1;

    if (operator) {
        number2 = parseFloat(currentNumber);

    } else {
        number1 = parseFloat(currentNumber);
    }
    getDisplay().innerText = currentNumber;
}

function getDisplay() {
    return document.getElementById("display");
}

function setOP(op) {
    operator = op;
    currentNumber = "";
    getDisplay().innerText = "0";
}

function clr() {
    currentNumber = "";
    getDisplay().innerText = "0";
}

function calculate() {
    var result;

    if (operator === "+") {
        result = number1 + number2;
    } else if (operator === "-") {
        result = number1 - number2;
    } else if (operator === "/") {
        result = number1 / number2;
    } else if (operator === "*") {
        result = number1 * number2;
    }

    console.log(number1, number2);
    getDisplay().innerText = result;
}