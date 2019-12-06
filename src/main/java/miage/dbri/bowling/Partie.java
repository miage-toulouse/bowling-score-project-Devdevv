package miage.dbri.bowling;

import java.util.ArrayList;
import java.util.List;

public class Partie {
    private List<Jeu> jeux;

    public Partie(Jeu lejeu) {
        jeux = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            jeux.add(lejeu);
        }
        if(lejeu.IsStrike())
        {
            jeux.add(lejeu);
            jeux.add(lejeu);
        }
        else if(lejeu.IsSpare())
        {
            jeux.add(lejeu);
        }
    }

    public int calculeScore() {
        int score = 0;

        for(int i = 0; i< 12; i++) {
            if( i < jeux.size()) {
                Jeu j = jeux.get(i);
                if(i < 10) {
                    score += j.nbQuillesTombees();

                    if(j.IsStrike())
                    {
                        score += jeux.get(i+1).nbQuillesTombeesLancer1();
                        if(jeux.get(i+1).IsStrike())
                        {
                            score += jeux.get(i+2).nbQuillesTombeesLancer1();
                        }
                        else
                        {
                            score += jeux.get(i+1).nbQuillesTombeesLancer2();
                        }
                    }
                    else if (j.IsSpare()) {
                        score += jeux.get(i+1).nbQuillesTombeesLancer1();
                    }
                }
            }
        }
        return score;
    }
}
