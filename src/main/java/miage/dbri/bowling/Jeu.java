package miage.dbri.bowling;

public class Jeu {
    private Integer lancer1;
    private Integer lancer2;

    public Jeu(Integer lancer1) {
        this.lancer1 = lancer1;
    }

    public Jeu(Integer lancer1, Integer lancer2) {
        this.lancer1 = lancer1;
        this.lancer2 = lancer2;
    }

    public int nbQuillesTombees() {
        if(this.IsStrike())
            return lancer1;
        return lancer1 + lancer2;
    }

    public int nbQuillesTombeesLancer1() {
        return lancer1;
    }

    public int nbQuillesTombeesLancer2() {
        return lancer2;
    }

    public boolean IsSpare()
    {
        return lancer1 + lancer2 == 10;
    }

    public boolean IsStrike()
    {
        return lancer1 == 10;
    }
}
