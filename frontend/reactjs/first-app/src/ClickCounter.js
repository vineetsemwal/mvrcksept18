import { Component } from "react";

/**
 * state demo , state is private to the component and only component can change it
 */
export class ClickCounter extends Component {

    constructor(props){
        super(props);        
        this.state={counter:0};

    }

    clickHandler=()=>{
        const newState={counter:this.state.counter+1};
        this.setState(newState);
        console.log("counter is "+newState.counter);
    }
    render() {

        return (
            <div>
                <h3>Click Counter </h3>
                Counter is {this.state.counter} 
                <br/>

                <button onClick={this.clickHandler}>Increment Counter</button>
            </div>

        );

    }
}