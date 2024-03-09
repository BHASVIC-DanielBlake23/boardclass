public class Player
{
    private String name;
    private String pieceType;
    private int money;
    private boolean bankrupt;
    private int position;
    private boolean missAturn;

    public Player(String name, String pieceType){
        this.name = name;
        this.pieceType = pieceType;
        money = 1000;
        bankrupt = false;
        position = 0;
        missAturn = false;
    }

    public int getMoney(){
        return money;
    }

    public String getPieceType(){
        return pieceType;
    }

    public String getName(){
        return name;
    }

    public boolean isBankrupt() {
        return bankrupt;
    }

    public int increaseMoney(int increaseBy){
        money = money + increaseBy;
        return money;
    }

    public int decreaseMoney(int decreaseBy){
        money = money - decreaseBy;
        return money;
    }

    public int getPosition(){
        return position;
    }

    public void movePlayer(int num){
        if((position + num) > 25){
            position += num;
            position -= 25;
        }
        else{
            position += num;
        }
    }

    public void missATurn(){
        missAturn = true;
    }

    public boolean getMissATurn(){
        return missAturn;
    }

    public void turnMissed(){
        missAturn = false;
    }

    @Override
    public String toString()
    {
        return("\nName: " + name + "\nPiece: " + pieceType);
    }

}