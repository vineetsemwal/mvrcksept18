/*
spread operator
*/
const product1={name:"samsung-g1", price:20000};

const product2={...product1,name:"motorola"};

const product3={...product1};

console.log("product2=",product2);
console.log("product3=",product3);
