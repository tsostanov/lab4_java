package edu.lab3100;

import edu.lab3100.protagonists.*;
import edu.lab3100.support.*;

public class main {
    public static void main(String[] args) throws PlaceException {
        try {
            Background moon = new Background("Луна");
            minor minor = new minor() {
                @Override
                public void description(String information) throws StayException {
                    if (information instanceof String){
                        throw new StayException();
                    }
                }
            };
            try {
                minor.description("Some text");
            } catch (StayException e){
                System.out.println("На луне сила тяжести меньше, из-за чего меньшее количество крови опускается к ногам, " +
                        "\nпоэтому у героев может возникнуть эффект головокружение");
            }

            TargetPlace pyramid = new TargetPlace("Пирамида");
            pyramid.getplace(moon);

            MinorPersons road = new MinorPersons("Дорога", moon);
            road.description("кажется близкой, но это не так");

            MinorPersons air = new MinorPersons("Воздух", moon);
            air.description("почти полностью отсутствует");

            Protagonist Neznaika = new Protagonist("Незнайка");
            Neznaika.getplace(moon);

            Protagonist Ponsik = new Protagonist("Пончик");
            Ponsik.getplace(moon);

            try {
                Neznaika.MoveAction(pyramid);
                Protagonist.HeadTrouble trouble = new Protagonist.HeadTrouble();
                trouble.headCheck(Neznaika.getname());
            } catch (PlaceException e){
                System.out.println(Neznaika.getname() + " никак не сможет дойти до объекта " + pyramid);
            }

            try {
                Ponsik.MoveAction(pyramid, Neznaika);
                Protagonist.HeadTrouble trouble = new Protagonist.HeadTrouble();
                trouble.headCheck(Ponsik.getname());
            } catch (PlaceException e){
                System.out.println(Ponsik.getname() + " никак не сможет дойти до объекта " + pyramid
                        + "вместе с героем по имени " + Neznaika.getname());
            }

            ActivePlace sun = new ActivePlace("Солнце");
            sun.sunrise(Neznaika, moon);
            sun.sunrise(Ponsik, moon);
            sun.compare();

            Neznaika.condition(Condition.Hot);
            Ponsik.condition(Condition.Hot);

            MinorPersons sidepersons = new MinorPersons("Фуксия и Селедочка");
            sidepersons.description("рассказывали Незнайке о опасности космических лучей");

            Neznaika.GuessAction(EnumRays.Cosmic + " лучи");
        } catch (Exception e){
            System.out.println("Что-то пошло не так");
        }

    }
}
