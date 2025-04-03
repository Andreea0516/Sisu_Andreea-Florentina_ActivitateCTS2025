package main;

import clase.AdaptorMedicament;
import clase.MedicamentFarmacie;
import clase.MedicamentSpital;

public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicament){
        medicament.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Antidepresive", 25, true,"1/05/2026");
        vindeMedicament(medicamentFarmacie);

        MedicamentSpital medicamentSpital =new MedicamentSpital(30, "Xanax");
        AdaptorMedicament adaptorMedicament =new AdaptorMedicament(medicamentSpital);
        vindeMedicament(adaptorMedicament);

    }
}
