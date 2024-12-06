package pokedex;

public class Eevee {
    private String tipo;
    private int altura;
    private int HP;
    private double peso;

    
    public Eevee() {
        this.tipo = "Normal";
        this.altura = 30; 
        this.HP = 55;
        this.peso = 6.5; 
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    public String ataque() {
        return "Ataque rápido";
    }
    
    public String defesa() {
        return "Desvio";
    }
    
    public String especial() {
        return "Tri-ataque";
    }
    
    
    public void imprimir() {
        System.out.println("Descrição Pokédex: " + descricao());
        System.out.println("Tipo: " + tipo);
        System.out.println("Altura: " + altura + " cm");
        System.out.println("HP: " + HP);
        System.out.println("Peso: " + peso + " kg");
    }

    public String descricao() {
        return "Eevee, o Pokémon Evolução. Graças à sua composição genética instável, este Pokémon especial esconde muitas possíveis evoluções diferentes.";
    
    }

    public int numeroPokedex() {
        return 133;
    }
}
