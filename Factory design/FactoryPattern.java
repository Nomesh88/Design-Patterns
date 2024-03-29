public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory s1=new ShapeFactory();
        Shape s=s1.getShape("Circle");
        s.draw();
    }
}
