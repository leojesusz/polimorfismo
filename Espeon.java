package pokedex;

public class Espeon extends Eevee {
    public Espeon() {
        super();
        setTipo("Psíquico");
        setAltura(90); 
        setHP(65); 
        setPeso(26.5);
    }

    @Override
    public String ataque() {
        return "Poder psíquico";
    }

    @Override
    public String defesa() {
        return "Barreira";
    }

    @Override
    public String especial() {
        return "Raio psíquico";
    }

    @Override
    public String descricao() {
        return "Espeon, o Pókemon Sol. Quando o sol atinge a joia na testa do Espeon, ele acumula poder psíquico. É extremamente leal a qualquer treinador que considere digno. Diz-se que este Pokémon desenvolveu seus poderes precognitivos para proteger seu treinador do perigo.";
    }

    @Override
    public int numeroPokedex() {
        return 196; 
    }
}
