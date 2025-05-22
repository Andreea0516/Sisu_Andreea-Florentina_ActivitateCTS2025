package clase;

public class HandlerCardSanatate extends Handler{
    @Override
    protected boolean executaVerificare(Client client) {
        if (client.areCardSanatate) {
            System.out.println("Cardul de sanatate este valid.");
            return true;
        }
        System.out.println("Cardul de sanatate lipseste.");
        return false;
    }
}
