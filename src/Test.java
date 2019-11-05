public class Test {
    public static void main(String[] args) {
        Clock klocka = new Clock();
        Clock klocka2 = new Clock(12,59);
        System.out.println(klocka2.getTime());

        klocka2.timeTick();

        System.out.println(klocka2.getTime());
        System.out.println(klocka.getTime());

        klocka.setTime(13,14);

        klocka2.timeTick();
        System.out.println(klocka.getTime());
        System.out.println(klocka2.getTime());

    }
}
