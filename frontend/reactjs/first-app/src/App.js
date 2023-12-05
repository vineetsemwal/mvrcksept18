import { Component } from "react";
import { UserDetails } from "./UserDetails";
import { ClickCounter } from "./ClickCounter";

export class App extends Component {
    user1={name:"archana", age:21};
    project1={projectName:"telephony app", skill:"core java"};
    project2={projectName:"financial app", skill:"Java enterprise"};
    user2={name:"megha", age:21};
    render() {
        return (<div>
            <h3> App Component</h3>
            {

           // <UserDetails user={this.user1} project={this.project1} />

           // <UserDetails user={this.user2} project={this.project2}/>
            }
            <ClickCounter/>
        </div>)
    }
}