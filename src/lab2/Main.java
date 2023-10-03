package lab2;

import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        var battle = new Battle();

        battle.addAlly(new Armaldo("Detrolex",10));
        battle.addAlly(new Magnemite("Cendol", 1));
        battle.addAlly(new Volbeat("Venarus",1));

        battle.addFoe(new Minim("Mizin",1));
        battle.addFoe(new Magneton("Ergoferon",1));
        battle.addFoe(new Claydol("DexPanTenol",10));

        battle.go();
    }
}