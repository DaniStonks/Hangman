import java.util.Scanner;

public class InputReader {
    private Scanner reader;

    public InputReader(){
        reader = new Scanner(System.in);
    }

    public int getInteger(){
        System.out.println("Opção> ");

        while (reader.hasNextInt()==false){
            reader.nextLine();
            return 0;
        }
        int number = reader.nextInt();
        reader.nextLine();
        return number;
    }

    public char getCharacter(){
        System.out.print("Letra> ");
        String character = reader.next();
        if(character.length() == 1){
            return character.charAt(0);
        }
        else{
            return 0;
        }
    }
}
