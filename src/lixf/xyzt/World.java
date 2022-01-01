package lixf.xyzt;

import java.util.ArrayList;

public class World extends Bb{
    private final ArrayList<Bb> bbList = new ArrayList<>();

    @Override
    public String toString() {
        return String.format("World#%s%s", super.toString(), bbList);
    }

    public World add(Bb aBb) {
        bbList.add(aBb);

        return this;
    }

    @Override
    public void tick() {
        super.tick();
        for(Bb e : bbList) {
            e.tick();
        }
    }
}
