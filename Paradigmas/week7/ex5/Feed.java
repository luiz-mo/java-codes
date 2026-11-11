import java.util.*;

public class Feed  extends Observable{
    public String post;

    public String getPost(){
        return this.post;
    }

    public void setPost(String novoPost){
        this.post = novoPost;

        setChanged();
        notifyObservers();
    }
}