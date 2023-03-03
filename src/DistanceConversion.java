public class DistanceConversion {
    public static void main(String[] args) {
        int kilometers = 10;
        int miles = 6;

        System.out.println(kilometers + " kilometers are " + kilometersToMiles(kilometers) + " miles.");
        System.out.println(miles + " miles are " + milesToKm(miles) + " kilometers.");

    }

    public static double kilometersToMiles(int kilometers) {
        return kilometers * 0.62137119;
    }

    public static double milesToKm(int miles) {
        return miles * 1.609344;
    }

}
