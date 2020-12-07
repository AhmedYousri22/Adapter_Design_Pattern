public class Test {
    public static void main(String[] args) {

        V(new car());
        System.out.println();
        V(new BycicleAdapter(new Bycicle()));
    }


    public static void V(Veichle veichle) {
        veichle.start();
        veichle.stop();
        veichle.BepBep();
    }


}