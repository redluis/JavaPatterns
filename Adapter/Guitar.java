public class Guitar {
    private Jack jack;

    public Guitar() {};

    public Guitar(Jack jack) {
        this.jack = jack;
    }

    public boolean isConnected() {
        if (this.jack != null && jack.isWorking()) {
            return true;
        }

        return false;
    }
}
