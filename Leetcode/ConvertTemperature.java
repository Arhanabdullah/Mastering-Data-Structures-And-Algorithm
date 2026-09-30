package Leetcode;

public class ConvertTemperature {
    // Leetcode 2469: Convert the Temperature
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    //Simple direct calculation solution
    public double[] convertTemperature(double celsius) {
        double kelvinTemperature = celsius +273.15;
        double fahrenheitTemperature=celsius *1.80+32.00;
        return new double[]{kelvinTemperature, fahrenheitTemperature};
    }
}
