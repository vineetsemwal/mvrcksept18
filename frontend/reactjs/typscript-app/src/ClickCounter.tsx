import { useState } from "react";

export function ClickCounter() {
   
 interface Counter{
  count:number;
 } 

console.log("****inside ClickCounter Functional");
  const initialState:Counter={count:0};
    const [currentState, setNewState]=useState<Counter>(initialState);
    
    const incrementHandler=()=>{
        const newState:Counter={count:currentState.count+1};
        setNewState(newState);
    }

    return (
        <div>
            <h1>Click Functional Component</h1>
            Count is {currentState.count}
            <br/>
              <button onClick={incrementHandler}> Increment Count</button>
        </div>
    );

}