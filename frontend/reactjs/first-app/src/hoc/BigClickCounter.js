import { useState } from "react";
import counterHoc from "./counterhoc";

function BigClickCounter({incrementHandler, countObj}){
    console.log("****inside ClickCounter Functional");
   
      return (
          <div style={{backgroundColor:"yellow"}}>
              <h1>Click Functional Big Component</h1>
            <h3>  Count is {countObj.count} </h3>
              <br/>
                <button onClick={incrementHandler}> Increment Count</button>
          </div>
      );
  
}

export default counterHoc(BigClickCounter);