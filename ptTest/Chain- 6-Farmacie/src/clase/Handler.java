package clase;

public abstract class Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public final void verifica(Client client)
    {
        if(executaVerificare(client))
        {
            if (next!=null){
                next.verifica(client);
            }else{
                System.out.println("Verificarile au fost facute");
        }
        }else {
            System.out.println("Verificare esuata");
        }
    }

    protected abstract boolean executaVerificare(Client client);
}
