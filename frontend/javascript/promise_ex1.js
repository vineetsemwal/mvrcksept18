/**
 * 
 * promise example
 */
function isEven(num) {
    const executor = (resolve, reject) => {
      if (!num) {
        reject("number is invalid");
        return;
      }
      const result = num % 2 == 0;
      resolve(result);
      console.log("inside is even =" + result);
    };
  
    const promise = new Promise(executor);
    return promise;
  }

function isEvenUse(){
    const promise =isEven();
    const successHandler=result=>{
        console.log("inside success handler , result="+result);
    };
    const errHandler=err=>{
        console.log("inside err handler, err="+err);
    }
    promise.then(successHandler).catch(errHandler);
    console.log("bye");

}
isEvenUse();
