package oops.statics;

public class TestAutoConstructor {
    private int id;         // instance variables
    private String name;
    private float marks;
    public static int count;

    
    public TestAutoConstructor(int id, String name, float marks) {  //right click -->source action-->generate 
        this.id = id;
        this.name = name;
        this.marks = marks;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public float getMarks() {
        return marks;
    }


    public void setMarks(float marks) {
        this.marks = marks;
    }

}
