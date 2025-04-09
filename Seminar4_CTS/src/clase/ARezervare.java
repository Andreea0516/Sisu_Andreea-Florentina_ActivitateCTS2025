package clase;

public abstract class ARezervare {
    protected  String nume;
    protected int ora;
    protected int nrPersoane;
    protected int zi;


    public ARezervare(){
        this.nume="Nume clent";
        this.ora = 10;
        this.nrPersoane = 1;
        this.zi = 1;
    }

    public ARezervare(String nume, int ora, int nrPersoane, int zi) {
        if(nume.length()<3){
            this.nume = nume;
        } else this.nume = nume;

        if(ora>10 && ora<22){
            this.ora = ora;
        } else this.ora = 10;

        if(zi>1 && zi<31){
            this.zi = zi;
        }else this.zi = 1;

        this.nrPersoane = nrPersoane;

    }

    public abstract ARezervare clonare(int zi);
}
