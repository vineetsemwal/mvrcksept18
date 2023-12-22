import store from "./store.js";
import fetchApi from "./fetchApi.js";
const FETCH_SUCCESSFUL_TYPE="fetch-successful"

function fetchUser(user){
return { payload:user , type:FETCH_SUCCESSFUL_TYPE};
}


function fetchUserById(id){
return async ()=>{
  const promise = fetchApi.fetchUserById(id);
  const user= await promise;
  store.dispatch(fetchUser(user));
}

}



export {fetchUser,fetchUserById,FETCH_SUCCESSFUL_TYPE};