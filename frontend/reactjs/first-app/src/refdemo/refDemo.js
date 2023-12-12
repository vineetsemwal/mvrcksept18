const { createRef } = require("react");

function RefDemo() {
    const usernameRef = createRef();
    const ageRef = createRef();

    const onClickHandler = (event) => {
        event.preventDefault();
        const usernameField = usernameRef.current;
        const ageField = ageRef.current;
        console.log("username field=" , usernameField);
        console.log("age field=" , ageField);
        console.log("username="+usernameField.value+" age="+ageField.value);
    }

    return (
        <div>

<h1>Ref Demo</h1>
            <form>

                <div>
                    <label>Username</label>
                    <input name="username" ref={usernameRef} />
                </div>

                <div>
                    <label>Age</label>
                    <input name="age" ref={ageRef} />
                </div>

                <button onClick={onClickHandler}>Submit</button>
            </form>

        </div>
    );
}

export default RefDemo;