import java.util.Random;
import java.util.ArrayList;

public class GameLogic {
    private static int lives = 7;
    private static String[] gameWords = {"nuno" , "pokemon", "pessego", "matematica"
                                        , "teclado", "netbeans", "baguete", "palavras"
                                        , "faixas" , "cebolas", "churrasco", "secador"
                                        , "curgete", "placebo", "paquistano", "aneurisma"};
    private String gameWord;
    private ArrayList<Character> receivedLetters;

    public GameLogic()
    {
        Random rd1 = new Random();
        int gNumber = rd1.nextInt(gameWords.length);
        gameWord = gameWords[gNumber];
        ArrayList<Character> receivedLetters = new ArrayList<Character>();
    }

    public String getGameWord()
    {
        return this.gameWord;
    }

    public int getLives()
    {
        return this.lives;
    }

    public void characterChoice()
    {
        if()
        {

        }
    }
}
