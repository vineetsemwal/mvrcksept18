import { decrementAction, incrementAction } from "./src/store/countActions.js";
import store from "./src/store/store.js";

store.subscribe(()=>console.log("state change",store.getState()));
console.log("initial state=",store.getState());

store.dispatch(incrementAction());
store.dispatch(incrementAction());
store.dispatch(decrementAction());
console.log("state ",store.getState());