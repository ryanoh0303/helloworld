public class Shape {

    protected String name;
    protected int numSides;
    private String color;



    public Shape(){
        name = "Shape";
        color = "White";
        numSides = 0;

    }

    public Shape(String name, String color, int numSides){
        this.name = name;
        this.color = color;
        this.numSides = numSides;
    }

    public String printAttributes(){
        return "Name: " + name + " Color: " + color + " Sides: " + numSides;
    }
    public String printAttributes(String atr){
        if(atr == "name"){
            return "Name: " + name;
        }
        else if(atr == "color"){
            return "Color: " + color;
        }
        else if(atr == "sides"){
            return "Sides: " + numSides;
        }
        return "";
    }
}
