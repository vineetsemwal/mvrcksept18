/**
 * getters , setters
 */

class Employee{
   _id;
   _name;
    constructor(id,name){
        this._id=id;
        this._name=name;
    }

    get id(){
        console.log("inside getid="+this._id);
        return this._id;
    }

    set id(idArg){
        console.log("inside seetid, arg="+idArg);
        this._id=idArg
    }

}
//const emp=new Employee(1,"sampath");
const emp={id:1,name:"sampath"};
const id=emp.id;
console.log("id="+id);
emp.id=10;
console.log("emp=",emp);