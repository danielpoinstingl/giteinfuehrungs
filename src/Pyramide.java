public abstract class Pyramide {
    private float hight;

    Pyramide(float hight) {
        this.hight = hight;
    }

    public abstract float calcvolumen();

    public float getHight() {
        return hight;
    }
}
