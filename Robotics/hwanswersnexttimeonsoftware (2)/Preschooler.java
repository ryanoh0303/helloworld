public class Preschooler {
    public String name;
    public String school;
    public int age;
    public Shape favShape;

    public Preschooler(String name, String school, int age, Shape favShape){
        this.name = name;
        this.school = school;
        this.favShape = favShape;
        this.age = age;

    }

    public Preschooler(){
        name = "Wot";
        age = 1000;
        favShape = new Octagon();
        school = "bernarbo tights";
    }

    public String reciteShapeInfo(){
        return favShape.printAttributes();
    }

}
