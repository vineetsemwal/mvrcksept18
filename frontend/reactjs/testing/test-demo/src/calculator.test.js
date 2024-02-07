import calculator from "./calculator";
import adder from "./adder";


describe("Calculator Tests Suite",()=>{


beforeEach(()=>{
jest.mock("./adder")
}) ;

afterEach(()=>{

});




it("add positive",()=>{
const expectation=20;    
adder.sum.mockImplementation=(num1,num2)=>{
    console.log("inside stubbed sum method");
    return expectation;
};    
const result=calculator.add(15,5);
expect(result).toBe(expectation);

}) ;   


}

);
