package rezervare;

public abstract class ARezervare {
    protected String nume;
    protected int ora;
    protected int nrPersoane;
    protected int zi;
public ARezervare(){
    this.nume="NumeClient";
    this.ora=10;
    this.nrPersoane=1;
    this.zi=1;
}
    public ARezervare(String nume, int ora, int nrPersoane, int zi) {
        if (nume.length()<3) {
            this.nume = "Client";
        }
        if (ora>10 && ora<22) {
            this.ora=ora;
        }
        this.nrPersoane = nrPersoane;
        if(zi>1 && zi<30){
        this.zi = zi;
        }
        else {
            this.zi = 1;
        }
    }
    public abstract ARezervare clonare(int zi);

}

