public class TemperatureConversion {
    public static void main(String[] args) {
        double temperatureInCelcius = -10;
        double temperatureInFahrenheit = 14;

        System.out.println(temperatureInCelcius + " degrees Celcius are " + celciusToFahrenheit(temperatureInCelcius) + " degrees Fahrenheit.");
        System.out.println(temperatureInFahrenheit + " degrees Fahrenheit are " + fahrenheitToCelcius(temperatureInFahrenheit) + " degrees Celcius.");

    }

    public static double celciusToFahrenheit (double temperatureInCelcius) {
        return temperatureInCelcius * 1.8 + 32;
    }

    public static double fahrenheitToCelcius ( double tempInFahrenheit) {
        return (tempInFahrenheit -32) * 0.5556;
    }
}
