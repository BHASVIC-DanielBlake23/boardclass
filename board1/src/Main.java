import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Main {
    public static void main(String[] args) {
   String[]board1={"start", "ant","mouse","rat","lobster","OWL","Badger", "Rabbit","chicken", "pig","fox","cow","bison","MISS A GO", "BUFFALO","Yak", "Leopard", "Hyena","Black Bear","Walrus","Elk", "Giraffe", "Lion", "Brown Bear","Elephant","Polar Bear"};
        if (getPLayerPosition() == board1[1])){
            if (P1.isOwned() == FALSE){
                System.out.println();("You landed on ant. If you want to buy it, it will cost you " + P1.PurchaseCost);

            }
            else if (P1.isOwned() == TRUE){
                System.out.println("You landed on ant. Since it is already owned, you have to pay "+  P1.getOwner() + P1.PurchaseCost "in order to move on.\n");

            }

        }
        if (getPLayerPosition() == board1[2])){
            if (P2.isOwned() == FALSE){
                System.out.println();("You landed on mouse. If you want to buy it, it will cost you " + P2.PurchaseCost);

            }
            else if (P2.isOwned() == TRUE){
                System.out.println("You landed on mouse. Since it is already owned, you have to pay "+  P2.getOwner() + P2.PurchaseCost "in order to move on.\n");

            }

        }
        if (getPLayerPosition() == board1[3])){
            if (P3.isOwned() == FALSE){
                System.out.println();("You landed on rat. If you want to buy it, it will cost you " + P3.PurchaseCost);

            }
            else if (P3.isOwned() == TRUE){
                System.out.println("You landed on rat. Since it is already owned, you have to pay "+  P3.getOwner() + P3.PurchaseCost "in order to move on.\n");

            }

        }
        if (getPLayerPosition() == board1[4])){
            if (P4.isOwned() == FALSE){
                System.out.println();("You landed on lobster. If you want to buy it, it will cost you " + P4.PurchaseCost);

            }
            else if (P4.isOwned() == TRUE){
                System.out.println("You landed on lobster. Since it is already owned, you have to pay "+  P4.getOwner() + P4.PurchaseCost "in order to move on.\n");

            }

        }
        if (getPLayerPosition() == board1[5])){
            if (P5.isOwned() == FALSE){
                System.out.println();("You landed on owl. If you want to buy it, it will cost you " + P5.PurchaseCost);

            }
            else if (P5.isOwned() == TRUE){
                System.out.println("You landed on owl. Since it is already owned, you have to pay "+  P5.getOwner() + P5.PurchaseCost "in order to move on.\n");

            }

        }
        if (getPLayerPosition() == board1[6])){
            if (P6.isOwned() == FALSE){
                System.out.println();("You landed on Badger. If you want to buy it, it will cost you " + P6.PurchaseCost);

            }
            else if (P6.isOwned() == TRUE){
                System.out.println("You landed on Badger. Since it is already owned, you have to pay "+  P6.getOwner() + P6.PurchaseCost "in order to move on.\n");

            }

        }
        }
    }
