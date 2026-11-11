import java.util.*;

public class Usuario implements Observer{
    private String nome;

    public Usuario(String nome, Observable feed){
        this.nome = nome;
        feed.addObserver(this);
    }

    @Override
    public void update(Observable feed, Object a){
        if(feed instanceof Feed){
            Feed feedAtt = (Feed) feed;
            System.out.println(
                nome + " recebeu uma nova postagem: "
                + feedAtt.getPost()
            );
        }
    }
}