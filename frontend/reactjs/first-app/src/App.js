import { Component } from "react";
import { UserDetails } from "./UserDetails";
import { ClickCounter } from "./ClickCounter";
import { AddUser } from "./AddUser";
import { TableDemo } from "./TableDemo";

export class App extends Component {

    users = [
        {id:1, name: "archana", age: 23 },
        {id:2, name: "megha", age: 22 },
        {id:3, name: "kushal", age: 21 }
    ]
    mapFun=(user) => (
        <div key={user.id}>
            <UserDetails user={user} />
        </div>);
    render() {
        return (<div>
            <h3> App Component</h3>
            {
                this.users.map(this.mapFun)
            }

            <TableDemo/>

        </div>)
    }
}