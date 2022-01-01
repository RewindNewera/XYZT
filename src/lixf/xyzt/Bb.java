package lixf.xyzt;

public class Bb {
    private long id;
    private int x, y, z, t;
    private int vx, vy, vz;
    private int r, g, b;

    public Bb() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public Bb(int x, int y, int z, int t, int vx, int vy, int vz, int r, int g, int b) {
        setId(Math.round(Math.random() * 1e8));
        setX(x); setY(y); setZ(z);
        setT(t);
        setVx(vx); setVy(vy); setVz(vz);
        setR(r); setG(g); setB(b);
    }

    @Override
    public String toString() {
        return String.format("%h(%d,%d,%d,%d)(%d,%d,%d)(%h,%h,%h)", id, x, y, z, t, vx, vy, vz, r, g, b);
    }

    public static boolean isAimed(Bb bullet, Bb target) {
        int dx = target.getX() - bullet.getX();
        int dy = target.getY() - bullet.getY();
        int dz = target.getZ() - bullet.getZ();

        if(!((dx != 0) || (dy != 0) || (dz != 0))) return false;
        if((dx * bullet.getVy()) != (dy * bullet.getVx())) return false;
        if((dx * bullet.getVz()) != (dz * bullet.getVx())) return false;

        return ((bullet.getVx() + bullet.getVy() + bullet.getVz()) / (dx + dy + dz)) > 0;
    }

    public boolean reLight(Light src) {
        if(Bb.isAimed(src, this)) {
            src.setX(getX()).setY(getY()).setZ(getZ());
            src.setR(getR()).setG(getG()).setB(getB());
            src.lighting();

            return true;
        }

        return false;
    }

    public void tick() {
        t++;
    }
    
    // #### ####
    // Method : get

    public long getId() {
        return id;
    }

    // #### #### ####
    // XYZ T

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int getT() {
        return t;
    }

    // #### #### ####
    // V-XYZ

    public int getVx() {
        return vx;
    }

    public int getVy() {
        return vy;
    }

    public int getVz() {
        return vz;
    }

    // #### #### ####
    // RGB

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    // #### ####
    // Method : set

    public Bb setId(long id) {
        this.id = id;

        return this;
    }
    
    // #### #### ####
    // XYZ T

    public Bb setX(int x) {
        this.x = x;

        return this;
    }

    public Bb setY(int y) {
        this.y = y;

        return this;
    }

    public Bb setZ(int z) {
        this.z = z;

        return this;
    }

    public Bb setT(int t) {
        this.t = t;

        return this;
    }

    // #### #### ####
    // V-XYZ

    public Bb setVx(int vx) {
        this.vx = vx;

        return this;
    }

    public Bb setVy(int vy) {
        this.vy = vy;

        return this;
    }

    public Bb setVz(int vz) {
        this.vz = vz;

        return this;
    }

    // #### #### ####
    // RGB

    public Bb setR(int r) {
        this.r = r;

        return this;
    }

    public Bb setG(int g) {
        this.g = g;

        return this;
    }

    public Bb setB(int b) {
        this.b = b;

        return this;
    }
}
