package shop;

/**
 * Класс NoProductExeption формирует исключение в случае, когда нет товара в магазине.
 */
public class NoProductExeption extends RuntimeException{
    NoProductExeption (String message){
        super(message);
    }
}