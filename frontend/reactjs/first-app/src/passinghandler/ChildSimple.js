export function ChildSimple({add}){

    const result=add(5,7);

    return (
<div>

<h3>Child Component</h3>
Result is {result}
</div>
    );
}