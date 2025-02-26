public class Kegel extends Pyramide {
    private float radius;
    Kegel(float hight,float radius) {
        super(hight);
        this.radius = radius;
    }

    @Override
    public float calcvolumen() {
        return (float) Math.PI * radius * radius * getHight()/3;
    }
}
