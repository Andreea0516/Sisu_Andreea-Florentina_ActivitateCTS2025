package clase;

public class HandlerReteta extends Handler{
    @Override
    protected boolean executaVerificare(Client client) {
        if (client.areReteta) {
            System.out.println("Reteta este valida.");
            return true;
        }
        System.out.println("Lipseste reteta.");
        return false;
    }
}
