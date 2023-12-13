function EvenComponent({number}){

    if(number%2!==0){
        throw new Error("number is not even");
    }

    return(
     <div>
        <h3>Even Component</h3>
       even  number is {number}

     </div>   
    )
}

export default EvenComponent;