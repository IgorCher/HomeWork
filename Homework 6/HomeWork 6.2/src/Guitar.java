public class Guitar implements Instrument {
    private int numOfStrings;

    public Guitar(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }


    @Override
    public void play() {
        System.out.printf("Гитара играет %s, колличество струн: %d%n", KEY, numOfStrings);
    }
}
