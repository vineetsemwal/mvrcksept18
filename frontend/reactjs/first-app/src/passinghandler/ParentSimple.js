import { ChildSimple } from "./ChildSimple";

export function ParentSimple(){

    const add=(num1,num2)=>{
       return num1+num2; 
    }

    return (
        <div>
        <ChildSimple add={add} />
        </div>
    )

}