package pokedex;

public class Sylveon extends Eevee {
    public Sylveon() {
        super();
        setTipo("Fada");
        setAltura(100);
        setHP(95); 
        setPeso(23.5); 
    }

    @Override
    public String ataque() {
        return "Beijo encantado";
    }

    @Override
    public String defesa() {
        return "Corte encantado";
    }

    @Override
    public String especial() {
        return "Raio encantado";
    }

    @Override
    public String descricao() {
        return "Sylveon, o Pokémon Entrelaçamento. As antenas em forma de fita de Sylveon emitem ondas que têm um efeito calmante e podem interromper conflitos. Se colocar suas antenas em seu treinador, Sylveon pode entender suas emoções.";
    }

    @Override
    public int numeroPokedex() {
        return 700; 
    }
}
