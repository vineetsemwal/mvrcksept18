/*
custom toString() example
*/

const user={id:1, name :"hemanth"};
console.log("user="+user);
user.toString=()=>"user obj is id="+user.id+"and name="+user.name;
console.log("user="+user);