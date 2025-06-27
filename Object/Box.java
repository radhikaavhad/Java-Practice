package Object;

public class Box {
    private int length;
    private int breadth;
    private int height;
    private int volume;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Box(){
    }

    public Box(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    void calculateVolume(){
        volume = length * breadth * height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", height=" + height +
                ", volume=" + volume +
                '}';
    }

    public boolean equals(Object obj){
//        if(!(obj instanceof Box))
//            return false;
//
//        if(this.volume == ((Box)obj).volume)
//            return true;

        if(obj instanceof Box && this.volume == ((Box)obj).volume)
            return true;
        return false;
    }

}
