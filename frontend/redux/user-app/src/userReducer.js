import { FETCH_SUCCESSFUL_TYPE } from "./userActions.js";

const initialState={name:"not-init", age:-1};

function userReducer(state=initialState, action){
    if(action.type==FETCH_SUCCESSFUL_TYPE){
       const payload=action.payload;
        return {name:payload.name, age: payload.age};
    }
}

export {userReducer};