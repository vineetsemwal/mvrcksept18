import { Component } from "react";
import { UserDetails } from "./UserDetails";

export class App extends Component {
    render() {
        return (<div>
            <h3> App Component</h3>

            <UserDetails />

            <UserDetails />
        </div>)
    }
}