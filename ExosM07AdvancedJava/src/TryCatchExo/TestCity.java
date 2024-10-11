package TryCatchExo;

public class TestCity {
    public static void main(String[] args) {
        try {
            // This will throw an exception because population is negative
            City city = new City("InvalidCity", -100);
        } catch (InvalidCity e) {
            e.printStackTrace();  // This prints the error message and the line number
        }
    }
}
