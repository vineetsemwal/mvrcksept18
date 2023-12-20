import { ContextChild } from "./ContextChild";

export function ContextParent() {
    return (
        <div>
            <h3>Context Parent</h3>
            <ContextChild />
        </div>
    );
}