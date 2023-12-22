import {createStore,compose,applyMiddleware} from "redux"
import {thunk} from "redux-thunk";
import { userReducer } from "./userReducer.js"


const store = createStore(userReducer, compose(applyMiddleware(thunk)));


export default store;