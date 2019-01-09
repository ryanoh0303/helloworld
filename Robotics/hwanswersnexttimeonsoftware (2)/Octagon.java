import java.util.Arrays;

public class Octagon extends Shape{

    protected double side;
    protected double area;
    public Octagon(){
        super();
        side = 0;

    }

    public Octagon(String name, String color, int numSides, double side){
        super(name, color, numSides);
        this.side = side;
        area = calculateArea();
    }

    public double calculateArea(){
        return 2*(1+Math.sqrt(2))*Math.pow(side, 2);
    }

    public String printAttributes(){
        return super.printAttributes() + " Side Len: " + side +  " Area: " + area;

    }
    public String printAttributes(String atr){
        if(atr == "side"){
            return "Side Len: " + side;
        }
        return super.printAttributes(atr);
    }
}
