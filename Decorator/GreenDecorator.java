public class GreenDecorator extends ShapeDecorator{
    public GreenDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setBorderGreen(decoratedShape);
    }

    public void setBorderGreen(Shape decoratedShape){
        System.out.println("Border color:  Green");
    }
}
