package Bucatarie;

import clase.Supa;
import clase.SupaDeCiuperci;
import clase.SupaDeLegume;
import clase.SupaVita;

public class Bucatarie {
    private int cantitate;
    private float pret;

    public Bucatarie(int cantitate, float pret) {
        this.cantitate = cantitate;
        this.pret = pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public float getPret() {
        return pret;
    }

    public Supa getSupa(TipSupa tipSupa, Boolean hasArdei, Boolean hasSmantana){
        switch (tipSupa){
            case CIUPERCI ->{return new SupaDeCiuperci(hasArdei, hasSmantana, pret, cantitate);}
            case VITA ->{return new SupaVita(hasArdei, hasSmantana, pret, cantitate);}
            case LEGUME->{return new SupaDeLegume(hasArdei, hasSmantana, pret, cantitate);}
            default -> {
                return null;
            }
        }
    }
}
