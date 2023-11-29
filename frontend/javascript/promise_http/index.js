const baseUrl="http://localhost:3000/users";
const axios=require("axios");


/*
function fetchUserById(id){
    const url=baseUrl+"/"+id;
    console.log("url=",url);
    const promise=axios.get(url);
    const successFun=(response=>{
        const user=response.data;
    console.log("user=",user);
    });
    
    promise.then(successFun);
    console.log("success");
}
*/

 async function fetchUserById(id){
    const url=baseUrl+"/"+id;
    console.log("url=",url);
    const promise=axios.get(url);
    const response=await promise;// blocking wait till response is available
    const user=await response.data;// blocking wait till data is available
    console.log("user=",user);
}

function fetchAll(){
    const promise=axios.get(baseUrl);
    promise.then(response=>{
        const users=response.data;
       for(const user of users){
        console.log("user is",user);
       }
    })
}

 async function addUser(username,age){
    const requestData={
        "username" : username,
        "age":age
    };
    const promise=axios.post(baseUrl,requestData);
    const response=await promise;// blocking wait for response
    const user=await response.data;//blocking wait
    console.log("user got added=",user);
}
addUser();

console.log("****fetching all");
fetchAll();

console.log("***fetch by id");
fetchUserById(1);
fetchUserById(2);
