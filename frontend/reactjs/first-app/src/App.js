import { Component } from "react";
import { UserDetails } from "./UserDetails";
import { ClickCounter } from "./ClickCounter";
import { AddUser } from "./AddUser";
import { TableDemo } from "./TableDemo";
import { ClickCounterFunction } from "./ClickCounterFunction";
import { UserDetailsFunctional } from "./UseDetailsFunctional";
import { AddUserFunctional } from "./AddUserFunctional";
import { CounterChild } from "./passinghandler/CounterChild";
import { ParentSimple } from "./passinghandler/ParentSimple";
import { ParentCounterChild } from "./passinghandler/ParentCounterChild";

export function App () {

    const users = [
        {id:1, name: "archana", age: 23 },
        {id:2, name: "megha", age: 22 },
        {id:3, name: "kushal", age: 21 }
    ]

   
        return (
            <div>
           { /*<ClickCounterFunction/> 
            <UserDetailsFunctional user={users[0]} />
            <UserDetailsFunctional user={users[1]} />
             <AddUserFunctional/>
 <ClickCounterFunction/> 
   <ParentSimple/>
        */}
       <ParentCounterChild/>
  
        </div>)
    
}