package pokedex;

public class Flareon extends Eevee {
    public Flareon() {
        super();
        setTipo("Fogo");
        setAltura(90); 
        setHP(65); 
        setPeso(25.0); 
    }

    @Override
    public String ataque() {
        return "Brasas";
    }

    @Override
    public String defesa() {
        return "Escudo de calor";
    }

    @Override
    public String especial() {
        return "Explosão de fogo";
    }

    @Override
    public String descricao() {
        return "Flareon, o Pokémon Chama. Armazena parte do ar que inala em sua bolsa de chamas interna, que o aquece a mais de 1600°C";
    }

    @Override
    public int numeroPokedex() {
        return 136; 
    }
}
