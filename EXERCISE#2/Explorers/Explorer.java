package Explorers;

import Planets.Mars;
import Planets.Planet;
import Planets.Mercury;
import Planets.Saturn;
import Planets.Venus;
import Planets.Morag;

public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Venus venus);

    void visit(Morag morag);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}