public class Jack {
    private boolean isWorking = false;

    public void connectToMedia() {
        isWorking = true;
    }

    public boolean isWorking() {
        return this.isWorking;
    }
}
