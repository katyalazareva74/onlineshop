package shop;

/**
 * Класс Product. Описание товара.
 */
public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {
        this.name = "NonmaeProduct";
        this.price = 0;
        this.quantity = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    /**
     * Метод вывода в консоль информации о товаре.
     * @return-  возвращает информационную строку о товаре.
     */
    @Override
    public String toString() {
        return String.format("Name: " + this.name + "-> Price: " + this.price + "-> Quantity: " + this.quantity);
    }
}
