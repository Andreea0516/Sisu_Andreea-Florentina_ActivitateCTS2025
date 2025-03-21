package rezervare;

public class Rezervare extends ARezervare{
    protected Boolean isInterior;

    public Rezervare(String nume, int ora, int nrPersoane, int zi) {
        super(nume, ora, nrPersoane, zi);
    }

    @Override
    public ARezervare clonare(int zi) {
        Rezervare r =new Rezervare();
        r.isInterior=this.isInterior;
        r.nume=this.nume;
        r.ora=this.ora;
        r.nrPersoane=this.nrPersoane;
        r.zi=this.zi;
    }

    public Rezervare(){
        super();
        isInterior=Boolean.TRUE;
    }

    public Boolean getInterior() {
        return isInterior;
    }
}
