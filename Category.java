// Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.

package Shop;

public class Category {
    String categoryName;
    Product [] products = new Product[4];

    public Category(String categoryName, Product [] products) {
        this.categoryName = categoryName;
        this.products = products;
    }

    public Category(){

    }

    public String GetCategoryName() {
        return categoryName;
    }

    public void SetCategoryName(String categoryName){
        this.categoryName = categoryName;
    }

    public Product [] GetProduct(){
        return products;
    }

    public void SetProduct (Product [] products) {
        this.products = products;
    }


}
