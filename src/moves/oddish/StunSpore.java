package moves.oddish;

import ru.ifmo.se.pokemon.*;

public class StunSpore extends StatusMove {
    public StunSpore() {
        super(Type.GRASS, 0, 75);
    }

    @Override
    protected void applyOppEffects(Pokemon pok) {
        Effect.paralyze(pok);
    }

    @Override
    protected String describe(){
        String[] verb = this.getClass().toString().split("\\.");
        return "does " + verb[verb.length - 1];
    }
}
