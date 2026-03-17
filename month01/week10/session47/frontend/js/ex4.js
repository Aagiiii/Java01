const display = document.querySelector("#calc-display");
const buttons = document.querySelector("#calc-buttons");

let currentValue = "";

buttons.addEventListener("click", function(e) {
    // TODO 1: e.target.tagName шалгаж, BUTTON биш бол return хий
    if (e.target.tagName !== "BUTTON") {
        return;
    }
    // TODO 2: "clear-btn" id-тай товч дарагдсан бол
    //          currentValue = "", display = "0" болгоод return хий
    if (e.target.id === "clear-btn") {
        currentValue ="";
        display.textContent = "0";
        return;
    }
    // TODO 3: e.target.dataset.val ашиглан тоог авч
    //          currentValue-д нэм, display-д харуул
    const val = e.target.dataset.val

    if (val !== undefined) {
         currentValue += val;
         display.textContent = currentValue;
    }
   
    
})