import User from "./User";

interface UserDetailsProps{
user:User
}

export function UserDetails({user}:UserDetailsProps) {
 
    
      
    const e=(
       <div>
           <h3>User details Functional Component</h3>
            <h3> Hello {user.name} {user.age}</h3> 
            
           

            
       </div>
    );

    return e;

   
}

