package oops.statics;

public class Student {
    private int id;         // instance variables
    private String name;
    private float marks;
    public static int count;



    public Student(){
        count++;
    }   //default constructor

    public Student(int id, String name, float marks) {  //local variables    //parameterized constructor
        this.id = id; // assigning local variables to instance variables    //'this' will give object of the current class only 
        this.name = name;
        this.marks = marks;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    void printDetails()
    {
        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
        System.out.println("Marks = " + marks);
    }

    public static void getStudentCount()
    {
        System.out.println("Count = " + count);
    }



}
