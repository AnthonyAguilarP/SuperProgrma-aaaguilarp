package CapaPresentacion;

import CapaLogica.Numeros;
import java.util.Scanner;

public class PseudoMenu implements IMenu{
    
    private Scanner sc=new Scanner(System.in);
    private String opc,a,b;
    
    @Override
    public void opciones() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("1.Generar un número aleatorio");
        System.out.println("2.Sumar");
        System.out.println("3.Salir");
        System.out.print("Escoja la opción deseada: ");
    }

    @Override
    public void mostrarMenu() {
        while(false!=true){
            opciones();
            opc=sc.next();
            System.out.println("----------------------------------------------------------------");
            if("1".equals(opc))Numeros.numeroRandom();
            else if("2".equals(opc)){
                System.out.print("Ingrese el primer valor: ");
                a=sc.next();
                System.out.print("Ingrese el segundo valor: ");
                b=sc.next();
                System.out.println(Numeros.suma(a, b));
            }
            else if("3".equals(opc))break;
            else System.out.println("Escoja un opción válida");
        }
    }
}
