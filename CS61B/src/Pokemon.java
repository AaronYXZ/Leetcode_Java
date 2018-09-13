
// Demonstrate pass by value


public class Pokemon {

    public String name;
    public int level;

    public Pokemon(String name, int level){
        this.name = name;
        this.level = level;
    }

    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon("Pikachu", 17);
        int level = 100;
        change(pokemon, level);
        System.out.println("Name: " + pokemon.name + " Level: "+ pokemon.level);
    }

    public static void change(Pokemon pokemon, int level){
        pokemon.level = level;
        level = 50;
        pokemon = new Pokemon("G", 1);
    }

}
