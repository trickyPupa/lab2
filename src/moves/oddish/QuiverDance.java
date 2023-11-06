package moves.oddish;

import ru.ifmo.se.pokemon.*;

public class QuiverDance extends StatusMove {
    public QuiverDance() {
        super(Type.BUG, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pok) {
        Effect e = new Effect();
        e.stat(Stat.SPECIAL_ATTACK, 1).stat(Stat.SPECIAL_DEFENSE, 1).stat(Stat.SPEED, 1).turns(-1);
        pok.addEffect(e);
    }

    @Override
    protected String describe(){
        String[] verb = this.getClass().toString().split("\\.");
        return "соверешает " + verb[verb.length - 1];
    }
}
