package CapaLogica;

public class Temperaturas {
    
    public static String celciusFahrenheit(String celcius){
        try{
            return ((9*Double.parseDouble(celcius))/5)+32+"";
        }catch(Exception e){
            return e.getMessage();
        }
    }
    public static String fahrenheitCelcius(String fahrenheit){
        try{
            return (Double.parseDouble(fahrenheit)-32)/1.8+"";
        }catch(Exception e){
            return e.getMessage();
        }
    }
    public static String celciusKelvin(String celcius){
        try{
            return Double.parseDouble(celcius)+273.15+"";
        }catch(Exception e){
            return e.getMessage();
        }
    }
    public static String kelvinCelcius(String kelvin){
        try{
            return Double.parseDouble(kelvin)-273.15+"";
        }catch(Exception e){
            return e.getMessage();
        }
    }
    public static String fahrenheitKelvin(String fahrenheit){
        try{
            return ((5*(Double.parseDouble(fahrenheit)-32))/9)+273.15+"";
        }catch(Exception e){
            return e.getMessage();
        }
    }
    public static String kelvinFahrenheit(String kelvin){
        try{
            return ((9*(Double.parseDouble(kelvin)-273.15))/5)+32+"";
        }catch(Exception e){
            return e.getMessage();
        }
    }
}
