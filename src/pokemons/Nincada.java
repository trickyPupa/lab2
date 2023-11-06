package pokemons;

import moves.Absorb;
import moves.nincada.*;
import ru.ifmo.se.pokemon.*;

public class Nincada extends Pokemon {
    public Nincada(String name, int lvl) {
        super(name, lvl);

        setType(Type.BUG, Type.GROUND);
        setStats(31, 45, 90, 30, 30, 40);
        setMove(new Absorb(), new Swagger(), new AerialAce());
    }
}
