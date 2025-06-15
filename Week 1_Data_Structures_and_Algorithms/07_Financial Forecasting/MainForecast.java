public class MainForecast {
    public static void main(String[] args) {
        Forecast f = new Forecast();
        f.futureValue(10000, 0.05, 3);
        double[] memo = new double[4];
        f.futureValueMemo(10000, 0.05, 3, memo);
    }
}
