import { ContextGrandChild } from "./ContextGrandChild";

export function ContextChild(){
    return (
        <div>
            <h3>Context Child</h3>
            <ContextGrandChild/>
        </div>
    )
}