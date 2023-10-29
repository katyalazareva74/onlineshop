package shop;
public class NotEnoughProductExeption extends RuntimeException{
    NotEnoughProductExeption (String message){
        super(message);
    }
}