package Generics.param;

public class TestExam {
    public static void main(String[] args) {
        Exam<Integer> exam1 = new Exam<Integer>(10000);
        System.out.println(exam1);

        Integer code = exam1.getCode();    //no need for casting
        System.out.println(exam1);
    }
}
