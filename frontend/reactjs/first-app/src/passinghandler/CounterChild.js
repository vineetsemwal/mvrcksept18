import { useState } from "react";

export function CounterChild({incrementHandler,currentState}) {
    console.log("inside counter child");
      

    return (
        <div>
            <h3>Counter Child 1</h3>
            Count is {currentState.count}
            <br/>

            <button onClick={incrementHandler}>Increment </button>
        </div>
    );
}