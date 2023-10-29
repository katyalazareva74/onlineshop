package exeption;
public class NoClientNameExeption extends RuntimeException{
    NoClientNameExeption (String message){
        super(message);
    }
}