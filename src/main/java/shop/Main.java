package shop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Метод main формирует массив покупателей, массив товаров и массив заказов.
     * Выводит информацию в кончоль о количестве успешных заказов и все заказы.
     * @param args
     */
    public static void main(String[] args) {
        Customer custom1 = new Customer("Ivan");
        Customer custom2 = new Customer("Anna");
        Customer custom3 = new Customer("Masha");
        Customer[] customers = {custom1, custom2, custom3};
        Product product1 = new Product("car", 500, 4);
        Product product2 = new Product("bear", 700, 3);
        Product product3 = new Product("doll", 650, 5);
        Product product4 = new Product("robot", 1000, 2);
        Product[] products = {product1, product2, product3, product4};
        String[] strings = {"Ivan,car,2", "Sergey,car,2", "Anna,robot,3", "Masha,bear,2", "Ivan,boat,2", "Anna,doll,3", "Masha,doll,3"};
        List<Order> orders = new ArrayList<Order>();
        int count = 0, id=1;
        for (String str : strings) {
            try {
                Order order = Order.buyProduct(str, customers, products);
                order.setId(id++);
                orders.add(order);
                count++;
            } catch (RuntimeException e) {
                Order order = new Order();
                order.setId(id++);
                orders.add(order);
                System.out.println(e);
            }
        }
        System.out.printf("Total completed orders: %d\n ", count);
        for (Order ord:orders ) {
            System.out.println(ord);
        }
    }
}
