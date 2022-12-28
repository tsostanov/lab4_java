package edu.lab3100.protagonists;
import edu.lab3100.support.Condition;
import edu.lab3100.support.IntProtagonists;
import edu.lab3100.support.Place;
import edu.lab3100.support.PlaceException;

public class Protagonist implements IntProtagonists {
    private final String name;
    private Place back;

    public Protagonist (String name){
        this.name = name;
        System.out.println("Герой по имени " + name  + " вводится в повествование");
    }

    public void getplace(Place place) {
        this.back = place;
        System.out.println(this.name + " находится на объекте " + place.toString());
    }

    public String getname() {
        return this.name;
    }

    @Override
    public void MoveAction(TargetPlace target) throws PlaceException {
        if (back.equals(target.getback())){
        System.out.println(this.name + " идет в сторону " + target +
                " по поверхности объекта " + back.toString());
        }

        else{
            throw new PlaceException(this.name + " никак не сможет туда дойти.");
        }
    }

    @Override
    public void MoveAction(TargetPlace target, Protagonist person) throws PlaceException{
        if (this.back.equals(target.getback()) & this.back.equals(person.back)
                & !this.getname().equals(person.getname())) {
            System.out.println(this.name + " идет в сторону " + target +
                    " по поверхности объекта " + this.back + " вместе с героем по имени " + person.name);
        }
        else{
            throw new PlaceException(this.name + " никак не сможет туда дойти с " + person + ".");
        }
    }

    public static class HeadTrouble{
        public void headCheck(String name){
            if (name.equals("Незнайка")){
                if (Math.random() > 0.7){
                    System.out.println("Даже у Незнайки в глазах все поплыло и он упал");
                }
            }
            else {
                if (Math.random() > 0.2){
                    System.out.println("У героя " + name + " закружилась голова и он упал");
                }
            }
        }
    }

    @Override
    public void GuessAction(String thing) {
        System.out.println(this.name + " ничего не знает о " + thing);

    }

    @Override
    public void condition(Condition condition) {
        System.out.println(this.name + " испытывает " + condition.toString());
    }

}

