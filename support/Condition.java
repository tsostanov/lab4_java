package edu.lab3100.support;

public enum Condition {
    Hot("Жар"),
    Cold("Холод");
    private String value;
    private Condition(String s){
        value = s;
    }
    @Override
    public String toString(){
        return value;
    }
}
