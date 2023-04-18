public class BmiService {

    public double calculate(int weight, double heightM) {
        double index = weight / (heightM * heightM);
        return (int) index;


    }
}
