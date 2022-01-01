package lixf.xyzt;

public class Spot extends Bb{

    @Override
    public String toString() {
        return String.format("Spot#%s", super.toString());
    }

    @Override
    public boolean reLight(Light src) {
        if(Bb.isAimed(src, this)) {
            src.setX(getX()).setY(getY()).setZ(getZ());
            src.setVx(0).setVy(0).setVz(0);

            setR(src.getR());
            setG(src.getG());
            setB(src.getB());

            return true;
        }

        return false;
    }
}
