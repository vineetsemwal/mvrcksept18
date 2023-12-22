import { FETCH_SUCCESSFUL_TYPE } from "./userActions.js";

const initialState={id:-1,name:"not-init", age:-1};

function userReducer(state=initialState, action){
    if(action.type==FETCH_SUCCESSFUL_TYPE){
       const payload=action.payload;
        const newState= {id:payload.id,name:payload.name, age: payload.age};
        return newState;
    }
}

export {userReducer};