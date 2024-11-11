package tutorial;

public class Converter {

    public double celsiusToFahrenheit(double temperature) {
        return (temperature * ((double) 9 / 5)) + 32;
    }

    public double fahrenheitToCelsius(double temperature) {
        return (temperature - 32) * 5 / 9;
    }

}
