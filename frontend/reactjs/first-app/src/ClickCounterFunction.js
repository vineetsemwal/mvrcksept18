import { useState } from "react";

export function ClickCounterFunction() {
    console.log("****inside ClickCounter Functional");
  const initialState={count:0};
    const [currentState, setNewState]=useState(initialState);
    
    const incrementHandler=()=>{
        const newState={count:currentState.count+1};
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