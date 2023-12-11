import { Link } from "react-router-dom";
export function NavigationBar() {
    return (
        <div>
            <h3>Navigation bar</h3>
<Link to="/" >Home Page</Link>
<Link to="/services">Services Page</Link>
<Link to="/career">Career Page</Link>
        </div>
    );
}