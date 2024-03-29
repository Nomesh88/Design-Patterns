public class ShapeFactory {
    public Shape getShape(String type){
if(type==null){
    return null;
}
if(type=="Circle") return new Circle();
else if(type=="Square") return new Square();
else return new Rectangle();

return null;

    }
}
