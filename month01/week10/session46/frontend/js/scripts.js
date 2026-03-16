// const { log } = require("firebase/firestore/pipelines");

// const { log } = require("firebase/firestore/pipelines");

// bidnii form derh u
const result = document.getElementById('result');

// querySELECTOR

const myForm = document.querySelector('#my-form');
console.log(myForm);
const firstName = document.querySelector('#first-name')
const lastName = document.querySelector('#last-name')
const email = document.querySelector('#email')



myForm.addEventListener('submit', (e)=>{
    // console.log(e);
    e.preventDefault();
    result.innerHTML = `
    <div class="info">
        <h3>${firstName.value}</h3>
        <h4>${lastName.value}</h4>
        <p>${email.value}</p>
    </div>
    `;
    firstName.value = "";
    lastName.value = "";
    email.value = "";
//     myForm.innerHTML =`
//      <input type="text" id="first-name">
//         <input type="text" id="last-name">
//          <textarea name="description" id="description" cols="50" rows="10"></textarea>
//         <input type="email" id="email">
//         <button type="submit">Submit</button>
});

const japaneseFood = document.querySelectorAll('.japanese')
console.log(japaneseFood);


