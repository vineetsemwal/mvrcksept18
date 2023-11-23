/*
passing function as reference
*/

function add(num1, num2){
    return num1+num2;
}

function usage(addFun, num1, num2){
const result=addFun(num1,num2);
return result;
}

const result=usage(add, 1,2);
console.log("result="+result);