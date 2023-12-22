
const intialState={count:0};

export function countReducer(state=intialState, action){

if(action.type=="increment"){
    return {count:state.count+1}
}
if(action.type=="decrement"){
    return {count:state.count-1};
}

}