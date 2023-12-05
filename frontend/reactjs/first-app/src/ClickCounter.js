import { Component } from "react";

/**
 * state demo , state is private to the component and only component can change it
 */
export class ClickCounter extends Component {

     

    constructor(props){
        super(props);         
        this.state={count:0};       

    }


    incrementHandler=()=>{
        const newState={count: ++this.state.count};
       this.setState(newState);
        console.log("counter is ", newState);
    }
    
    render() {

        return (
            <div>
                <h3>Click Counter</h3>
              Count is {this.state.count}
<br/>
              <button onClick={this.incrementHandler}> Increment Count</button>
            </div>

        );

    }
}