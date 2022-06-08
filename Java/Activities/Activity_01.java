package Activities;

public class Activity_01 {

        public static void main( String[] args) {
            Car Toyota = new Car();
            Toyota.make = 2014;
            Toyota.color = "Black";
            Toyota.transmission = "Manual";

            Toyota.displayCharacterstics();
            Toyota.accelerate();
            Toyota.brake();
        }

    }

