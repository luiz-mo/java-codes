public class YtMusicAdapter implements ServicoMusica{
    private YtMusic ytMusic;

    public YtMusicAdapter(YtMusic ytMusic){
        this.ytMusic = ytMusic;
    }

    @Override
    public void reproduzirMusica(String musica){
        ytMusic.iniciarSom(musica);
    }
}