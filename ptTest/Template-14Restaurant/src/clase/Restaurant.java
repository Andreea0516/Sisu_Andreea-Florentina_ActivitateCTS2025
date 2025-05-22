package clase;

public class Restaurant extends TemplateRestaurant{
    @Override
    protected void curataMasa() {
        System.out.println("S-a curatat masa!");
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("S-au pus servetelele");
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Tacamurile au fost asezate.");
    }

    @Override
    protected void aseazaPersoaneLaMasa() {
        System.out.println("Persoanele s-au asezat la masa.");
    }
}
