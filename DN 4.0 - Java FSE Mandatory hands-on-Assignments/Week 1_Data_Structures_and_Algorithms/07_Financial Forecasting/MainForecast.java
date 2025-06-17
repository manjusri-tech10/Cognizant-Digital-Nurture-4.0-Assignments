public class MainForecast {
    public static void main(String[] args) {
        Forecast f = new Forecast();
        double normal = f.futureValue(10000, 0.05, 3);
        System.out.println("Future Value without memoization: " + normal);

        double[] memo = new double[4];
        double memoized = f.futureValueMemo(10000, 0.05, 3, memo);
        System.out.println("Future Value with memoization: " + memoized);
    }
}
