package moves.nincada;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
    public AerialAce(){
        super(Type.FLYING, 60, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
}
