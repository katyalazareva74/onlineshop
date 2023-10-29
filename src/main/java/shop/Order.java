package shop;

/**
 * Класс Order. Описывает заказ товара покупателем.
 */

public class Order {
    private int id;
    private Customer customer;
    private Product product;

    public Order() {
        this.product = new Product();
        this.customer = new Customer();
    }

    public Order(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    /**
     * Метод формирует заказ товара в интернет-магазине.
     * @param order - заказ
     * @param customers - покупатель
     * @param products - товар
     * @return - возвращает сформированный заказ.
     * @throws NoClientNameExeption - выбрасывается исключение, если покупателя нет в базе покупателей.
     * @throws NotEnoughProductExeption - выбрасывается исключение, если товара нет в достаточном количестве в магазине.
     * @throws NoProductExeption - выбрасывается исключение, если товара нет в магазине.
     */

    public static Order buyProduct(String order, Customer[] customers, Product[] products) throws NoClientNameExeption, NotEnoughProductExeption, NoProductExeption {
        Customer cust = new Customer();
        Product prod1 = new Product();
        String[] orders = order.split(",");
        int i = 0;
        for (String str : orders) {
            orders[i] = str;
            i++;
        }
        Integer ord = Integer.valueOf(orders[2]);
        int count = 0;
        for (Customer item : customers) {
            if (item.getName().equals(orders[0])) {
                cust = item;
                count++;
            }
        }
        if (count == 0) {
            throw new NoClientNameExeption("No name client -> " + orders[0]);
        }
        count = 0;
        for (Product item : products) {
            if (item.getName().equals(orders[1])) {
                count++;
                if ((ord > 0) && (ord <= item.getQuantity())) {
                    prod1 = new Product(item.getName(), item.getPrice(), ord);
                    item.setQuantity(item.getQuantity() - ord);
                } else {
                    throw new NotEnoughProductExeption("Not enough product -> " + item.getName() + "; quantity: " + ord);
                }
            }
        }
        if (count == 0) {
            throw new NoProductExeption("No product -> " + orders[1]);
        }
        Order ordern = new Order(cust, prod1);
        System.out.println("Order successful!");
        return ordern;
    }

    /**
     * Метод выводит в консоль инфоомацию о заказе.
     * @return - возвращает информационную строкку о заказе
     */
    @Override
    public String toString() {
        return String.format("№ " + this.id + "-> Name: " + customer.getName() + "-> Product: " + product.getName() +
                " - price: " + product.getPrice() + " - quantity: " + product.getQuantity());
    }
}


