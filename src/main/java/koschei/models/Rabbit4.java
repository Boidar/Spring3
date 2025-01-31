package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {
    final private Duck5 duck;
    @Autowired
    public Rabbit4 (Duck5 duck) {this.duck = duck;}

    @Override
    public String toString() {
        return ", в сундуке — заяц" + duck.toString();
    }
}
