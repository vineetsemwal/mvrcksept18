
/*
add positive numbers
 */
function add(num1, num2) {
    if (num1 < 0 || num2 < 0) {
        throw new Error("input is invalid");
    }
}

function addUse() {
    try {
        var result = add(1, 2);
        console.log("result=" + result);
        add(-5, 2);
    } catch (exception) {
        console.log("exception is " + exception);
    }
    finally {
        console.log("bye-always executed");
    }
}

addUse();