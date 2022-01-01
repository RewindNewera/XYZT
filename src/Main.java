import lixf.xyzt.Bb;
import lixf.xyzt.Light;
import lixf.xyzt.Spot;
import lixf.xyzt.World;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World.\n");

        Bb b1;
        b1 = new Bb(1, 1, 1, 0, 0, 0, 0, 60, 0, 0);
        System.out.println(b1);

        World w = new World();
        w.add(b1);
        System.out.println(w);

        Light l1 = new Light(); l1.setX(0).setY(1).setZ(1).setVx(1);
        Spot s1 = new Spot(); s1.setX(2).setY(1).setZ(1);
        w.add(l1).add(s1);
        l1.addLighteder(b1);
        l1.addLighteder(s1);

        w.tick();
        System.out.println(w);

        l1.lighting();
        w.tick();
        System.out.println(w);
    }
}
