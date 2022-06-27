public class CoffeeRunner {

    public static void main(String[] args) {
        System.out.println("Running my espresso examples:");
        Espresso baseEspresso = new Espresso();
        baseEspresso.tasteBitter();
        Latte newLatte = new Latte();
        newLatte.transmitsColdChocolateyFlavor();
        newLatte.goesCold();
        Cappucino fancyCap = new Cappucino();
        fancyCap.tasteBitter();
        fancyCap.makeYouFeelFancy();

        System.out.println("");
        System.out.println("Parent Class Instantiated as Instance of Child Class:");
        System.out.println("");

        Espresso baseEspresso1 = new Cappucino();
        System.out.println(baseEspresso1.getClass().toString());
    }
}
