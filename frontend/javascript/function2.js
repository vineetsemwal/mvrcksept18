/*
passing object to function
*/

function printUser(userArg){
    console.log("name="+userArg.name);
    console.log("state="+userArg.state);
}


var user={name:"archana",state:"tamilnadu"};
printUser(user);
