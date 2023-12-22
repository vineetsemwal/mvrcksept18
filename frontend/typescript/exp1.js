var Product = /** @class */ (function () {
    function Product(id, name) {
        this.id = id;
        this.name = name;
    }
    Product.prototype.getId = function () {
        return this.id;
    };
    Product.prototype.setId = function (id) {
        this.id = id;
    };
    Product.prototype.getName = function () {
        return this.name;
    };
    return Product;
}());
var product = new Product(1, "samsung");
console.log("product=" + product.getId() + "-" + product.getName());
