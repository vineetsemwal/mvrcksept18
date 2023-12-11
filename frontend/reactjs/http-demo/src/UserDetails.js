import { useEffect, useState } from "react";
import apiUser from "./apiUser";

function UserDetails({id}){


    const [user,setUser]=useState({id:-1,name:"notinit",age:-1});

    const fetchById=async (id)=>{
       const promise= apiUser.fetchUserById(id);
       const response = await promise;// blocking wait till response is available
       const fetchedUser = await response.data;//blocking wait till data(it is also a promise) is available
       console.log("user=",fetchedUser);
       setUser(fetchedUser);
    };

    useEffect(()=>{
        fetchById(id);
    },[id]);
    
    return (
        <div>
            {user.id},  {user.name} , {user.age}
            
        </div>
    )
}

export default UserDetails;