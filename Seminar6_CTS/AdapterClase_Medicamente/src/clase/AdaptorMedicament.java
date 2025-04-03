package clase;

public class AdaptorMedicament extends MedicamentFarmacie{
 private MedicamentSpital medicamentSpital;


    public AdaptorMedicament(String nume, int pret, boolean esteInStoc, String dataExpirare) {
        super(nume, pret, esteInStoc, dataExpirare);
    }

    public AdaptorMedicament(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNume(), medicamentSpital.getPret(),true,"1/1/2026");
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
