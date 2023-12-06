import { useState } from "react";

export function AddUserFunctional() {
 const initialState={name:'uninit',age:-1};
 const [currentState,setNewState]=useState(initialState);


  const  changeNameHandler = (event) => {
        const fieldValue = event.target.value;
        console.log("event", event.target.value);
        const newState = { ...currentState, name: fieldValue };
        setNewState(newState);

    }

    
   const changeAgeHandler = (event) => {
        const fieldValue = event.target.value;
        console.log("event", event.target.value);
        //this.user.name=fieldValue;
        const newState = { ...currentState, age: fieldValue };
        setNewState(newState);

    }

    return (
        <div>

            <form>
                <div>
                    <label>Name</label>
                    <input name="name" onChange={changeNameHandler} />
                </div>

                <div>
                    <label>Age</label>
                    <input name="age" onChange={changeAgeHandler} type="number" />
                </div>

                <button>Submit</button>
            </form>

            <div>
                <h3>Form Details</h3>

                Name is {currentState.name}

                Age is{currentState.age}

            </div>

        </div>
    );
}
