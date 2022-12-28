package edu.lab3100.protagonists;
import edu.lab3100.support.Place;

public class TargetPlace extends Place {

    private Place back;
    public TargetPlace(String s) {
        super(s);
    }

    public void getplace(Place place){
        this.back = place;
        class Informator{
            public void getInformation(String name){
                System.out.println(name + " располагается на объекте " + place.toString());
            }
        }
        Informator inf = new Informator();
        inf.getInformation(this.getName());
    }
    public Place getback(){
        return this.back;
    }
}