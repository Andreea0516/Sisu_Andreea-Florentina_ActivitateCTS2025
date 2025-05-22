package clase;

public class HandlerStoc extends Handler {
    @Override
    protected boolean executaVerificare(Client client) {
        if (client.areStocDisponibil) {
            System.out.println("Este in stoc.");
            return true;
        }
        System.out.println("Nu este stoc suficient.");
        return false;
    }
}
