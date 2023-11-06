import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class PokemonBattle {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Oddish("Амадей", 1);
        Pokemon p2 = new Furfrou("Альфонс", 1);
        Pokemon p3 = new Gloom("Альфред", 1);
        Pokemon p4 = new Furfrou("Артур", 1);

        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.go();
    }
}
