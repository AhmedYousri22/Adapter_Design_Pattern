public class BycicleAdapter implements Veichle {
    private Bycicle bycicle;

    public BycicleAdapter(Bycicle bycicle) {
        this.bycicle = bycicle;
    }

    @Override
    public void start() {
        bycicle.StartMoving();
    }

    @Override
    public void stop() {
bycicle.StopMoving();
    }

    @Override
    public void BepBep() {
        bycicle.Ringbell();
    }
}
