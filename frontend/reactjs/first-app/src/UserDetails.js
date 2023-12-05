import { Component } from "react";

 export class UserDetails extends Component{
 
    render(){
      const user=this.props.user;
     const e=(
        <div>
            <h3>User details Component</h3>
            Hello User
             <br/>
             <h3> {user.name} {user.age}</h3> 
             
            

             
        </div>
     );

     return e;

    }
}

