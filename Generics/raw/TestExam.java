package Generics.raw;

public class TestExam {
    public static void main(String[] args) {
        Exam exam1 = new Exam(10000);
        System.out.println(exam1);

        Integer code = (Integer)exam1.getCode();    //downcast --> is done manually
        System.out.println(exam1);
    }
}
