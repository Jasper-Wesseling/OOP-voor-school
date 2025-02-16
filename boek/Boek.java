public class Boek {
    private String titel;
    private String auteur;
    private boolean isHardcover;
    private double aanschafprijs;
    private int aantalPaginas;
    private int gelezenKeer;
    
    // Constructor
    public Boek(String titel, String auteur, boolean isHardcover, double aanschafprijs, int aantalPaginas) {
        this.titel = titel;
        this.auteur = auteur;
        this.isHardcover = isHardcover;
        this.aanschafprijs = aanschafprijs;
        this.aantalPaginas = aantalPaginas;
        this.gelezenKeer = 0;
    }
    
    // Methode om het aantal keer gelezen te verhogen
    public void verhoogGelezenKeer() {
        this.gelezenKeer++;
    }
    
    // Methode om de leestijd in minuten te berekenen
    public int berekenLeestijd() {
        return (int) Math.ceil(aantalPaginas / 0.8);
    }
    
    // Methode om een advies te geven over het lezen van het boek
    public String leesAdvies() {
        int leestijd = berekenLeestijd();
        if (leestijd < 61) {
            return "Dit kan je prima lezen";
        } else if (leestijd <= 240) {
            return "Weet je het zeker dat je dit nu wilt gaan lezen?";
        } else {
            return "Dit kun je maar beter niet meer gaan lezen";
        }
    }
    
    // Getters
    public String getTitel() {
        return titel;
    }

    public String getAuteur() {
        return auteur;
    }

    public boolean isHardcover() {
        return isHardcover;
    }

    public double getAanschafprijs() {
        return aanschafprijs;
    }

    public int getAantalPaginas() {
        return aantalPaginas;
    }

    public int getGelezenKeer() {
        return gelezenKeer;
    }
    
    // Methode om boekinformatie weer te geven
    public String toString() {
        return "Boek: " + titel + " van " + auteur + " (" + (isHardcover ? "Hardcover" : "Paperback") + ")\n" +
               "Aanschafprijs: " + aanschafprijs + " euro\n" +
               "Aantal pagina's: " + aantalPaginas + "\n" +
               "Aantal keer gelezen: " + gelezenKeer + "\n" +
               "Geschatte leestijd: " + berekenLeestijd() + " minuten\n" +
               "Leesadvies: " + leesAdvies();
    }

    // Main methode om de klasse te testen
    public static void main(String[] args) {
        Boek mijnBoek = new Boek("De Hobbit", "J.R.R. Tolkien", true, 19.99, 310);
        System.out.println(mijnBoek);
        
        mijnBoek.verhoogGelezenKeer();
        System.out.println("\nNa het een keer lezen:");
        System.out.println(mijnBoek);
    }
}
