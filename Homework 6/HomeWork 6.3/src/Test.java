import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Test {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Peter", "Malkovich", 12);
        Driver driver2 = new Driver("Sam", "Fisher", 20);
        Engine engine1 = new Engine("RollsRoys", 500);
        Engine engine2 = new Engine("MTZ", 1500);


        SportCar toyota = new SportCar("Toyota", "cabrio", 1500, driver1, engine1, 200);
        System.out.println(toyota);
        System.out.println();

        Lorry maz = new Lorry("MAZ", "high weight", 6000, driver2, engine2, 5000);
        System.out.println(maz);
        System.out.println();

        toyota.start();
        toyota.turnLeft();
        toyota.turnRight();
        toyota.stop();
    }
}
