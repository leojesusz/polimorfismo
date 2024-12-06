package pokedex;

public class Vaporeon extends Eevee {
    public Vaporeon() {
        super();
        setTipo("Água");
        setAltura(100); 
        setHP(130); 
        setPeso(29.0); 
    }

    @Override
    public String ataque() {
        return "Jato d'água";
    }

    @Override
    public String defesa() {
        return "Escudo de água";
    }

    @Override
    public String especial() {
        return "Hidro bomba";
    }

    @Override
    public String descricao() {
        return "Vaporeon, o Pokémon Jato de Bolhas. Sua composição celular é semelhante à das moléculas de água. Por isso, quando se funde com ela, pode tornar-se invisível.";
    }

    @Override
    public int numeroPokedex() {
        return 134; 
    }
}
