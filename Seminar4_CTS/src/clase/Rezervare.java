package clase;

public class Rezervare extends ARezervare {
    public Boolean esteInInterior;

    public Rezervare(){
        super();
        esteInInterior = true;
    }

    public Rezervare(String nume, int ora, int nrPersoane, int zi, Boolean esteInInterior) {
        super(nume, ora, nrPersoane, zi);
        this.esteInInterior = esteInInterior;
    }

    @Override
    public ARezervare clonare(int zi) {
        Rezervare rezervare = new Rezervare();
        rezervare.nume = this.nume;
        rezervare.ora = this.ora;
        if(zi>1 && zi<31){
            rezervare.zi = zi;
        }else rezervare.zi = 1;
        rezervare.esteInInterior = this.esteInInterior;
        return rezervare;
    }


    @Override
    public String toString() {
        return "Rezervare{" +
                "esteInInterior=" + esteInInterior +
                ", nume='" + nume + '\'' +
                ", ora=" + ora +
                ", nrPersoane=" + nrPersoane +
                ", zi=" + zi +
                '}';
    }
}
