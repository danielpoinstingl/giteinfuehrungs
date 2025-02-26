public class QuadratischeBasis extends Pyramide {
    private int seite;
    private int triangleH;

    public QuadratischeBasis(int seite, int triangleH) {
        super((float)Math.sqrt(triangleH * triangleH - (seite / 2.0) * (seite / 2.0)));
        this.seite = seite;
        this.triangleH = triangleH;

    }


    @Override
    public float calcvolumen(){
    float V = (float) ((seite * seite * getHight()) / 3.0);
    return  V;

    }
}
