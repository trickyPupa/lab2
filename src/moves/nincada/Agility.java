package moves.nincada;

import ru.ifmo.se.pokemon.*;

public class Agility extends PhysicalMove {
    public Agility() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pok){
        pok.setMod(Stat.SPEED, 2);
    }
}
