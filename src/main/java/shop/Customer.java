package shop;

/**
 * Класс Customer. Описание покупателя.
 */
public class Customer {
    private String name;

    public Customer() {
        this.name = "NoName";
    }

    public Customer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Метод вывода в консоль информации о покупателе.
     * @return - возвращает инфоомационную строку о покупателе.
     */
    @Override
    public String toString() {
        return String.format("Name: " + getName());
    }
}