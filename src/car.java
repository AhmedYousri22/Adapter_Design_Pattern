public class car implements Veichle {
    @Override
    public void start() {
        System.out.println("Car Start Moving !");
    }

    @Override
    public void stop() {
        System.out.println("Car is Stopped !");
    }

    @Override
    public void BepBep() {
        System.out.println("Beeeeeep Beeeeeeeeeep");
    }
}
