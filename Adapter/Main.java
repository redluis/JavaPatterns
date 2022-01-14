public class Main {
    public static void main(String[] args) {
        // just jack
        Jack jack1 = new Jack();
        jack1.connectToMedia();
        Guitar guitar = new Guitar(jack1);
        System.out.println("First guitar (jack): " + guitar.isConnected());

        // minijack
        Minijack minijack = new Minijack();
        minijack.connectToMedia();
        MinijackToJackAdapter minijackToJackAdapter = new MinijackToJackAdapter(minijack);
        System.out.println("Second guitar (minijack): " + minijackToJackAdapter.isConnected());

        //https://refactoring.guru/ru/design-patterns/adapter/java/example#lang-features - best example
    }
}
