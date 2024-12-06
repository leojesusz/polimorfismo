package pokedex;

public class Leafeon extends Eevee {
    public Leafeon() {
        super();
        setTipo("Grama");
        setAltura(105); 
        setHP(65); 
        setPeso(25.5); 
    }

    @Override
    public String ataque() {
        return "Folhas cortantes";
    }

    @Override
    public String defesa() {
        return "Raízes protetoras";
    }

    @Override
    public String especial() {
        return "Tornado de folhas";
    }

    @Override
    public String descricao() {
        return "Leafeon, o Pokémon Verdejante. Tal como uma planta, ele realiza fotossíntese. Por isso, sempre está envolto de ar puro. O perfume feito por suas folhas é bastante popular";
    }

    @Override
    public int numeroPokedex() {
        return 470; 
    }
}
