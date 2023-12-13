import { useState } from "react";
import counterHoc from "./counterhoc";

function SmallClickCounter({incrementHandler, countObj}){
    console.log("****inside ClickCounter Functional");
  
      return (
          <div style={{backgroundColor:"orange"}} >
              <h6>Click Functional Small Component</h6>
              Count is {countObj.count} 
              <br/>
                <button onClick={incrementHandler}> Increment Count</button>
          </div>
      );
  
}

export default counterHoc(SmallClickCounter);