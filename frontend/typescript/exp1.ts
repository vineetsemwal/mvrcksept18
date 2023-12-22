
class Product {

    constructor(private id: number, private name: string) {
    }

    getId(): number {
        return this.id;
    }

    setId(id: number): void {
        this.id = id;
    }


    getName():string{
        return this.name;
    }

}

const product=new Product(1,"samsung");
console.log("product="+product.getId()+"-"+product.getName());
