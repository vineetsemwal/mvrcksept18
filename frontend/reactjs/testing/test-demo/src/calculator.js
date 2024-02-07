import adder from "./adder";

const calculator={

    add:(num1, num2)=>{
        const result=adder.sum(num1,num2);
        return result;
    }

}

export default calculator;