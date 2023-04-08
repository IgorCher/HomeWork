public class Drum implements Instrument {

    private int size;

    public Drum(int size) {
        this.size = size;
    }


    @Override
    public void play() {
        System.out.printf("Барабан играет %s, ее размер: %d%n", KEY, size);
    }
}
