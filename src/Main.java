public class Main {
    public static void main(String[] args) {
        BmiService service  = new BmiService();
        int weight = 98;
        double heightM = 1.87;

        double BMI = service.calculate(weight,heightM);
        System.out.println(BMI);


    }
}