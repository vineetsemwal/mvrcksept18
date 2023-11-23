/*
objects with methods
*/

var user = {
    id: 1,
    name: "sampath",
    print: function () {
        console.log("user-" + this.id + "-" + this.name);
    },

    changeName: function (newName) {
        this.name = newName;
    }
}

user.changeName("sampath anna");
user.print();