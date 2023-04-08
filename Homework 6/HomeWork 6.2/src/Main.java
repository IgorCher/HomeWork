public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar(7);
        instruments[1] = new Drum(20);
        instruments[2] = new Tuba(50);

        for (Instrument temp : instruments) {
            temp.play();
        }
    }
}