import store from "./store.js";
import { fetchUser, fetchUserById } from "./userActions.js";


store.subscribe(()=>console.log("state",store.getState()));
store.dispatch(fetchUserById(1));
store.dispatch(fetchUserById(2));

