public class CarDecoraterPattern {
    public static void main(String[] args) {
        Car car=new SuperCar(new BasicCar());
        car.assemble();

        Car c=new LuxuryCar(new BasicCar());
        c.assemble();

        // expected output
        // Basic car. Super car
        // Basic car. Luxury car

    }
}
