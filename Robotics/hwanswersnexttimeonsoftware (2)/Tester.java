public class Tester {
    public static void main(String[] args) {
        Square bob = new Square("Bob", "Orange", 4, 7);
        System.out.println(bob.printAttributes());


        Octagon gokul = new Octagon("Gokul", "Green", 8, 3);
        System.out.println(gokul.printAttributes());

        Triangle neal = new Triangle("neal", "blue", 3, new double[]{3, 6, 8});
        System.out.println(neal.printAttributes());


        //turns out this next part (print name and area from low->high) is harder than it seems
        // The issue is the part where you have to figure out what kind of shape the area values are.
        //if the shape class had the area attribute this wouldn't be too bad.

        //p.s. I actually didn't want it to be this confusing/convoluted. Sorry :(

        System.out.println("\n\n Timmy:");

        Preschooler timmy = new Preschooler("Timmy", "Bernarbo Tights Preschool", 6, bob);
        System.out.println(timmy.reciteShapeInfo());




    }
}
