
const FETCH_SUCCESSFUL_TYPE="fetch-successful"

function fetchUser(user){
return { payload:user , type:FETCH_SUCCESSFUL_TYPE};
}



export {fetchUser,FETCH_SUCCESSFUL_TYPE};