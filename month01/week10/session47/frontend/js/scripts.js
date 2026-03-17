const title = document.querySelector('#page-title');
console.log("Title is ", title.textContent);

const intro = document.querySelector('.intro');
console.log("Intro is ", intro.textContent);

const fruits = document.querySelectorAll('#fruits');
fruits.forEach(function(fruit){
    console.log(fruit.textContent);
    
})

// (хооронд зай байхгүй) гэдэг нь "fruit болон active хоёуланг агуулах" гэсэн утгатай. 
const activeFruit = document.querySelector('.fruit.active');
console.log("Active Fruit is ", activeFruit.textContent);

// (хооронд зай бий) гэдэг нь "container дотрх count" гэсэн утгатай.
const count = document.querySelector('.container .count');

console.log("Too is", count.textContent);

// Exercise 2

const items = document.querySelectorAll('#color-list li');
const selected = document.querySelector('#selected');

items.forEach(function(item){
    item.addEventListener("click", function(){
        items.forEach(function(el){
            el.style.background = "";
        });
        item.style.background = "#b3d9ff";
        selected.textContent = item.textContent;
        // console.log(selected);
        
    })
})