/*
for each with of and in
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

for(var iterated of users){
    console.log("user="+iterated.id+"-"+iterated.name);
}


for(var index in users){
    var iterated=users[index];
    console.log("index="+index+"user="+iterated.id+"-"+iterated.name);
}
