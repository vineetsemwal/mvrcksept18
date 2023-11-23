/**
 * array sort
 */




var user1 = {
    id: 1,
    name: "ajay"
}

var user2 = {
    id: 2,
    name: "hemanth"
}
var users=[user2,user1];



users.sort(function(userArg1, userArg2){
    return userArg1.id-userArg2.id;
    });

for(var i=0;i<users.length;i++){
    var user=users[i];
    console.log("user="+user.id+"-"+user.name);
}



