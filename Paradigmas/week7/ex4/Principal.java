public class Principal{
    public static void main(String args[]){
        ServicoMusica s1 = new SpotifyAdapter(new Spotify());
        ServicoMusica s2 = new YtMusicAdapter(new YtMusic());

        s1.reproduzirMusica("Caneta azul");
        s2.reproduzirMusica("Resenha do arrocha");
    }
}