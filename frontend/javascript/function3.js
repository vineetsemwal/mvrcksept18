/*
in javascript , you can pass the function as reference 
 */
function sub(num1, num2){
    return num1-num2;
}

var fun=sub;

var result=fun(5,1);

console.log("result="+result);