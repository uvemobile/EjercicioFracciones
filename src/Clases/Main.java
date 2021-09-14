
package Clases;


import java.util.Scanner;

/**
 *
 * @author uvemo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcionSeleccionada; 
        //generamos dos fracciones con el metodo ramdom de Math
        Fracciones fraccionA=new Fracciones((int) (Math.random() * 10 + 1), (int) (Math.random() * 10 + 1));
        Fracciones fraccionB=new Fracciones((int) (Math.random() * 10 + 1), (int) (Math.random() * 10 + 1));    
        Scanner seleccion = new Scanner(System.in);
        
        try {
            do {
                opciones();
                System.out.println("Seleccione una operación a realizar:");
                opcionSeleccionada = seleccion.nextInt();
                
                switch (opcionSeleccionada) {
                    case 1: {
                        System.out.println("Fracciones generadas con éxito!!\n");
                        System.out.println(fraccionA.toString());
                        System.out.println(fraccionB.toString()+"\n");
                       break;
                    }
                    case 2 : {
                        Fracciones fraccionC=new Fracciones();
                        fraccionC=Fracciones.sumar(fraccionA, fraccionB);
                        System.out.println("El resultado de la suma " + fraccionA + " + " + fraccionB + " es: " + fraccionC.toString()+"\n");
                       break;
                    }
                    
                    case 3 : {
                       Fracciones fraccionC=new Fracciones();
                       fraccionC=Fracciones.restar(fraccionA, fraccionB);
                       System.out.println("El resultado de la resta " + fraccionA + " - " + fraccionB + " es: " + fraccionC.toString()+"\n");
                        break;
                    }
                    
                    case 4 : {
                       Fracciones fraccionC=new Fracciones();
                       fraccionC=Fracciones.restar(fraccionA, fraccionB);
                       System.out.println("El resultado de la multiplicación " + fraccionA + " * " + fraccionB + " es: " + fraccionC.toString()+"\n");
                        break;
                    }
                    
                    case 5 : {
                        Fracciones fraccionC=new Fracciones();
                       fraccionC=Fracciones.restar(fraccionA, fraccionB);
                       System.out.println("El resultado de la división " + fraccionA + " ÷ " + fraccionB + " es: " + fraccionC.toString()+"\n");
                        break;
                    }
                    case 6 :{
                        System.out.println("Saliendo del programa...");
                        break;
                    }
                }
            } while (opcionSeleccionada != 6);
        } catch (Exception e) {
            System.out.println("toString(): " + e.toString());
            
        }
    
    }
        
    private static void opciones(){
        System.out.println("Operaciones disponibles:");
        System.out.println(" [1] Crear una fracciones.");
        System.out.println(" [2] Suma de fracciones.");
        System.out.println(" [3] Resta de fracciones.");
        System.out.println(" [4] Multiplicación de fracciones.");
        System.out.println(" [5] División de fracciones.");
        System.out.println(" [6] Salir del programa");
         
    }
    
   
}
