public class Forecast {
    public double futureValue(double current, double rate, int years) {
        if (years == 0) return current;
        return futureValue(current * (1 + rate), rate, years - 1);
    }

    public double futureValueMemo(double current, double rate, int years, double[] memo) {
        if (years == 0) return current;
        if (memo[years] != 0) return memo[years];
        memo[years] = futureValueMemo(current * (1 + rate), rate, years - 1, memo);
        return memo[years];
    }
}
