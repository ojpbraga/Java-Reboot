import br.com.devFlix.gui.MiniatureVideo;
import br.com.devFlix.gui.Window;
import br.com.devFlix.gui.buttons.*;
import br.com.devFlix.videos.*;

// Podemos também utilizar imports de terceiros
// www.devflix.com.br -> br.com.devflix
// como se fosse um pacote: br/com/devflix

public class App {
    public static void main(String[] args) throws Exception {
        br.com.devFlix.videos.Movie movie2 = new br.com.devFlix.videos.Movie();
        // ou
        Movie movie1 = new Movie();

        // Se tivesse outros pacotes: video.pacoteFilho.pacoteNeto
        // Melhor forma é fazer: import.[nome do pacote];

        Documentary natureAndScience = new Documentary();
        Novela missHart = new Novela();
        Anime brokenHeart = new Anime();
        Window mainWindow = new Window();

        MiniatureVideo principalVideo = new MiniatureVideo();
        ButtonPlay buttonPlay = new ButtonPlay();
    }
}

// Um software que contém as seguintes classes na pasta src/
// videos/
    // Filme.java
    // Serie.java
    // Anime.java

// GUI
    // Janela.java
    // MiniaturaVideo.java
    // botoes/
        // BotaoPause.java
        // BotaoPlay.java

// App.java