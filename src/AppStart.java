public class AppStart {

    public static void main(String[] args){
        runMenu();
    }

    public static void runMenu() {
        InputReader reader = new InputReader();
        GameLogic game = new GameLogic();
        while (true) {
            System.out.println("┍──────────────────────────────┑");
            System.out.println("┃         Menu de jogo         ┃");
            System.out.println("┃                              ┃");
            System.out.println("┃ 1- Iniciar o jogo.           ┃");
            System.out.println("┃ 2- Sair do jogo.             ┃");
            System.out.println("┕──────────────────────────────┙\n");

            switch (reader.getInteger()) {
                case 1: {
                    game.play();
                }
                case 2: {
                    return;
                }
                default: {
                    System.out.println("Volte a introduzir a opção:\n");
                }
            }
        }
    }
}
