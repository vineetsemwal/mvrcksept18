/**
 * array sort
 */




var user1 = {
    id: 1,
    name: "ajay"
}

var user = {
    id: 2,
    name: "hemanth"
}
var users=[user2,user1];



const comparator=function(userArg1, userArg2){
return userArg1.id-userArg2.id;
}
users.sort(comparator);

for(var i=0;i<users.length;i++){
    var user=users[i];
    console.log("user="+user.id+"-"+user.name);
}



