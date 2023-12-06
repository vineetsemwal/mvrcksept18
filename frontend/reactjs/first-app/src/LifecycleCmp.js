import { Component } from "react";

export class LifeCycleCmp extends Component {
    constructor() {
        super();
        this.state={};
        console.log("***inside constructor");
    }

    static getDerivedStateFromProps(props,oldState) {
        console.log("****inside getDerivedStateFromProps");
        const newState={};
        return newState;
    }

    render(){
        console.log("****inside render");
        return(
        <div>
            <h1>Life cycle Component</h1>

        </div>
        );
    }

componentDidMount(){
    console.log("*****component did mount");
}

}