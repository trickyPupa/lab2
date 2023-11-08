import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class PokemonBattle {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon england1 = new Furfrou("Альфонс", 1);
        Pokemon england2 = new Gloom("Альфред", 1);
        Pokemon england3 = new Nincada("Артур", 1);
        Pokemon france1 = new Oddish("Амадей", 1);
        Pokemon france2 = new Ninjask("Альберт", 1);
        Pokemon france3 = new Bellossom("Аполлон", 1);

        b.addAlly(england1);
        b.addAlly(england2);
        b.addAlly(england3);
        b.addFoe(france1);
        b.addFoe(france2);
        b.addFoe(france3);

        b.go();
    }
}
