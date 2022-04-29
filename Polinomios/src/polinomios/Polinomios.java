
package polinomios;

import Clases.Forma1;
import Clases.Forma2;
import Clases.Forma3;
import javax.swing.JOptionPane;


/**
 *
 * @author sala306
 * 
 * PRACTICA 1 POLINOMIOS
 * inreso del polinomio en string}
 * insertar termino - eliminar termino
 * mostrar forma
 * mostrar polinomio(reconstruir)
 * evaluar el polinomio segun un valor de X ingresado por el usuario.
 * sumar dos polinomios en la misma forma
 * Multiplicar dos polinomios en la misma forma
 * 
 * F1 + F2 = F3
 * F3 * F1 = F3
 */
public class Polinomios {

    public static void main(String[] args) {
        System.out.println("Ingrese el polinomio");
        JOptionPane.showMessageDialog(null, "MENU");

        
        
        
        Forma1 pf1 = new Forma1(5);
        Forma2 pf2 = new Forma2(5);
        Forma3 pf3 = new Forma3();
        
        int op = 0;
        do{
            JOptionPane.showMessageDialog(null, "***Menu***");
            menu();
            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Opcion 1", "Opciones", -1 );
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Opcion 2", "Opciones", 0 );

                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Opcion 3", "Opciones", 1 );

                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Opcion 4", "Opciones", 2 );

                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Saliendo", "Opciones", 3 );

                    throw new AssertionError();
                    
            }
            menu();
        }while(op != 0);
        
        
        
    }
    
    public static int menu()
    {
        return Integer.parseInt(JOptionPane.showInputDialog("*** Welcome *** \n\n" + 
                                    "1. Ingresar Forma 1 \n" + 
                                    "2. Ingresar Forma 2 \n" +
                                    "3. Ingresar Forma 3 \n" + 
                                    "0. Salir \n\n Ingrese la opción: " ));
        
    }
    
   
}
