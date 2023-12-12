const { createRef, useState } = require("react");

function RefDemo() {
    const usernameRef = createRef();
    const ageRef = createRef();

   const[user, setUser] =useState({username:"notinit", age:'-1'}); 

    const onClickHandler = (event) => {
        event.preventDefault();
       
    }


const nameChangeHandler=()=>{
  
        const usernameField = usernameRef.current;       
        console.log("username field=" , usernameField);
        const username=usernameField.value;
        const newUser={...user,username:username};
       setUser(newUser); 
  
}



const ageChangeHandler=()=>{
    const ageField = ageRef.current;        
    const age=ageField.value;
    const newUser={...user,age:age};
   setUser(newUser); 

}


    return (
        <div>

<h1>Ref Demo</h1>
            <form>

                <div>
                    <label>Username</label>
                    <input name="username" ref={usernameRef} onChange={nameChangeHandler}/>
                </div>

                <div>
                    <label>Age</label>
                    <input name="age" ref={ageRef}  onChange={ageChangeHandler}/>
                </div>

                <button onClick={onClickHandler}>Submit</button>
            </form>

            <div>
            User is    {user.username}, {user.age}
            </div>

        </div>
    );
}

export default RefDemo;