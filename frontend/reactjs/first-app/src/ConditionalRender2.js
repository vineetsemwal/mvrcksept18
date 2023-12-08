import { useState } from "react"

export function ConditionalRender2() {
    const [onFlag, setNewState] = useState(false);
    const changeButtonState = () => {
        setNewState(!onFlag);
    }

    return (
        onFlag ? (

            <div>
                <button onClick={changeButtonState}>Switch Off</button>
                <h5>
                    Fan is switched on, if you are going out, swicth off
                </h5>

            </div>

        ) : (
            <div>
                <button onClick={changeButtonState}>Switch On</button>
                <div>
                    Fan is Switch off , Please switch on {onFlag}
                </div>

            </div>
        )
    )



}