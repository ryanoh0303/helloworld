public class Rectangle extends Shape{

    protected double width;
    protected double length;
    protected double area;

    public Rectangle(){
        super();
        width = 0;
        length = 0;
        area = 0;

    }

    public Rectangle(String name, String color, int numSides, double width, double length){
        super(name, color, numSides);
        this.width = width;
        this.length = length;
        area = calculateArea();
    }

    public double calculateArea(){
        return width*length;
    }

    public String printAttributes(){
        return super.printAttributes() + " Width: " + width + " Length: " + length + " Area: " + area;

    }
    public String printAttributes(String atr){
        if(atr == "length"){
            return "Length: " + length;
        }
        else if(atr == "width"){
            return "Width: " + width;
        }
        return super.printAttributes(atr);
    }
}
