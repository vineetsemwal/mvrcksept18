/**
 * object destructuring
 */

const user={id:1, name :"mahesh"};
//
//  shortcut of below destructuring syntax
// const {id:id,name:name}=user;
 //
const {id,name}=user;

console.log("id="+id +"- name="+name);

const product={name:"samsung", price:20000};
//
// object destructuring
//
const{name:nameVal,price:productVal}=product;

console.log("name="+nameVal+"- product="+productVal);

