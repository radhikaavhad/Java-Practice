package Strings;

//string buffers are mutable --> safe in multi-threaded environnment --> their methods use synchronized keyword
//string builder --> unsafe in multi-threaded environment
//safety and speed are inversely proportional
//buffer and builder are the same internally --> only difference is safety

public class TestStringBufferAndBuilder {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Hi");
        stringBuilder.append(" Radhika");
        System.out.println(stringBuilder);
    }
}
