
export function UserDetailsFunctional({user}) {
 
    
      
     const e=(
        <div>
            <h3>User details Functional Component</h3>
            Hello User
             <br/>
             <h3> {user.name} {user.age}</h3> 
             
            

             
        </div>
     );

     return e;

    
}

