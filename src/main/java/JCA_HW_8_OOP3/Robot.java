package JCA_HW_8_OOP3;

public class Robot implements Mooving {
    private final int JUMP = 100;
    private final int RUN = 150;
    private String name;
    private String type;

    public Robot(String type, String name) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void move(Barrier [] barriers ){
        for(int i=0;i< barriers.length;i++){
            if(barriers[i] instanceof Wall){
                if (!jump(barriers[i])) {
                    System.out.printf("Робот по имени %s не перепрыгнул  стену и выбывает из марафона\n",this.name);
                    break;
                }

            }else if(barriers[i] instanceof Track){
                if(!run(barriers[i])){
                    System.out.printf("Робот по имени %s не пробежал трэк и выбывает из марафона\n",this.name);
                    break;
                }
            }
        }
    }

    @Override
    public boolean run(Barrier barriers) {

        if (this.RUN >= ((Track) barriers).getLengthTrack()) {
            System.out.printf("Робот по имени %s пробежал трэк %s метров\n",this.name, ((Track) barriers).getLengthTrack());
            return true;
        }
        else return false;

    }
    @Override
    public boolean jump(Barrier barriers) {

        if (this.JUMP >= ((Wall) barriers).getHeight()) {
            System.out.printf("Робот по имени %s перепрыгнул стену %s метров\n",this.name, ((Wall) barriers).getHeight());
            return true;
        }
        else return false;
    }



}
