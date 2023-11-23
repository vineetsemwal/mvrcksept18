/*
let , const usage, variables declared are block scoped
*/


function print() {
    if(true){
       let i=10;
       i=11;
       console.log("i="+i);
    }
    
    }
    
    print()

const i=10;
//can't be reassigned value
//i=11;

