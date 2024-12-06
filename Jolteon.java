package pokedex;

public class Jolteon extends Eevee {
    public Jolteon() {
        super();
        setTipo("Elétrico");
        setAltura(70);
        setHP(60); 
        setPeso(24.5); 
    }

    @Override
    public String ataque() {
        return "Trovoada";
    }

    @Override
    public String defesa() {
        return "Carga";
    }

    @Override
    public String especial() {
        return "Raio";
    }

    @Override
    public String descricao() {
        return "Jolteon, o Pokémon Relâmpago. As células de Jolteon geram um baixo nível de eletricidade. Esse poder é amplificado pela eletricidade estática de sua pelagem, permitindo que ele solte raios";
    }

    @Override
    public int numeroPokedex() {
        return 135; 
    }
}
