public class Latte extends Espresso {
    public boolean hasMocha;
    public boolean hasIce;

    public void transmitsColdChocolateyFlavor() {
        System.out.println("Mmmm, I feel cold and taste chocolatey!");
        this.hasMocha = true;
        this.hasIce = true;
    }
}
