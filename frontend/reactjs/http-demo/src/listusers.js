import { useEffect, useState } from "react";
import apiUser from "./apiUser";

function ListUsers() {
    const initialState=[];
    const [currentUsers,setNewUsers]=useState(initialState);

    const fetchUsers = async () => {
        const promise = apiUser.fetchUsers();
        const response = await promise;// blocking wait till response is available
        const fetchedUsers = await response.data;
        console.log("users=",fetchedUsers);
       setNewUsers(fetchedUsers);
    }

    useEffect(() => {
        fetchUsers();
    },[])
    return (
        <div>
            <h1>List Users</h1>
 
          <ul>
           {currentUsers.map(user=><li key={user.id}> 
            {user.id},  {user.name} , {user.age}
           </li>)}
          </ul>



        </div>
    )
}

export default ListUsers;