package moves.furfrou;
import ru.ifmo.se.pokemon.*;

public class SandAttack extends StatusMove{
    public SandAttack(){
        super(Type.GROUND, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pok) {
        pok.setMod(Stat.ACCURACY, -1);
    }

    @Override
    protected String describe(){
        String[] verb = this.getClass().toString().split("\\.");
        return "does" + verb[verb.length - 1];
    }
}
