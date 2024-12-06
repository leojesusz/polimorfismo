package pokedex;

public class Umbreon extends Eevee {
    public Umbreon() {
        super();
        setTipo("Sombrio");
        setAltura(100); 
        setHP(95); 
        setPeso(27.0); 
    }

    @Override
    public String ataque() {
        return "Mordida sombria";
    }

    @Override
    public String defesa() {
        return "Barreira sombria";
    }

    @Override
    public String especial() {
        return "Luar";
    }

    @Override
    public String descricao() {
        return "Umbreon, o Pokémon Luar. Este Pokémon é noturno. Mesmo na escuridão total, seus grandes olhos podem detectar sua presa claramente. Quando exposto à aura da lua, os anéis em seu corpo brilham levemente e ele ganha um poder misterioso.";
    }

    @Override
    public int numeroPokedex() {
        return 197; 
    }
}
