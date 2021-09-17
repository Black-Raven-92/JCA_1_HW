package JCA_HW_8_OOP3;

public class Track extends Barrier {
    private int lengthTrack;

    public Track(int length,String type){
        super(type);
        this.lengthTrack=getLengthTrack();
    }

    public int getLengthTrack() {
        return lengthTrack;
    }
}
