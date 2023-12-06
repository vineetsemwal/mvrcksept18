import { Component } from "react";

export class MapUseComponent extends Component {

    users = [
        {id:1, name: "archana", age: 23 },
        {id:2, name: "megha", age: 22 },
        {id:3, name: "kushal", age: 21 }
    ]

   
    render() {
        return (
            <div>
            <h3> App Component</h3>
            {
                this.users.map((user) => (
                    <div key={user.id}>
                        <UserDetails user={user} />
                    </div>))
            }

      
          

        </div>)
    }
}