public class accountNetflix {
    private String preferLanguege;
    private String screenResolution;

    public void enjoy() {
        // Pega as informações do idioma do usuário e resulação da tela
        searchUserPreferences();
        searchResolution();
    };

    private void searchUserPreferences() {
        preferLanguege = "EN-US";
    }

    private void searchResolution() {
        screenResolution = "FullHD";
    }

    private void initializeAudioPerfer() {
        if(preferLanguege == "PT-BR" || preferLanguege == "EN-US") {
            System.out.println("Initializing audio in: " + preferLanguege);
        } else {
            System.out.println("Initializing audio in EN-US");
        }
    }

    public void whatchMovie(String nameMovie) {
        System.out.println("Initializing movie: " + nameMovie);
        System.out.println("Quality: " + screenResolution);
        initializeAudioPerfer();
    };

}
