import { createRef, useState } from "react";

function StyleDemo() {

    const [value, setNewState] = useState(0);
    const evenStyle = { backgroundColor: "red", color: "white" };
    const oddStyle = { backgroundColor: "green", color: "white" };
    const numberRef = createRef();

    const numberChangeHandler = () => {
        const number = numberRef.current.value;
        setNewState(number);
    }

    return (
        <div>
            <h1>Css Demo</h1>

            <div>
                <label>Mention Number</label>
                <input name="number" type="number" ref={numberRef} onChange={numberChangeHandler} />

            </div>
            <div style={value % 2 == 0 ? evenStyle : oddStyle} >

                I am a box

            </div>


        </div>
    );
}
export default StyleDemo;