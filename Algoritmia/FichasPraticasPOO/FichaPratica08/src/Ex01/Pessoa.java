package Ex01;

public class Pessoa {

    private String name;
    private int age;
    private double height;


    /**
     * Método construtor para Pessoa
     * @param name Nome Civil
     * @param age Idade
     * @param heigth Altura em metros
     */
    public Pessoa(String name, int age, double heigth){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

}
