import { Component } from "react";
import { UserDetails } from "./UserDetails";
import { ClickCounter } from "./ClickCounter";
import { AddUser } from "./AddUser";

export class App extends Component {

    users = [
        { name: "archana", age: 23 },
        { name: "megha", age: 22 },
        { name: "kushal", age: 21 }
    ]
    mapFun=(user) => (
        <div>
            <UserDetails user={user} />
        </div>);
    render() {
        return (<div>
            <h3> App Component</h3>
            {
                this.users.map(this.mapFun)
            }

        </div>)
    }
}