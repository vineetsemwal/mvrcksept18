/**
 * 
 *   No need to declare types of function arguments and return value type when delcaring function
 */
function add(num1 , num2){
    var result=num1+num2;
    return result;
}

var result=add(1,2);
console.log("result="+result);

/**
 * 
 * default value returned is undefined
 */
function print(str){
    console.log("str="+str);
}

var test=print("sampath");

console.log("test="+test);