package EJER_3;


public class Utilidades {
    public static double convertirCelsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = Utilidades.convertirCelsiusAFahrenheit(celsius);
        System.out.println(celsius + " °C es igual a " + fahrenheit + " °F");
    }
}
