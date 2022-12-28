package edu.lab3100.protagonists;

import edu.lab3100.support.minor;


public class MinorPersons implements minor {
    private String name;
    private Background back;

    public MinorPersons(String name){
        this.name = name;
        System.out.println(name + " где-то существует");
    }
    public MinorPersons(String name, Background place){
        this.name = name;
        this.back = place;
        System.out.println(name + " располагается на объекте " + place.toString());
    }

    @Override
    public void description(String information) {
       System.out.println(this.name + " "  + information);
    }

    public String getName(){
        return this.name;
    }
}
