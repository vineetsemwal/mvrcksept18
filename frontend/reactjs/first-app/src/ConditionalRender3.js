import { useState } from "react"

export function ConditionalRender3() {
    const [onFlag, setNewState] = useState(false);
    const changeButtonState = () => {
        setNewState(!onFlag);
    }

  
        return (
            <div>
                <h3>Switch / Switch Off Fan component</h3>
                <button onClick={changeButtonState}>Switch On/Off</button>
                <h5>
                {onFlag? ( <div>
                    Fan is switched on, if you are going out, swicth off
                    </div>):(
                <div>
                    Fan is switched Off, if you need air, Switch on
                    </div>
                )} 
                
                </h5>
                <h3>
                Thank you for using    
                </h3>
    
            </div>);
            
    
        }
  
