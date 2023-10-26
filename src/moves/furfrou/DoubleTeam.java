package moves.furfrou;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove{
    public DoubleTeam() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pok) {
        pok.setMod(Stat.EVASION, 1);
    }

    @Override
    protected String describe(){
        String[] verb = this.getClass().toString().split("\\.");
        return "does" + verb[verb.length - 1];
    }
}