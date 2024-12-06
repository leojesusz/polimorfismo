package pokedex;

public class Pokedex {
    public static void main(String[] args) {
        Eevee e = new Eevee();
        Jolteon j = new Jolteon();
        Vaporeon v = new Vaporeon();
        Flareon f = new Flareon();
        Espeon esp = new Espeon();
        Umbreon umb = new Umbreon();
        Leafeon l = new Leafeon();
        Glaceon g = new Glaceon();
        Sylveon s = new Sylveon();

       
        System.out.println("Eu sou: Eevee " + " #" + e.numeroPokedex());
        e.imprimir();  
        System.out.println("Ataque: " + e.ataque());
        System.out.println("Defesa: " + e.defesa());
        System.out.println("Especial: " + e.especial());
        System.out.println("");

        // Evoluções
        evoluirEMostrar(j, "Jolteon", "Pedra do Trovão");
        evoluirEMostrar(v, "Vaporeon", "Pedra da Água");
        evoluirEMostrar(f, "Flareon", "Pedra do Fogo");
        evoluirEMostrar(esp, "Espeon", "Amizade durante o dia");
        evoluirEMostrar(umb, "Umbreon", "Amizade durante a noite");
        evoluirEMostrar(l, "Leafeon", "Pedra da Folha");
        evoluirEMostrar(g, "Glaceon", "Pedra do Gelo");
        evoluirEMostrar(s, "Sylveon", "Amizade + Aprendendo ataque tipo fada");
    }

    public static void evoluirEMostrar(Eevee evolucao, String nome, String pedra) {
        System.out.println("Eevee evoluiu para " + nome + " usando a " + pedra + "!");
        System.out.println("Eu sou: " + nome + " #" + evolucao.numeroPokedex());
        evolucao.imprimir(); 
        System.out.println("Ataque: " + evolucao.ataque());
        System.out.println("Defesa: " + evolucao.defesa());
        System.out.println("Especial: " + evolucao.especial());
        System.out.println();
    }
}
