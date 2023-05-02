package Planets;

import Explorers.Explorer;

public class Morag implements Planet {
     @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
