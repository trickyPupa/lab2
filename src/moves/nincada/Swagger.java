package moves.nincada;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon pok) {
        pok.confuse();
        pok.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected String describe(){
        String[] verb = this.getClass().toString().split("\\.");
        return "does " + verb[verb.length - 1];
    }
}
