import java.util.Random;
import java.util.ArrayList;

public class GameLogic {
    private static int lives = 7;
    private static String[] gameWords = {"nuno" , "pokemon", "pessego", "matematica"
                                        , "teclado", "netbeans", "baguete", "palavras"
                                        , "faixas" , "cebolas", "churrasco", "secador"
                                        , "curgete", "placebo", "paquistano", "aneurisma"};
    private String gameWord;
    private char[] correctLetters;
    private ArrayList<Character> receivedLetters;

    public GameLogic()
    {
        Random rd1 = new Random();
        int gNumber = rd1.nextInt(gameWords.length);
        gameWord = gameWords[gNumber];
        ArrayList<Character> receivedLetters = new ArrayList<Character>();
        correctLetters = new char[gameWord.length()];
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
        InputReader input = new InputReader();
        char character = input.getCharacter();
        // meter if se letra já foi introduzida
        for(int i=0; i<gameWord.length(); i++)
        {
            if(gameWord.charAt(i) == character)
            {
                int wordIndex = gameWord.charAt(i);
                correctLetters[wordIndex] = character;
                receivedLetters.add(character);
                showGuessWord();
            }
            else
            {
                lives -= 1;
                receivedLetters.add(character);
            }
        }

    }

    private void showGuessWord(){
        for(int i=0;i< correctLetters.length;i++){
            if(correctLetters[i] == 0){
                System.out.println("_");
            }
            else{
                System.out.println(correctLetters[i]);
            }
        }
    }
}
