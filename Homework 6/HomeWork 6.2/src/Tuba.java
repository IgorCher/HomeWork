public class Tuba implements Instrument {
    private int diameter;

    public Tuba(int diameter) {
        this.diameter = diameter;
    }


    @Override
    public void play() {
        System.out.printf("Туба играет %s, ее диаметр: %d%n", KEY, diameter);
    }
}
