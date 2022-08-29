package CapaLogica;

public class Decimal {
    public static String binarioDecimal(String numero){
        try{
        int entero=(int)Math.floor(Double.parseDouble(numero));
        Double decimal=Double.parseDouble(numero)-entero;
        if(decimal==0.0)return Integer.toBinaryString(entero);
        return Integer.toBinaryString(entero)+postDecimal(decimal);
        }catch(Exception e){
            return e.getMessage();
        }
    }
    private static String postDecimal(Double decimal){
        String binario=".";
        int cont;
        for(int i=0;i<4;i++){
            decimal=decimal*2;
            cont=(int)Math.floor(decimal);
            if(cont==1)decimal=decimal-1;
            binario=binario+cont;
        }
        return binario;
    }
}
