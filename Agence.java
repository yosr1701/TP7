package tp7Interface;

public class Agence {
    private Voiture[] voitures;
    private int nbrV;

    public Agence(int capacite) {
        voitures = new Voiture[capacite];
        nbrV = 0;
    }

    public void ajout(Voiture v) {
        if (nbrV < voitures.length)
        {
            voitures[nbrV++] = v;
        } 
        else 
        {
            System.out.println("Capacité de l'agence est au maximum.");
        }
    }

    public void afficheSelection(Critere c) {
        for (int i = 0; i < nbrV; i++) 
        {
            if (c.estSatisfaitPar(voitures[i])) 
            {
                System.out.println(voitures[i]);
            }
        }
    }
}