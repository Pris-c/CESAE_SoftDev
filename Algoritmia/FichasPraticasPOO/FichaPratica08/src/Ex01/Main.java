package Ex01;

import Ex01.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Priscila", 32, 1.65);

        System.out.println("Pessoa 1");
        System.out.println("Nome: " + p1.getName());
        System.out.println("Idade: " + p1.getAge());
        System.out.println("Altura: " + p1.getHeight());

    }
}