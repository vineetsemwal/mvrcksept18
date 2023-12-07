import { useState } from "react";
import { CounterChild } from "./CounterChild";
import { CounterChild2 } from "./CounterChild2";

export function ParentCounterChild(){

    const [currentState, setNewState] = useState({ count: 0 });

    const incrementHandlerFun = () => {
        console.log("inside increment handler fun");
        const newState = { count: currentState.count + 1 };
        setNewState(newState);
    }

return(
<div>
    <h3>Parent Count Component</h3>
    <CounterChild  incrementHandler={incrementHandlerFun} currentState={currentState}/>
    <CounterChild2   currentState={currentState}/>
</div>
); 

}