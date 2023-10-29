package shop;

/**
 * Класс NoClientNameExeption формирует исключение, если нет покупателя в базе данных покупателей.
 */
public class NoClientNameExeption extends RuntimeException {
    NoClientNameExeption(String message) {
        super(message);
    }
}