public class Car implements Vehicle {

    private String color;  
    private int manufactureDate;  
//creating a constructor of the class  
    public Car(String color, int manufactureDate) {  
        this.color = color;  
        this.manufactureDate = manufactureDate;  
    }  
//creating getters and setters  
    public String getColor() {  
        return color;  
    }  
    public void setColor(String color) {  
        this.color = color;  
    }  
    public int getManufactureDate() {  
        return manufactureDate;  
    }  
    public void setManufactureDate(int manufactureDate) {  
        this.manufactureDate = manufactureDate;  
    }  

    @Override
    public int accept(VehicleInspector vi) {
        // TODO Auto-generated method stub
        return VehicleInspector.visit(this);  
    }
    
}
