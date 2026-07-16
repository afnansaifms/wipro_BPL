package hand_on_practice;
class Box {
  
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double getVolume() {
        return width * height * depth;
    }
}

public class OopsAssignment1 {
    public static void main(String[] args) {
        Box myBox = new Box(5.0, 10.0, 3.0);

         
        System.out.println("The volume of the box is: " + myBox.getVolume());
    }
}