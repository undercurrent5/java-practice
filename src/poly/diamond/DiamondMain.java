package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        InterfaceB b = new Child();

        a.methodA();
        b.methodB();
        a.methodCommon();
        b.methodCommon();
    }
}
