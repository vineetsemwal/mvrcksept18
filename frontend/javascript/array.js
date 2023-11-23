/**
 * array experiments
 */

var fruits=["apple", "mango", "grapes"];

const e0=fruits[0];

console.log("element="+e0);

//contains 3 elements where element at index 1 is undefined
var vegs=["potato",,"tomato",];


function printVegs(){
    for(var i=0;i<vegs.length;i++){
        var iterated=vegs[i];
        console.log("iterrated="+iterated);
    }
}
printVegs();

//get last element and remove last element of array
var lastElement=vegs.pop();
console.log("lastelement="+lastElement);

console.log("adding element at a later time");


function addVegetable(vegName){
//adds element at the end of array
    vegs.push(vegName);
}

addVegetable("brinjal");
//set new element at an index 0, overwriting previous one
vegs[0]="onion";



