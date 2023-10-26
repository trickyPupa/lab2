package moves.furfrou;
import ru.ifmo.se.pokemon.*;

public class Charm extends StatusMove {
    public Charm() {
        super(Type.FAIRY, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pok) {
        pok.setMod(Stat.ATTACK, -2);
    }

    @Override
    protected String describe(){
        String[] verb = this.getClass().toString().split("\\.");
        return "does" + verb[verb.length - 1];
    }
}
