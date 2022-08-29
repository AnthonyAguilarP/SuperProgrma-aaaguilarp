package CapaPresentacion;

import CapaLogica.Temperaturas;
import java.util.Scanner;

public class MenuTemperaturas implements IMenu{

    private Scanner sc=new Scanner(System.in);
    private String opc;
    
    @Override
    public void opciones() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("1.Celcius a kelvin");
        System.out.println("2.Kelvin a celcius");
        System.out.println("3.Celcius a fahrenhit");
        System.out.println("4.Fahrenheit a celcius");
        System.out.println("5.Kelvin a fahrenheit");
        System.out.println("6.Fahrenheit a kelvin");
        System.out.println("7.Salir");
        System.out.print("Escoja la opción deseada: ");
    }

    @Override
    public void mostrarMenu() {
        while(false!=true){
            opciones();
            opc=sc.next();
            System.out.println("----------------------------------------------------------------");
            if("1".equals(opc)){
                System.out.print("Ingrese el valor: ");
                System.out.println(Temperaturas.celciusKelvin(sc.next()));
            }
            else if("2".equals(opc)){
                System.out.print("Ingrese el valor: ");
                System.out.println(Temperaturas.kelvinCelcius(sc.next()));
            }
            else if("3".equals(opc)){
                System.out.print("Ingrese el valor: ");
                System.out.println(Temperaturas.celciusFahrenheit(sc.next()));
            }
            else if("4".equals(opc)){
                System.out.print("Ingrese el valor: ");
                System.out.println(Temperaturas.fahrenheitCelcius(sc.next()));
            }
            else if("5".equals(opc)){
                System.out.print("Ingrese el valor: ");
                System.out.println(Temperaturas.kelvinFahrenheit(sc.next()));
            }
            else if("6".equals(opc)){
                System.out.print("Ingrese el valor: ");
                System.out.println(Temperaturas.fahrenheitKelvin(sc.next()));
            }
            else if("7".equals(opc))break;
            else System.out.println("Escoja una opción válida");
        }
    }
}
