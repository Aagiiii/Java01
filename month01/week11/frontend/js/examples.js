
const stars = document.querySelector('#four-stars');
let array ="";
let i =0;
while (i < 4) {
    array+= `<span>⭐</span>`;
    
    i++;
}

stars.innerHTML = array;

// ex2

const circles = document.querySelector('#five-circles');

let html = "";
let count = 1;


while (count <=5) {
    let opacity = count*0.2;
    html += `<div style="background: rgba(255,143,163, ${opacity});
    padding:10px; margin:5px;
    width:100px; height:100px; border-radius: 50%; display:flex;
    justify-content:center; align-items:center;">
                Circle ${count}
                </div>`
                count++;
}

circles.innerHTML = html;