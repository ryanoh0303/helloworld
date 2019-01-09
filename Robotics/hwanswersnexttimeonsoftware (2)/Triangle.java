import java.util.ArrayList;
import java.util.Arrays;

public class Triangle extends Shape{


    protected double[] sideLen;
    protected double area;
    public Triangle(){
        super();
        sideLen = new double[] {0, 0, 0};

    }

    public Triangle(String name, String color, int numSides, double[] sideLen){
        super(name, color, numSides);
        this.sideLen = sideLen;
        area = calculateArea();
    }

    public double calculateArea(){
        double s = (sideLen[0] + sideLen[1] + sideLen[1])/2.0;
        return Math.sqrt(s * (s-sideLen[0]) * (s-sideLen[1] ) * (s-sideLen[1]));
    }

    public String printAttributes(){
        return super.printAttributes() + " Sides: " + Arrays.toString(sideLen) +  " Area: " + area;

    }
    public String printAttributes(String atr){
        if(atr == "sides"){
            return "Sides: " + Arrays.toString(sideLen);
        }
        return super.printAttributes(atr);
    }

}
