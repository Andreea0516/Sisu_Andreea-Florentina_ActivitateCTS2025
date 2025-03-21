package clase;

public abstract class Supa {
    private int cantitate;
    private float pret;
    private boolean hasArdei;
    private boolean hasSmantana;

    public Supa(boolean hasSmantana, boolean hasArdei, float pret, int cantitate) {
        this.hasSmantana = hasSmantana;
        this.hasArdei = hasArdei;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public int getCantitate() {
        return cantitate;
    }

    public float getPret() {
        return pret;
    }

    public abstract float getPretFinal();


    public abstract void afiseazaDescriere();
}
