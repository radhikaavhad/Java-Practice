package Exception;

public class TestException {
    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("123");
            System.out.println(num);
            num = num / 0;

        } catch (NumberFormatException nfe) {
            System.out.println("Invalid number found!");
        } catch (ArithmeticException ae) {
            System.out.println("Cannot divide by 0!");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        } finally {
            System.out.println("Always executed no matter exception or not");
        }
    }
}
