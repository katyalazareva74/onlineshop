package shop;
public class NoProductExeption extends RuntimeException{
    NoProductExeption (String message){
        super(message);
    }
}