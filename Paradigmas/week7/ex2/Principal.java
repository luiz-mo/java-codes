
import java.util.*;

public class Principal{
    public static void main(String args[]){
        ArrayList<Monitor> lista = new ArrayList<>();
        lista.add(new Monitor("venomussi", 1, "Paradigmas"));
        lista.add(new Monitor("cecilio", 2, "ICC"));
        lista.add(new Monitor("josefa", 3, "ICC"));

        System.out.println(lista.get(1));

        for(Monitor monitor : lista)
            System.out.println(monitor);

        lista.remove(1);

        Iterator<Monitor> i = lista.iterator();
        while(i.hasNext()){
            Monitor monitor = i.next();
            System.out.println(monitor);
        }
        
    }
}