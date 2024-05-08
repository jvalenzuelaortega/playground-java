package org.example.bean;

public class Greeting {

    private String message;

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void startGreeting(){
        System.out.println(message);
    }
}
