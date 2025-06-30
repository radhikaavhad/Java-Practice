package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestThrowException {

    //unchecked exception - silly which java can handle , no need to write try catch or throws
    int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }

    //checked exception - which java cannot handle on its own - needs try catch or throws block (file not found, sql,etc)
    void readFile() throws FileNotFoundException {      // or IOEXCEPTION (IOExceptin is the parent of filenotfounfexception)
        FileReader fileReader = new FileReader("some-file");
    }


    //exception propogation -if the one being called is throwing exception , the one calling should also throw exception or try catch
    //try catch has higher priority than throws
    //if callee has try catch then caller does not have to write throws
    //generally the last function writes try catch and all above write throws
    public static void main(String[] args) throws FileNotFoundException{
        TestThrowException testThrowException = new TestThrowException();
        testThrowException.divide(10,0);
        testThrowException.readFile();
    }
}
