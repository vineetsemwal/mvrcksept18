/**
 * spread operator with array
 */

const fruits1=["apple","mango","banana"];

const fruits2=[...fruits1];
const fruits3=["apple",...fruits1];
console.log("fruits2=",fruits2);
console.log("fruits3=",fruits3);

const veggies=["tomato","potato"];
const fruitsAndVeggies=[...fruits1,...veggies];
console.log("fruitsandveggies array=",fruitsAndVeggies);
