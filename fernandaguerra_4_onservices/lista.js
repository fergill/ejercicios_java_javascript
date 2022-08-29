


var fs = require('fs');
var text = fs.readFileSync("pesoAltura", 'utf-8');
const textByLine = text.split("\n");

const newArray = [];
textByLine.forEach((element, index) => {
    newArray[index] = element.split(',').map(element => parseInt(element));
});

var result = [];

for(let i=0; i < newArray.length -1 ; i++){
    
    var firstPosterior = newArray[i+1][0];
    var lastPosterior = newArray[i+1][1];
    var firstAnterior = newArray[i][0];
    var lastAnterior = newArray[i][1];
    
    if(
        firstPosterior > firstAnterior &&
        lastPosterior > lastAnterior
        ) {
        result.push(newArray[i+1]);
    }
}

console.log(result)
