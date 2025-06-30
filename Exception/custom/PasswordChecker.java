package Exception.custom;

public class PasswordChecker {

    boolean isPasswordValid(String password) throws PasswordFormatException{
//    return password.length()<6 ? false : true;

        if (password.length() < 6)
            throw new PasswordFormatException("Format Invalid - The minimum password length should be 6");

        return true;

    }

        public static void main (String[]args){

            PasswordChecker passwordChecker = new PasswordChecker();
            String password = "abc12";
            boolean isValid = false;
            try {
                isValid = passwordChecker.isPasswordValid(password);
                System.out.println(isValid);
            } catch (PasswordFormatException e) {
                System.out.println(e.getMessage());
            }


        }
    }
