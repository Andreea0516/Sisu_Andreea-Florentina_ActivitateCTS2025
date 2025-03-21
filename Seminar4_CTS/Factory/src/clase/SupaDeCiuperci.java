package clase;

public class SupaDeCiuperci extends Supa {
    private static int discount;

    public SupaDeCiuperci(boolean hasSmantana, boolean hasArdei, float pret, int cantitate) {
        super(hasSmantana, hasArdei, pret, cantitate);
    }

    @Override
    public float getPretFinal() {
        return super.getPret()-(super.getPret()*discount);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de ciuperci de: "+ super.getCantitate());
    }
}
