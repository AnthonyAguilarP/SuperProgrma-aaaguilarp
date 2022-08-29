package CapaLogica;

public class Movimiento {
    
    public static String velocidadMRU(String distancia, String tiempo){
        try{
            return Double.parseDouble(distancia)/Double.parseDouble(tiempo)+"";
        }catch(Exception e){
            return e.getMessage();
        }
    }
    public static String hmaxProyectil(String velocidad, String angulo){
        try{
            Double radianes=Double.parseDouble(angulo)*0.01745329;
            return (Math.pow(Double.parseDouble(velocidad), 2)*Math.pow(Math.sin(radianes), 2))/(9.8*2)+"";
        }catch(Exception e){
            return e.getMessage();
        }
    }
}
