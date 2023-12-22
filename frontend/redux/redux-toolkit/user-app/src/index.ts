import store from "./store.js";
import { fetchUserById } from "./userSlice";

store.subscribe(()=>console.log("state chnaged",store.getState()));
store.dispatch(fetchUserById(1));
store.dispatch(fetchUserById(2));
store.dispatch(fetchUserById(3));