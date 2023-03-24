package Shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DemoShop {
    public static void main(String[] args) throws IOException {
        Product product_1 = new Product("Beef", "25", "9/10");
        Product product_2 = new Product("Milk", "19", "9/10");
        Product product_3 = new Product("Bread", "10", "6/10");
        Product product_4 = new Product("Orange", "16", "7/10");
    

    // BufferedReader users = new BufferedReader(new InputStreamReader(System.in));
    // BufferedReader password = new BufferedReader(new InputStreamReader(System.in));
    // BufferedReader busket = new BufferedReader(new InputStreamReader(System.in));


    //User user_1 = new User();
    User user_2 = new User();

    // System.out.println("Input Login: ");
    // user_2.setLogin(users.readLine());
    // System.out.println("Input Password: ");
    // user_2.setPassword(password.readLine());
    // System.out.println("Chose Basket: ");
    // user_2.setBusket(busket.readLine());

    RealUser();

    Product [] products = {product_1, product_2, product_3, product_4};
    //System.out.println(products.GetInfo());

    

    for (int i = 0; i < products.length; i++) {
        System.out.println(products[i].GetInfo());
    }

    }

    public static void RealUser () throws IOException {
        BufferedReader users = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader password = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader busket = new BufferedReader(new InputStreamReader(System.in));

        User user_1 = new User();

        System.out.println("Input Login: ");
        user_1.setLogin(users.readLine());
        System.out.println("Input Password: ");
        user_1.setPassword(password.readLine());
        System.out.println("Chose Basket: ");
        user_1.setBusket(busket.readLine());
    }
}
