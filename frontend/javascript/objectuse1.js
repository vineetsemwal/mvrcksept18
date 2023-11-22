/**
 * object literal
 * 
 */
var addressDetails={city:"bangalore", state:"karnataka"};
var pet1={uname:"scooby", age:5,

address:addressDetails
};

var name=pet1.uname;
var age=pet1.age;

console.log("name="+name);
console.log("age="+age);

var city=pet1.address.city;
var state=pet1.address.state;
console.log("city="+city);
console.log("state="+state);