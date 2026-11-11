public class Principal{
    public static void main(String args[]){
        DispositivoFactory dispF = new DispositivoFactory();
        Dispositivo d1 = dispF.criarDispositivo("celular", "Iphone 17");
        Dispositivo d2 = dispF.criarDispositivo("laptop", "Mac Book sei la qual");

        d1.ligar();
        d2.ligar();
    }
}