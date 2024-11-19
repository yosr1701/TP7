package tp7Interface;

public class CriterePrix implements Critere {
    private int prixMax;

    public CriterePrix(int prixMax) {
        this.prixMax = prixMax;
    }

  
    public boolean estSatisfaitPar(Voiture v) {
        return v.getPrixLocation() < prixMax;
    }
}