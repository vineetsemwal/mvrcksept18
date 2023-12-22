import {createStore} from "redux"
import { countReducer } from "./countReducer.js"


const store=createStore(    countReducer);


export default store;