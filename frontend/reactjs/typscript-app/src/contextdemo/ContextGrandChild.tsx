import { useContext } from "react"
import { UserConsumer, UserContext } from "../UserContext"
import User from "../User";

export function ContextGrandChild(){
   const user:User =useContext(UserContext);
    
    return (
        <div>
            <h3>Context Grand Child</h3>

           User details is  {user.name} and age is {user.age} id is {user.id}
        </div>
    )
}