package Lambda;

public class TestChef {
    public static void main(String[] args) {
//        //Implementation by a class
//            Recipe recipe = new Chef();
//


        // implementation by anonymous inner class
        Recipe instantRecipe = new Recipe() {                  //used when creating objects for interface as it is not allowed normally
            @Override                                   //anonymous class (anonymous inner class as it is within a class)
            public void cook() {
                System.out.println("Instant Recipe");
            }
        };

        //just use lambda expression to bypass all the above
        Recipe lambdaRecipe = ()-> System.out.println("Instant Recipe");
    }
}
