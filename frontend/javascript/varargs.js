/**
 * variable arguments-same in java
 * 
 */
function add(...numbers) {
    let result = 0;
    for (let num of numbers) {
        result = result + num;
    }
    return result;
}

const result1=add(9);
const result2=add(2,5);
const result3=add(10,12,13);

console.log("result1="+result1);
console.log("result2="+result2);
console.log("result3="+result3);