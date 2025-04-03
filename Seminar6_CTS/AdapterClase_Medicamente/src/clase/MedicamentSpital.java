package clase;

public class MedicamentSpital {
    private String nume;
    private int pret;

    public MedicamentSpital(int pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public int getPret() {
        return pret;
    }

    public void achizitioneazaMedicament()
    {
        prezintaReteta();
        System.out.println("E achizitionat medicamentul "+nume+ " cu pretul: "+pret);
    }

    public void prezintaReteta(){
        System.out.println("A fost prezentata reteta pentru medicamentul: " +nume);
    }
}
