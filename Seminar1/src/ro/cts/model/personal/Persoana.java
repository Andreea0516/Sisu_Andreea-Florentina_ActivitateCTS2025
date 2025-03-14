package ro.cts.model.personal;

public abstract class Persoana implements IPersoana{
    protected String nume;
    protected int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public int getVArsta() {
        return this.varsta;
    }

    public abstract void afiseazaMetodaInvatare();

}
