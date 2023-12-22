import store from "./store.js";
import { fetchUser } from "./userActions.js";

store.subscribe(()=>console.log("state is",store.getState()));
store.dispatch(fetchUser({name:"karthik", age:21}));
store.dispatch(fetchUser({name:"archana", age:22}));