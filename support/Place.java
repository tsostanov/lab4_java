package edu.lab3100.support;

public abstract class Place {
    private String Name;
    public String getName(){
        return Name;
    }
    public Place(String name){
        Name = name;
        System.out.printf("Объект " + name +  " вводится в повествование\n");
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }
            else {
            return true;
            }
        }
        else {
        return false;
        }
    }
    @Override
    public int hashCode() {
        return this.Name.hashCode();
    }
    @Override
    public String toString(){
        return this.Name;
    }
}