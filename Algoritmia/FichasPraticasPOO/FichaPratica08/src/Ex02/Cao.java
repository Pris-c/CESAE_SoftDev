package Ex02;

public class Cao {

    private String name;
    private String raca;
    private String latido = " Au au au";

    /**
     * Método construtor para cão
     * @param name Nome do cão
     * @param raca Raça do cão
     */
    public Cao(String name, String raca) {
        this.name = name;
        this.raca = raca;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getLatido() {
        return latido;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }

    public void ladrar(){
        System.out.println(this.latido);
    }
}
