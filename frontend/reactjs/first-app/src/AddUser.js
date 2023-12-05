import { Component } from "react";

export class AddUser extends Component {
   constructor(){
    super();
    this.state={name:'', age:-1};
   }

    changeNameHandler=(event)=>{
        const fieldValue=event.target.value;
        console.log("event", event.target.value);
        //this.user.name=fieldValue;
        const newState={...this.state, name:fieldValue};
        this.setState(newState);
        
    }

    changeAgeHandler=(event)=>{
        const fieldValue=event.target.value;
        console.log("event", event.target.value);
        //this.user.name=fieldValue;
        const newState={...this.state, age:fieldValue};
        console.log("new state obj after sge change=",newState);
        this.setState(newState);
        
    }

    render() {
        return (
            <div>

<form>
    <div>
        <label>Name</label>
        <input name="name" onChange={this.changeNameHandler}/>
    </div>

    <div>
        <label>Age</label>
        <input name="age" onChange={this.changeAgeHandler} type="number" />
    </div>

    <button>Submit</button>
</form>

<div>
 <h3>Form Details</h3>   

 Name is {this.state.name}

 Age is {this.state.age}

</div>

            </div>
        );
    }
}