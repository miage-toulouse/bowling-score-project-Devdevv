package miage.dbri.bowling;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartieTest {

    @Test
    public void testCalculeScoreSansStrikeSansSpare()
    {
        //given : Une partie avec 10 jeux identiques faisant tomber 5 quilles sur les 2 lancés.
        Jeu lejeu = new Jeu(5,0);
        Partie p = new Partie(lejeu);

        //when : on calcule le score
        int score = p.calculeScore();

        //then : on obtient un score de 50
        assertEquals(50, score);
    }

    @Test
    public void testCalculeScoreAvecQueDesSpare()
    {
        //given : Une partie avec 10 jeux identiques contenant que des spares (5 puis 5).
        Jeu lejeu = new Jeu(5,5);
        Partie p = new Partie(lejeu);

        //when : on calcule le score
        int score = p.calculeScore();

        //then : on obtient un score de 150
        assertEquals(150, score);
    }

    @Test
    public void testCalculeScoreAvecQueDesStrike()
    {
        //given : Une partie avec 10 jeux identiques contenant que des strikes.
        Jeu lejeu = new Jeu(10);
        Partie p = new Partie(lejeu);

        //when : on calcule le score
        int score = p.calculeScore();

        //then : on obtient un score de 300
        assertEquals(300, score);
    }
}