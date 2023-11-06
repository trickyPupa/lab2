package pokemons;

import moves.nincada.Agility;

public class Ninjask extends Nincada{
    public Ninjask(String name, int lvl) {
        super(name, lvl);

        setStats(61, 90, 45, 50, 50, 160);
        addMove(new Agility());
    }
}
