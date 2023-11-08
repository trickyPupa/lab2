package pokemons;

import moves.oddish.QuiverDance;
import ru.ifmo.se.pokemon.Type;

public class Bellossom extends Gloom{
    public Bellossom(String name, int lvl) {
        super(name, lvl);
        setStats(75, 80, 95, 90, 100, 50);
        setType(Type.GRASS);
        addMove(new QuiverDance());
    }
}
