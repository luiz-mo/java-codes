public class Laptop implements Dispositivo{
    private String modelo;
    private int bateria;

    public Laptop(){}

    public Laptop(String modelo){
        this.modelo = modelo;
        this.bateria = 100;
    }

    @Override
    public void ligar(){
        System.out.printf("Ligando seu %s com %d de bateria\n", this.modelo, this.bateria);
    }
}