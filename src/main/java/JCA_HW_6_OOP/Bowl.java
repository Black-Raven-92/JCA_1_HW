package JCA_HW_6_OOP;

public class Bowl {
    protected int foodAmount;
    public Bowl(int foodAmount){
        this.foodAmount=foodAmount;
    }
    protected void decreaseFood(int amount)
    {
        this.foodAmount-=amount;
    }
    protected int getFoodAmount(){
        return foodAmount;
    }
    protected void addFood(int amount){
        this.foodAmount+=amount;
    }
}
