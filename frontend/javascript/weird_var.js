/*
weird var behavior
*/

function print() {
i=9;
if(true){
    var i=10;
}
console.log("i="+i);

}

print()