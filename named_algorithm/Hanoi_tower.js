const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stout
});

rl.question("some?", (answer) => {
    console.log(hanoi_tower(answer));
    rl.close();
});

var one = [];
var two = [];
var three = [];

var temp = {

}

function make_hanoi(num){
    for (let i = num ; i >= 1; i--){
        one.push(i);
    }
    hanoi_console(num);
}

function hanoi_console(num){

    temp.one = one[one.length -1];
    temp.two = two[two.length -1];
    temp.three = three[three.length -1];
    
    let targetNumber = get_min_value([...Object.values(temp)]);
    let targetCol = getKeyByValue(temp,targetNumber);
    
    
}

function get_min_value(a){
    return Math.min.apply(null,a);
}

function getKeyByValue(object, value) {
    return Object.keys(object).find(key => object[key] === value);
  }
  










function hanoi_tower(num){
    if (num === 1){
        return 1;
    }

    return 2 * hanoi_tower(num-1) + 1;
}