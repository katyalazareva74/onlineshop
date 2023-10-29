package shop;

/**
 * Класс NotEnoughProductExeption формирует исключение в случае, когда нет достаточного количества товара.
 */
public class NotEnoughProductExeption extends RuntimeException{
    NotEnoughProductExeption (String message){
        super(message);
    }
}