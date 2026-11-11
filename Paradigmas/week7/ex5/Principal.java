public class Principal{
    public static void main(String args[]){
        Feed feed = new Feed();

        Usuario u1 = new Usuario("Cecilio", feed);
        Usuario u2 = new Usuario("Josefa", feed);

        feed.setPost("Luiz lança candidatura a presidencia");

    }
}