package edu.lab3100.support;


import edu.lab3100.protagonists.Protagonist;
import edu.lab3100.protagonists.TargetPlace;

public interface IntProtagonists {
    void MoveAction(TargetPlace target) throws PlaceException;
    void MoveAction(TargetPlace target, Protagonist person);
    void GuessAction(String thing);
    void condition(Condition condition);
}
