package retofinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RetoFinal {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
       int nivelVidaMago = 1; 
       int nivelVidaHeroe = 1;
       int ogro = 0;
       int hadas  = 5;
       int hadasRescatadas = 0;
       int hadasCapturadas = 0;
       int opcion = 0;
       int op; 
      
       Random aleatorio = new Random(System.currentTimeMillis());
       System.out.println("Bienvenido al juego.");
       System.out.println("Elija la opción 1 para empezar el juego, opción 2 para terminar. ");
       op = Integer.parseInt(entrada.readLine());
       
       if(op==1){
       do{
       opcion = aleatorio.nextInt(3) + 1;
       switch(opcion){
           case 1:
               hadas += 1;
               hadasRescatadas += 2;
               hadasCapturadas -= 2; 
               System.out.println("Le has robado 2 hadas al mago");
               System.out.println("Has rescatado a " + (hadasRescatadas) + " de 10. "); 
               System.out.println("---------------------------------------");
               break;
           case 2: 
               hadas += 1;
               hadasRescatadas -= 2;
               hadasCapturadas += 2;
               System.out.println("El mago te ha robado 2 hadas. ");
               System.out.println("tiene a: " + hadasCapturadas + " capturadas de 10");
               System.out.println("---------------------------------------");
               break; 
           case 3: 
               hadas += 1;
               ogro += 1;
               System.out.println("EL ogro te ha golpeado: " + ogro + " veces, ¡Cuidado!"); 
               System.out.println("---------------------------------------");
               break;
       }
       }while(hadasRescatadas != 10 && hadasCapturadas != 10 && ogro !=10);
       
       if(hadasRescatadas == 10){
           nivelVidaHeroe += 1;
           nivelVidaMago -=1;
           System.out.println("Has rescatado 10 hadas.");
           System.out.println("El mago ha perdido toda su vida;");
           System.out.println("Has ganado el juego.");
           
       }else if (hadasCapturadas == 10){
           nivelVidaHeroe -= 1; 
           nivelVidaMago += 1; 
           System.out.println("El mago ha capturado a 10 hadas.");
           System.out.println("Has perdido 1 de vida.");
           System.out.println("Has perdido el juego.");
       }if(ogro == 10){
           System.out.println("El ogro te ha golpeado 5 veces.");
           System.out.println("Has perdido el juego.");
       }
       
       }
       else if(op==2){
           System.out.println("El juego ha terminado.");
       }
    }
}