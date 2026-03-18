
const main = document.querySelector('#main');

main.innerHTML = ` <div>
        <h2>Template Literal</h2>
        <p class="text">This is a test</p>
     </div>`;

const textInput = document.querySelector("#text-input");
// const textDisplay = document.querySelector('#key-display');
let writtenText = '';
textInput.addEventListener("keydown", function (e) {
    console.log(e.key);

    // textDisplay.innerHTML = e.key;
    writtenText = writtenText + e.key;
    document.querySelector('#key-display').innerHTML = `
        <div>Key: ${e.key} </div>
        <p> Written Text: ${writtenText} </p>`;

})

//  Ex3

let count = 0;
//  let keyLength = '';
const comment = document.querySelector('#comment');
const counter = document.querySelector('#current');
comment.addEventListener("keydown", function (e) {
    const keyLength = e.target.value.length;
    // for (let index = 0; index < keyLength; index++) {
    //     count++;

    // }
    counter.textContent = keyLength;
    // counter.textContent= `
    //     <p> Count of current: ${keyLength} </p>
    //     `;
    if (keyLength > 25) {
       counter.style.color = 'red';
    } else if (keyLength > 20) {
        counter.style.color = 'orange';
    } else {
        counter.style.color = 'black';
    }
})

// Ex4

const registerFormElement = document.querySelector('#register-form');
const userName = document.querySelector("#username");
const passWord = document.querySelector('#password');
registerFormElement.addEventListener('submit', function(e){
    e.preventDefault();
    })

userName.addEventListener('input', function(e){
    const error = document.querySelector("#username-error");
    if (e.target.value.length <3 ) {
        error.textContent = "At least 3 letters"
        error.style.color = 'red';

    } else if (e.target.value.length >20 ) {
        error.textContent = "Maximum 20 letters"
        error.style.color = 'red';

    } else{
        error.textContent ='Correct';
        error.style.color = 'green'
    }
    
})


function passwordPower(text){

if (text.length <6) {
    return "low";
}
const number = /\d/.test(text);
const specialChars = /[!@#$%]/.test(text);

if (text.length >=8 && number && specialChars) {
    return "powerful"
}
return "intermediate"
};


passWord.addEventListener('input', function(e){
    const secret = e.target.value;
    const level = passwordPower(secret);
    const strengthFill = document.querySelector('#strength-fill');
    strengthFill.style.height ='50px';
    if (level === "low") {
        strengthFill.style.width = "30%";
        strengthFill.style.backgroundColor = '#ff4444';

    } else if (level === "intermediate") {
        strengthFill.style.width = "65%";
        strengthFill.style.backgroundColor = '#ffaa00';

    } else if (level === "powerful") {
        strengthFill.style.width = "100%";
        strengthFill.style.backgroundColor = '#00aa44';

    }
})
