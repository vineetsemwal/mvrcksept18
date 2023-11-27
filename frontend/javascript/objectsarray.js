/*
using objects in array
*/

var user1 = {
    id: 1,
    name: "sampath",
    print: function () {
        console.log("user-" + this.id + "-" + this.name);
    }
}


var user2 = {
    id: 2,
    name: "hemanth",
    print: function () {
        console.log("user-" + this.id + "-" + this.name);
    }
}

var users=[];
users.push(user1);
users.push(user2);

for(var i=0;i<users.length;i++){
    var user=users[i];
    user.print();
}
