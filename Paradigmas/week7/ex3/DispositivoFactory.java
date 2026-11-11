public class DispositivoFactory{
    public Dispositivo criarDispositivo(String tipo, String modelo){
        if(tipo.equalsIgnoreCase("celular"))
            return new Celular(modelo);
        else if(tipo.equalsIgnoreCase("laptop"))
            return new Laptop(modelo);
        else
            return null;
    }   
}