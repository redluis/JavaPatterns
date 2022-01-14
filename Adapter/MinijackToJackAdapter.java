public class MinijackToJackAdapter extends Guitar {
    Minijack minijack;

    MinijackToJackAdapter(Minijack minijack) {
        this.minijack = minijack;
    }

    @Override
    public boolean isConnected() {
        if (this.minijack != null && minijack.isWorking()) {
            return true;
        }

        return false;
    }
}
