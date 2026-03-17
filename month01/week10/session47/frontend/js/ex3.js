const btn = document.querySelector("#faq-btn");
const content = document.querySelector("#faq-content");

btn.addEventListener("click", function(){
    content.classList.toggle('visible');

    if (content.classList.contains("visible")) {
        btn.textContent = "FAQ: JavaScript хэл гэж юу вэ? ▲";
    } else{
        btn.textContent = "FAQ: JavaScript хэл гэж юу вэ? ▼";
    }
})