import java.util.Scanner;

public class playersecond {
    public static void playersecond(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

// CREATING PLAYER 1

        // PLAYER 1 NAME
        System.out.println("Enter player 1 name: ");
        String player1Name = scanner.nextLine();

        // ensuring player 1 name is an appropriate length
        while(player1Name.length() < 2 || player1Name.length() > 21){
            System.out.println("Enter player 1 name: ");
            player1Name = scanner.nextLine();
        }

        // PLAYER 1 PIECE
        System.out.println("Enter player 1 piece: ");
        String player1Piece = scanner.nextLine();

        // ensuring player 1 piece != player 1 name and only 1 character long
        while(player1Piece.length() != 1){
            System.out.println("Enter player 1 piece: ");
            player1Piece = scanner.nextLine();
        }

        Player player1 = new Player(player1Name, player1Piece);

// CREATING PLAYER 2

        // PLAYER 2 NAME
        System.out.println("Enter player 2 name: ");
        String player2Name = scanner.nextLine();

        // ensuring player 2 name is unique + an appropriate length
        while(player2Name.equals(player1Name) || player2Name.length() < 2 || player2Name.length() > 21){
            System.out.println("Enter player 2 name: ");
            player2Name = scanner.nextLine();
        }

        // PLAYER 2 PIECE
        System.out.println("Enter player 2 piece: ");
        String player2Piece = scanner.nextLine();

        // ensuring player 2 piece is unique + only 1 character long
        while(player2Piece.contains(player1Piece) || player2Piece.length() != 1){
            System.out.println("Enter player 2 piece: ");
            player2Piece = scanner.nextLine();
        }
        Player player2 = new Player(player2Name, player2Piece);

// CREATING PLAYER 3

        // PLAYER 3 NAME
        System.out.println("Enter player 3 name: ");
        String player3Name = scanner.nextLine();

        // ensuring player 3 name is unique + an appropriate length
        while(player3Name.equals(player2Name) || player3Name.equals(player1Name) || player3Name.length() < 2 || player3Name.length() > 21){
            System.out.println("Enter player 3 name: ");
            player3Name = scanner.nextLine();
        }

        // PLAYER 3 PIECE
        System.out.println("Enter player 3 piece: ");
        String player3Piece = scanner.nextLine();

        // ensuring player 3 piece is unique

        while(player3Piece.contains(player1Piece) || player3Piece.contains(player2Piece) || player2Piece.length() != 1){
            System.out.println("Enter player 3 piece: ");
            player2Piece = scanner.nextLine();
        }

        Player player3 = new Player(player3Name, player3Piece);

// CREATING PLAYER 4

        // PLAYER 4 NAME
        System.out.println("Enter player 4 name: ");
        String player4Name = scanner.nextLine();

        // ensuring player 4 name is unique
        while(player4Name.equals(player1Name) || player4Name.equals(player2Name) || player4Name.equals(player3Name) || player4Name.length() < 2 || player4Name.length() > 21){
            System.out.println("Enter player 4 name: ");
            player4Name = scanner.nextLine();
        }

        // PLAYER 4 PIECE
        System.out.println("Enter player 4 piece: ");
        String player4Piece = scanner.nextLine();

        // ensuring player 4 piece is unique
        while(player4Piece.contains(player1Piece) || player4Piece.contains(player2Piece) || player4Piece.contains(player3Piece) || player4Piece.length() != 1){
            System.out.println("Enter player 4 piece: ");
            player4Piece = scanner.nextLine();
        }

        Player player4 = new Player(player4Name, player4Piece);

        // testing methods

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);

        System.out.println(player1.getMoney());
        player1.increaseMoney(2000);
        System.out.println(player1.getMoney());

        System.out.println(player1.getPosition());
        player1.movePlayer(20);
        System.out.println(player1.getPosition());
        player1.movePlayer(10);
        System.out.println(player1.getPosition());



    }
}