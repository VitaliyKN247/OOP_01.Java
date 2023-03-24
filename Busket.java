// Создать класс Basket, содержащий массив купленных товаров.

package Shop;

public class Busket {
    Product [] buyProducts = new Product [4];

    public Busket (Product [] buyProducts) {
        this.buyProducts = buyProducts;
    }

    public Busket(){

    }

    public Product [] GetBuyProduct(){
        return buyProducts;
    }

    public void SetBuyProduct (Product[] buyProducts){
        this.buyProducts = buyProducts;
    }
}
