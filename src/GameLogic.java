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
        receivedLetters = new ArrayList<>();
        correctLetters = new char[gameWord.length()];
    }

    public String getGameWord()
    {
        return this.gameWord;
    }

    public int getLives()
    {
        return lives;
    }

    private void characterChoice()
    {
        InputReader input = new InputReader();
        char character = input.getCharacter();
        gameWord = "nuno"; //palavra de teste
        // meter if se letra já foi introduzida
        for(int i=0; i<gameWord.length(); i++)
        {
            if(gameWord.charAt(i) == character)
            {
                correctLetters[i] = character;
                receivedLetters.add(gameWord.charAt(i));
                showGuessWord();
            }
            else
            {
                //meter vidas a funcionar, de momento a cada loop tira uma vida, por exemplo se meteres u,
                // vai te retirar 3 vidas em vez de 1
                //fazer o mesmo com o array das letras recebidas, isto adiciona a letra outra vez em cada loop,
                //se meteres a letra u, isto adiciona ao array a letra u 4 vezes
                System.out.println("_");
                lives -= 1;
                receivedLetters.add(gameWord.charAt(i));
                showGuessWord();
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
            System.out.println("Vidas - " + getLives());
        }
    }

    public void play(){
        //falta verificar se acertou na palavra, mas nao faças isso agr
        while(getLives() != 0){
            characterChoice();
        }

    }
}
