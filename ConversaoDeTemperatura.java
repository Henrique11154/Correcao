public class ConversaoDeTemperatura {

    int Celsius;

    int conversaoDeCelcioParaKelvin(int temp){
        int k = temp + 273; 

        return k ; 
    }

    double conversaoDeCelcioParaFahrenheit(int temp){
        double F = 1.8*temp + 32;
       

        return F;
    }
}
