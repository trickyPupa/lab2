import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class PokemonBattle {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Pokemon("Чужой", 1);
        Pokemon p2 = new Furfrou("Альфонс", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}
