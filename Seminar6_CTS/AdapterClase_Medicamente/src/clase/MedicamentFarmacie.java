package clase;

public class MedicamentFarmacie {
    private String nume;
    private int pret;
    private boolean esteInStoc;
    private String dataExpirare;

    public MedicamentFarmacie(String nume, int pret, boolean esteInStoc, String dataExpirare) {
        this.nume = nume;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
        this.dataExpirare = dataExpirare;
    }

    public void cumparaMedicament()
    {
        System.out.println("Medicamentul: "+ nume+" care are pretul: "+pret+" expira pe data de: "+ dataExpirare + " are stocul: "+esteInStoc);
    }
}
