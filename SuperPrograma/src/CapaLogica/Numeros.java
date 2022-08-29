package CapaLogica;

public class Numeros {
    public static String Factorial(String numero){
        int acumulador=1,cont=1;
        try{
            for(int i=0;i<Integer.parseInt(numero);i++){
                acumulador=acumulador*cont;
                cont++;
            }
            return acumulador+"";
        }catch(Exception e){
            return e.getMessage();
        }
    }
    public static String Primos(String numero){
        int cont=0;
        try{
            if(Integer.parseInt(numero)<=1)return"No es un numero primo"; 
            
            for(int i=2;i<Integer.parseInt(numero);i++){
                cont=Integer.parseInt(numero)%i;
                if(cont==0)return"No es un numero primo";
            }
            return "Es un numero primo";
        }catch(Exception e){
            return "No es un numero primo";
        }
    }
    public static void numeroRandom(){
        Double Valor=Math.random()*10000;
        int ValorRedondeado=(int)Math.floor(Valor);
        Double OtroValor=Valor-ValorRedondeado;
        if(OtroValor==0.0)System.out.println(ValorRedondeado);
        else System.out.println(Valor);
    }
    public static String suma(String numero1, String numero2){
        try{
            return Double.parseDouble(numero1)+Double.parseDouble(numero2)+"";
        }catch(Exception e){
            return e.getMessage();
        }
    }
}
