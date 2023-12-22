import {createStore} from "redux"
import { userReducer } from "./userReducer.js"


const store=createStore(  userReducer  );


export default store;