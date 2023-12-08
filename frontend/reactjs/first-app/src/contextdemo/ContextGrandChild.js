import { useContext } from "react"
import { UserConsumer } from "../UserContext"

export function ContextGrandChild(){
   const user =useContext(UserConsumer);
    
    return (
        <div>
            <h3>Context Grand Child</h3>

           User details is  {user.name} and age is {user.age} id is {user.id}
        </div>
    )
}