import java.util.*;

abstract class Vehicle {
    abstract int fare(int d);
}

class Bike extends Vehicle {
    int fare(int d) {
        return d * 5;
    }
}

class Auto extends Vehicle {
    int fare(int d) {
        return d * 12;
    }
}

class Cab extends Vehicle {
    int fare(int d) {
        return d * 12;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int d = sc.nextInt();

            try {
                Vehicle v;

                if (type.equals("Bike"))
                    v = new Bike();
                else if (type.equals("Auto"))
                    v = new Auto();
                else if (type.equals("Cab"))
                    v = new Cab();
                else
                    throw new Exception();

                if (d <= 0)
                    throw new Exception();

                System.out.println(v.fare(d));

            } catch (Exception e) {
                System.out.println("Invalid booking");
            }
        }
    }
}