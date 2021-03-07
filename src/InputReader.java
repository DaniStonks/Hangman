import java.util.Scanner;

public class InputReader {
    private Scanner reader;

    public InputReader(){
        reader = new Scanner(System.in);
    }

    public int getInteger(){
        int number = reader.nextInt();

        while(reader.hasNextInt() == false){
            System.out.println("Opção> ");
            number = reader.nextInt();
        }
        return number;
    }

    public char getCharacter(){
        char character = reader.next().charAt(0);

        while(reader.hasNext() == false){
            System.out.println("Letra> ");
            character = reader.next().charAt(0);
        }
        return character;
    }
}
