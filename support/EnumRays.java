package edu.lab3100.support;

public enum EnumRays {
    Cosmic("Космические"),
    Normal("Обычные");
    private String value;
    private EnumRays(String s){
        value = s;
    }
    @Override
    public String toString(){
        return value;
    }
}
