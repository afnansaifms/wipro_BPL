package Assignment_abstract;
import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "First Class Compartment: AC coach, ticket and valid ID required for entry.";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment: Reserved for women passengers only.";
    }
}

class General extends Compartment {
    public String notice() {
        return "General Compartment: Open seating for all passengers, unreserved.";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Luggage Compartment: For parcels and luggage only, no passengers allowed.";
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random rand = new Random();

        for (int i = 0; i < compartments.length; i++) {
            int type = rand.nextInt(4) + 1; // random number 1 to 4

            switch (type) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        System.out.println("Train Coach Notices:\n");
        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Compartment " + (i + 1) + " ("
                + compartments[i].getClass().getSimpleName() + "): "
                + compartments[i].notice());
        }
    }
}