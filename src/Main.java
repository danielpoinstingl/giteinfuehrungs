public class Main {
    public static void main(String[] args) {
        Kegel kegel=new Kegel(7,3);
        System.out.println(kegel.calcvolumen());

        QuadratischeBasis qb=new QuadratischeBasis(3,10);
        System.out.println(qb.calcvolumen());

        System.out.println("nice job!");
    }
}