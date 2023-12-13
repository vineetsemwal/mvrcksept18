import { useState } from "react";
function counterHoc(OriginalComponent) {

    const WrapperComponent = () => {

        const initialState={count:0};
        const [currentState, setNewState]=useState(initialState);
        
        const incrementHandler=()=>{
            const newState={count:currentState.count+1};
            setNewState(newState);
        }    

        return (
            <div>
            <OriginalComponent incrementHandler={incrementHandler} countObj={currentState} />
            </div>

        )

    }

    return WrapperComponent;

}

export default counterHoc;