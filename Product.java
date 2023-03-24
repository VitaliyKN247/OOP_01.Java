// Создать класс Товар, имеющий переменные имя, цена, рейтинг.

package Shop;

public class Product {
    private String name;
    private String price;
    private String raiting;

    public Product (String name, String price, String raiting) {
        this.name = name;
        this.price = price;
        this.raiting = raiting;
    }

    public String GetName() {
        return name;
    }

    public String GetInfo(){    // метод по выводу корректных данных вместо вывода 'toString' по умолчанию
        return String.format("Number: %s, Price: %s, Raiting: %s ", name, price, raiting);
    }

    public void SetName(String name){
        this.name = name;
    }

    public String GetPrice(){
        return price;
    }

    public void SetPrice(String price) {
        this.price = price;
    }

    public String GetRaiting() {
        return raiting;
    }

    public void SetRaiting (String raiting) {
        this.raiting = raiting;
    }

    // public String ToString () {
    //     return "Product " + "name ='" + name + '\'' + "price = '" + price + '\'' + "raiting ='" + raiting + '\'';
    // }
}
