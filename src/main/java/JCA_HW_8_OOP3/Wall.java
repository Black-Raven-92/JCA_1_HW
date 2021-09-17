package JCA_HW_8_OOP3;

public class Wall extends Barrier {

    private int height;

    public Wall(int height,String type){
        super(type);
        this.height=height;
    }
    public int getHeight() {
        return height;
    }



}
