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
import { ConditionalRender1 } from "./ConditionalRender1";
import { ConditionalRender2 } from "./ConditionalRender2";
import { ConditionalRender3 } from "./ConditionalRender3";
import { UserProvider, UserConsumer } from "./UserContext";
import { ContextParent } from "./contextdemo/ContextParent";
import RefDemo from "./refdemo/refDemo";
import StyleDemo from "./cssdemo/StyleDemo";
import CssDemo from "./cssdemo/CssDemo";
import EvenComponent from "./errorhandler/evenComponment";
import Hello from "./errorhandler/hello";
import ErrorHandling from "./errorhandler/errorHandling";
import BigClickCounter from "./hoc/BigClickCounter";
import SmallClickCounter from "./hoc/SmallClickCounter";

export function App() {

    const users = [
        { id: 1, name: "archana", age: 23 },
        { id: 2, name: "megha", age: 22 },
        { id: 3, name: "kushal", age: 21 }
    ]


    return (
        <div>
            { /*<ClickCounterFunction/> 
            <UserDetailsFunctional user={users[0]} />
            <UserDetailsFunctional user={users[1]} />
             <AddUserFunctional/>
 <ClickCounterFunction/> 
   <ParentSimple/>
   
       <ParentCounterChild/>
        <ConditionalRender1/>
          <ConditionalRender2/>
            <ConditionalRender3/>
                        <UserProvider value={users[2]}>

                <ContextParent />
            </UserProvider>
            
              
<RefDemo/>
 <StyleDemo/>
     <CssDemo/>
     
<Hello/>

<ErrorHandling>
     <EvenComponent number={19}/>
     </ErrorHandling>

        */}

<BigClickCounter />

<SmallClickCounter/>

        </div>)

}