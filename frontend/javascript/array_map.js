/**
 * map functionality in array

*/


var user1 = {
    id: 1,
    name: "ajay"
};

var user2 = {
    id: 2,
    name: "hemanth"
};

var users=[user1,user2];
// passed function is called on every element of array, map is immutable function which returns new array
var ids=users.map(function(userArg){
return userArg.id;
});

console.log("ids="+ids);