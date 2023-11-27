/**
 * 
 * promise example with async await
 */
async function isEven(num) {
   if(!num){
    throw new Error("invalid number");   
   }
   const result=num%2==0;
   return result;
   
  }

async function isEvenUse(){
    const promise =isEven(10);
    const result =await promise;
    console.log("result="+result);

}
isEvenUse();
