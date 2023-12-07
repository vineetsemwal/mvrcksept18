import { useState } from "react"

export function ConditionalRender1() {
    const [onFlag, setNewState] = useState(false);
    const changeButtonState = () => {
        setNewState(!onFlag);
    }

    if(onFlag){
        return (
            <div>
                <button onClick={changeButtonState}>Switch Off</button>
                <h5>
                    Fan is switched on, if you are going out, swicth off
                </h5>
    
            </div>);
            
    }


    return (
        <div>
            <button onClick={changeButtonState}>Switch On</button>
            <div>
                Fan is Switch off , Please switch on {onFlag}
            </div>

        </div>)
  
}