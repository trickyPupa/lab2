package pokemons;

import moves.oddish.*;
import ru.ifmo.se.pokemon.*;

public class Oddish extends Pokemon {
    public Oddish(String name, int lvl){
        super(name, lvl);
        setStats(45, 50, 55, 75, 65, 30);
        setType(Type.GRASS, Type.POISON);
        setMove(new Confide(), new StunSpore());
    }
}
