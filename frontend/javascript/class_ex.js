/*
classes, inheritance
*/
class Employee{

    static count=0;
    
    constructor(id,name){
        this.id=id;
        this.name=name;
        Employee.count=Employee.count+1;
    }

    display(){
        console.log("id="+this.id);
        console.log("name="+this.name);
    }
}
class Manager extends Employee{
    
    constructor(id,name,team){
        super(id,name);
          this.team=team;
    }

}

let emp1=new Employee(1,"ajay");
let emp2=new Employee(2,"sampath");
emp1.display();
emp2.display();
console.log("objects count="+Employee.count);
let manager=new Manager(3,"ramya","bank-project");
console.log("id="+manager.id+"-name="+manager.name+"-team="+manager.team);


