package Ex03;

public class Main {
    public static void main(String[] args) {


        Animal animal1 = new Animal("Perna Longa", "coelho", "Bolívia", 3.5, new String[] {"cenoura", "couve", "nabo"});

        //System.out.println(animal1.getAlimentacao()[0]);

        System.out.println("Peso antes de oferecer a primeira refeição: " + animal1.getPeso() + " kg.");
        animal1.comer("cenoura", 300);
        System.out.println("Peso depois de ser oferecerido cenoura (consta na dieta): " + animal1.getPeso() + " kg.");
        animal1.comer("tomate", 1000);
        System.out.println("Peso depois de ser oferecerido tomate (não conta na dieta): " + animal1.getPeso() + " kg.");

    }
}
