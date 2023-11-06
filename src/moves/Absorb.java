package moves;

import ru.ifmo.se.pokemon.*;

public class Absorb extends SpecialMove {
    public Absorb() {
        super(Type.GRASS, 20, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon pok, double d){
        pok.setMod(Stat.HP, (int) -Math.round(d * 0.5));
    }

    @Override
    protected String describe(){
        String[] verb = this.getClass().toString().split("\\.");
        return "does " + verb[verb.length - 1];
    }
}
