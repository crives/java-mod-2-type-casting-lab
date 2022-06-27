public class Espresso {

    public int numShots; // note that a double espresso is a 'doppio'
    public int numSugars;

    public void tasteBitter() {
        System.out.println("I taste bitter :( !");
        this.numSugars = 0;
    }

    public void goesCold() {
        System.out.println("I'm going cold :( !");
    }
}
