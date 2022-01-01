package lixf.xyzt;

import java.util.ArrayList;

public class Light extends Bb{
    private final ArrayList<Bb> bbList = new ArrayList<>();

    @Override
    public String toString() {
        return String.format("Light#%s%s", super.toString(), bbList);
    }

    public Light addLighteder(Bb aBb) {
        bbList.add(aBb);

        return this;
    }

    public void lighting() {
        for(Bb e : bbList) {
            if(e.reLight(this)) break;
        }
    }
}
