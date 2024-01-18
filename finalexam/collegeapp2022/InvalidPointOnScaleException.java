package finalexam.collegeapp2022;

import java.util.Random;

public class InvalidPointOnScaleException extends Exception {

    public static void main(String[] args) {
        new Random().nextInt(20, 201);
    }

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public InvalidPointOnScaleException(String message){
        setMessage(message);
    }
    @Override
    public String getMessage() {
        return message;
    }
}
