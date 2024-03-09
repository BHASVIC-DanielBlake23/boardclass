import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]board1={"start", "ant","mouse","rat","lobster","owl","Badger", "Rabbit","chicken", "pig","fox","cow","bison","miss a go", "buffalo","Yak", "Leopard", "Hyena","Black Bear","walrus","Elk", "Giraffe", "Lion", "Brown Bear","Elephant","Polar Bear"};
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        int dicetot = 0;
        int players = 4;
        int playerIn = 0;
        int playerOut = 0;
        int n = 0;
        int twoplayerIn = 0;
        int twoplayerOut = 0;
        int threeplayerIn = 0;
        int threeplayerOut = 0;
        int fourplayerIn = 0;
        int fourplayerOut = 0;
        int score = 0;

        String position = 0;
        while (players != 1){
            System.out.println("what player are you 1,2,3, or 4? ");
            int playernum = Integer.valueOf(scanner.nextLine());
            if (playernum == "1" && playerIn = 0){
                System.out.println("You are Player 1, Press 1 to roll the dice : \n");
                int number = Integer.valueOf(scanner.nextLine());
                rollDice();
                dicetot = getRoll1 + getRoll2;
                if (number = "1"){
                    System.out.println("You rolled " + dicetot);
//                    n = n + dicetot;
//                    position = board1[n];
                    spaces();
                    if (getMoney() =< 0){
                        playerOut = 1;
                    }



                }
                if (playerOut= 1){
                    playerIn = 1;
                }


        }if (playernum == "2" && twoplayerIn = 0){
                System.out.println("You are Player 2, Press 1 to roll the dice : \n");
                int number = Integer.valueOf(scanner.nextLine());
                rollDice();
                dicetot = getRoll1 + getRoll2;
                if (number = "1"){
                    System.out.println("You rolled " + dicetot);
//                    n = n + dicetot;
//                    position = board1[n];
                    spaces();
                    if (getMoney() =< 0){
                        playerOut = 1;
                    }



                }
                if (twoplayerOut= 1){
                    twoplayerIn = 1;
                }


            }
            if (playernum == "3" && threeplayerIn = 0){
                System.out.println("You are Player 3, Press 1 to roll the dice : \n");
                int number = Integer.valueOf(scanner.nextLine());
                rollDice();
                dicetot = getRoll1 + getRoll2;
                if (number = "1"){
                    System.out.println("You rolled " + dicetot);
//                    n = n + dicetot;
//                    position = board1[n];
                    spaces();
                    if (getMoney() =< 0){
                        playerOut = 1;
                    }



                }
                if (threeplayerOut= 1){
                    threeplayerIn = 1;
                }


            }
            if (playernum == "4" && fourplayerIn = 0){
                System.out.println("You are Player 4, Press 1 to roll the dice : \n");
                int number = Integer.valueOf(scanner.nextLine());
                rollDice();
                dicetot = getRoll1 + getRoll2;
                if (number = "1"){
                    System.out.println("You rolled " + dicetot);
//                    n = n + dicetot;
//                    position = board1[n];
                    spaces();
                    if (getMoney() =< 0){
                        playerOut = 1;
                    }



                }
                if (fourplayerOut= 1){
                    fourplayerIn = 1;
                }


            }







        }}
        public void spaces(){
            String[]board1={"start", "ant","mouse","rat","lobster","owl","Badger", "Rabbit","chicken", "pig","fox","cow","bison","miss a go", "buffalo","Yak", "Leopard", "Hyena","Black Bear","walrus","Elk", "Giraffe", "Lion", "Brown Bear","Elephant","Polar Bear"};
            if (getPosition() == board1[1])){
                if (P1.isOwned() == FALSE){
                    System.out.println();("You landed on ant. If you want to buy it, it will cost you " + P1.PurchaseCost);

                }
                else if (P1.isOwned() == TRUE){
                    System.out.println("You landed on ant. Since it is already owned, you have to pay "+  P1.getOwner() + P1.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[2])){
                if (P2.isOwned() == FALSE){
                    System.out.println();("You landed on mouse. If you want to buy it, it will cost you " + P2.PurchaseCost);

                }
                else if (P2.isOwned() == TRUE){
                    System.out.println("You landed on mouse. Since it is already owned, you have to pay "+  P2.getOwner() + P2.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[3])){
                if (P3.isOwned() == FALSE){
                    System.out.println();("You landed on rat. If you want to buy it, it will cost you " + P3.PurchaseCost);

                }
                else if (P3.isOwned() == TRUE){
                    System.out.println("You landed on rat. Since it is already owned, you have to pay "+  P3.getOwner() + P3.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[4])){
                if (P4.isOwned() == FALSE){
                    System.out.println();("You landed on lobster. If you want to buy it, it will cost you " + P4.PurchaseCost);

                }
                else if (P4.isOwned() == TRUE){
                    System.out.println("You landed on lobster. Since it is already owned, you have to pay "+  P4.getOwner() + P4.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[5])){
                if (P5.isOwned() == FALSE){
                    System.out.println();("You landed on owl. If you want to buy it, it will cost you " + P5.PurchaseCost);

                }
                else if (P5.isOwned() == TRUE){
                    System.out.println("You landed on owl. Since it is already owned, you have to pay "+  P5.getOwner() + P5.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[6])){
                if (P6.isOwned() == FALSE){
                    System.out.println();("You landed on Badger. If you want to buy it, it will cost you " + P6.PurchaseCost);

                }
                else if (P6.isOwned() == TRUE){
                    System.out.println("You landed on Badger. Since it is already owned, you have to pay "+  P6.getOwner() + P6.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[7])){
                if (P7.isOwned() == FALSE){
                    System.out.println();("You landed on Rabbit. If you want to buy it, it will cost you " + P7.PurchaseCost);

                }
                else if (P7.isOwned() == TRUE){
                    System.out.println("You landed on Rabbit. Since it is already owned, you have to pay "+  P7.getOwner() + P7.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[8])){
                if (P8.isOwned() == FALSE){
                    System.out.println();("You landed on Chicken. If you want to buy it, it will cost you " + P8.PurchaseCost);

                }
                else if (P8.isOwned() == TRUE){
                    System.out.println("You landed on Chicken. Since it is already owned, you have to pay "+  P8.getOwner() + P8.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[9])){
                if (P9.isOwned() == FALSE){
                    System.out.println();("You landed on pig. If you want to buy it, it will cost you " + P9.PurchaseCost);

                }
                else if (P9.isOwned() == TRUE){
                    System.out.println("You landed on pig. Since it is already owned, you have to pay "+  P9.getOwner() + P9.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[10])){
                if (P10.isOwned() == FALSE){
                    System.out.println();("You landed on fox. If you want to buy it, it will cost you " + P10.PurchaseCost);

                }
                else if (P10.isOwned() == TRUE){
                    System.out.println("You landed on fox. Since it is already owned, you have to pay "+  P10.getOwner() + P10.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[11])){
                if (P11.isOwned() == FALSE){
                    System.out.println();("You landed on cow. If you want to buy it, it will cost you " + P11.PurchaseCost);

                }
                else if (P11.isOwned() == TRUE){
                    System.out.println("You landed on cow. Since it is already owned, you have to pay "+  P11.getOwner() + P11.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[12])){
                if (P12.isOwned() == FALSE){
                    System.out.println();("You landed on bison. If you want to buy it, it will cost you " + P12.PurchaseCost);

                }
                else if (P12.isOwned() == TRUE){
                    System.out.println("You landed on bison. Since it is already owned, you have to pay "+  P12.getOwner() + P12.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[13])){
                System.out.println();("You miss a go!  ");
                    missATurn();




            }
            if (getPosition() == board1[14])){
                if (P14.isOwned() == FALSE){
                    System.out.println();("You landed on buffalo. If you want to buy it, it will cost you " + P14.PurchaseCost);

                }
                else if (P14.isOwned() == TRUE){
                    System.out.println("You landed on buffalo. Since it is already owned, you have to pay "+  P14.getOwner() + P14.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[15])){
                if (P15.isOwned() == FALSE){
                    System.out.println();("You landed on yak. If you want to buy it, it will cost you " + P15.PurchaseCost);

                }
                else if (P15.isOwned() == TRUE){
                    System.out.println("You landed on yak. Since it is already owned, you have to pay "+  P15.getOwner() + P15.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[16])){
                if (P16.isOwned() == FALSE){
                    System.out.println();("You landed on leopard. If you want to buy it, it will cost you " + P16.PurchaseCost);

                }
                else if (P16.isOwned() == TRUE){
                    System.out.println("You landed on leopard. Since it is already owned, you have to pay "+  P16.getOwner() + P16.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[17])){
                if (P17.isOwned() == FALSE){
                    System.out.println();("You landed on hyena. If you want to buy it, it will cost you " + P17.PurchaseCost);

                }
                else if (P17.isOwned() == TRUE){
                    System.out.println("You landed on black bear. Since it is already owned, you have to pay "+  P17.getOwner() + P17.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[18])){
                if (P18.isOwned() == FALSE){
                    System.out.println();("You landed on walrus. If you want to buy it, it will cost you " + P18.PurchaseCost);

                }
                else if (P18.isOwned() == TRUE){
                    System.out.println("You landed on walrus. Since it is already owned, you have to pay "+  P18.getOwner() + P18.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[19])){
                if (P19.isOwned() == FALSE){
                    System.out.println();("You landed on elk. If you want to buy it, it will cost you " + P19.PurchaseCost);

                }
                else if (P19.isOwned() == TRUE){
                    System.out.println("You landed on elk. Since it is already owned, you have to pay "+  P19.getOwner() + P19.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[20])){
                if (P20.isOwned() == FALSE){
                    System.out.println();("You landed on giraffe. If you want to buy it, it will cost you " + P20.PurchaseCost);

                }
                else if (P20.isOwned() == TRUE){
                    System.out.println("You landed on giraffe. Since it is already owned, you have to pay "+  P20.getOwner() + P20.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[21])){
                if (P21.isOwned() == FALSE){
                    System.out.println();("You landed on lion. If you want to buy it, it will cost you " + P21.PurchaseCost);

                }
                else if (P21.isOwned() == TRUE){
                    System.out.println("You landed on lion. Since it is already owned, you have to pay "+  P21.getOwner() + P21.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[22])){
                if (P22.isOwned() == FALSE){
                    System.out.println();("You landed on brown bear. If you want to buy it, it will cost you " + P22.PurchaseCost);

                }
                else if (P22.isOwned() == TRUE){
                    System.out.println("You landed on elephant. Since it is already owned, you have to pay "+  P22.getOwner() + P22.PurchaseCost "in order to move on.\n");

                }

            }
            if (getPosition() == board1[23])){
                if (P23.isOwned() == FALSE){
                    System.out.println();("You landed on polar bear. If you want to buy it, it will cost you " + P23.PurchaseCost);

                }
                else if (P23.isOwned() == TRUE){
                    System.out.println("You landed on polar bear. Since it is already owned, you have to pay "+  P23.getOwner() + P23.PurchaseCost "in order to move on.\n");

                }

            }


    }
    }
