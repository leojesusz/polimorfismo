package pokedex;

public class Glaceon extends Eevee {
    public Glaceon() {
        super();
        setTipo("Gelo");
        setAltura(90); 
        setHP(65);
        setPeso(25.0); 
    }

    @Override
    public String ataque() {
        return "Raio de gelo";
    }

    @Override
    public String defesa() {
        return "Escudo de gelo";
    }

    @Override
    public String especial() {
        return "Tempestade de neve";
    }

    @Override
    public String descricao() {
        return "Glaceon, o Pokémon Neve Fresca. Pode controlar a temperatura do seu corpo à vontade. Isso lhe permite congelar a umidade na atmosfera, criando rajadas de poeira de diamante.";
    }

    @Override
    public int numeroPokedex() {
        return 471; 
    }
}
