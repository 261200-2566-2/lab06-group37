public class Main {
    public static void main(String[] args) {
        Devil devil = new Devil("devilshin");
        Monk monk = new Monk("monkeyDfirssy");
        devil.showStatus();
        devil.lvup();
        devil.showStatus();

        Boot b = new Boot();
        devil.equipBoot(b);
        devil.showStatus();
        monk.equipBoot(b);
        devil.showStatus();

    }
}