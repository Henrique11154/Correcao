public class Celsius {

    public static void main(String[] args) {
        
        ConversaoDeTemperatura t = new ConversaoDeTemperatura();
        
        int kelvin = t.conversaoDeCelcioParaKelvin(25);
        double Fahrenheit = t.conversaoDeCelcioParaFahrenheit(25);

        System.out.println("Temperatura em celsius " + t.Celsius);
        System.out.println("Temperatura em Kelvin " + kelvin);
        System.out.println("Temperatura em Fahrenheit " + Fahrenheit);
    }
    
}




