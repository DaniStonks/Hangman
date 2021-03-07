import java.util.Scanner;

public class InputReader {
    private Scanner reader;

    public InputReader(){
        reader = new Scanner(System.in);
    }

    public int getInteger(){
        int number = reader.nextInt();

        while (reader.hasNextInt() == false){

        }
    }

    public char getCharacter(){
        reader.next();
    }
}
