import { Component } from "react";
import ListUsers from "./listusers";
import UserDetails from "./UserDetails";
import { BrowserRouter as Router,Routes, Route,Link } from "react-router-dom";

export function App() {
const ids=[1,2];

    return (
        <div>

<h3>Click on User link to fetch user details</h3>
<Router>
{ids.map(id=>(
    <div key={id}>
<Link to={"/user/"+id}> User {id} </Link>

</div>
    ))}
<Routes>

{ids.map(id=>(<Route path={"/user/"+id} element={<UserDetails id={id}  />} />))}




</Routes>

</Router>

{/*<ListUsers/>*/}
            
        </div>)

}