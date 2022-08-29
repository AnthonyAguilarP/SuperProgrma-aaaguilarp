package CapaPresentacion;

import CapaLogica.Decimal;
import CapaLogica.Movimiento;
import CapaLogica.Numeros;
import java.util.Scanner;

public class Menu implements IMenu{
    
    private Scanner sc=new Scanner(System.in);
    private String opc,a,b;
    private PseudoMenu c=new PseudoMenu();
    private MenuTemperaturas d=new MenuTemperaturas();
    
    @Override
    public void opciones(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("1.Calcular velocidad de un MRU");
        System.out.println("2.Calcular hmax de un proyectil con trayectoria parabolica");
        System.out.println("3.Identificar si un numero es primo");
        System.out.println("4.Calcular factorial de un numero");
        System.out.println("5.Otras opciones");
        System.out.println("6.Convertir a binario");
        System.out.println("7.Calcular temperatura");
        System.out.println("8.Salir");
        System.out.print("Escoja la opcion deseada: ");
    }
    
    @Override
    public void mostrarMenu(){
        while(false!=true){
            opciones();
            opc=sc.next();
            System.out.println("----------------------------------------------------------------");
            if("1".equals(opc)){
                System.out.print("Ingrese la distancia: ");
                a=sc.next();
                System.out.print("Ingrese el tiempo: ");
                b=sc.next();
                System.out.println(Movimiento.velocidadMRU(a, b));
            }
            else if("2".equals(opc)){
                System.out.print("Ingrese la velocidad inicial: ");
                a=sc.next();
                System.out.print("Ingrese el angulo de inclinacion: ");
                b=sc.next();
                System.out.println(Movimiento.hmaxProyectil(a, b));
            }
            else if("3".equals(opc)){
                System.out.print("Ingrese el numero: ");
                System.out.println(Numeros.Primos(sc.next()));
            }
            else if("4".equals(opc)){
                System.out.print("Ingrese el numero: ");
                System.out.println(Numeros.Factorial(sc.next()));
            }
            else if("5".equals(opc))c.mostrarMenu();
            else if("6".equals(opc)){
                System.out.print("Ingrese el valor: ");
                System.out.println(Decimal.binarioDecimal(sc.next()));
            }
            else if("7".equals(opc))d.mostrarMenu();
            else if("8".equals(opc))break;
            else System.out.println("Escoja una opción válida");
        }
    }
}
