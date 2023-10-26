package moves.furfrou;
import ru.ifmo.se.pokemon.*;

public class TakeDown extends PhysicalMove {
    public TakeDown() {
        super(Type.NORMAL, 90, 85);
    }

    @Override
    protected void applySelfDamage(Pokemon pok, double d) {
        pok.setMod(Stat.HP, (int) Math.round(d * 0.25));
    }

    @Override
    protected String describe(){
        String[] verb = this.getClass().toString().split("\\.");
        return "does" + verb[verb.length - 1];
    }
}
