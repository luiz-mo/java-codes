public class SpotifyAdapter implements ServicoMusica{
    private Spotify spotify;

    public SpotifyAdapter(Spotify spotify){
        this.spotify = spotify;
    }

    @Override
    public void reproduzirMusica(String musica){
        spotify.tocarMusica(musica);
    }
}