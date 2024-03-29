public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle=new Circle();

        Shape Rectangle=new Rectangle();

        Shape rd=new RedShapeDecorator(Rectangle);

        Shape gd=new GreenDecorator(circle);

        circle.draw();// give CIRCLE SHAPE as output

        Rectangle.draw(); //give Rectangle Shape as output

        rd.draw();// has to give border set to Red and Rectangle shape
        gd.draw(); // has to give border set to Green and circle shape


    }
}
