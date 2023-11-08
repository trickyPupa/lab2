package moves.oddish;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon pok) {
        pok.setMod(Stat.SPECIAL_ATTACK, -1);
    }

    @Override
    protected String describe(){
        String[] verb = this.getClass().toString().split("\\.");
        return "does " + verb[verb.length - 1];
    }
}
