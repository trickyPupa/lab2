package pokemons;

import moves.furfrou.*;
import ru.ifmo.se.pokemon.*;

public class Furfrou extends Pokemon {
    public Furfrou(String name, int lvl) {
        super(name, lvl);

        setType(Type.NORMAL);
        setStats(75, 80, 60, 65, 90, 102);
        setMove(new SandAttack(), new DoubleTeam(), new TakeDown(), new Charm());
    }
}
