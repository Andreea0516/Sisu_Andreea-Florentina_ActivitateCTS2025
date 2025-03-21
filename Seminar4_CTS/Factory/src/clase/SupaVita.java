package clase;

public class SupaVita extends Supa{
    private static int discount;

    public SupaVita(boolean hasSmantana, boolean hasArdei, float pret, int cantitate) {
        super(hasSmantana, hasArdei, pret, cantitate);
    }

    @Override
    public float getPretFinal() {
        return super.getPret()-(super.getPret()*discount);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de vita de: "+ super.getCantitate());
    }
}
