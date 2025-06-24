package oops;

class Pen
{
     String color;
    String type;

    void PenDetails()
    {
        System.out.println("writing something");
    }
}



public class Demo {
   public static void main(String[] args) {
        Pen pen = new Pen();
        pen.color = "blue";
        pen.type = "ballpoint";

        pen.PenDetails();
   }
}
