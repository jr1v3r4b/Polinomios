
package polinomios;

import Clases.Forma1;
import Clases.Forma2;
import Clases.Forma3;
import javax.swing.JOptionPane;


/**
* 
 * PRACTICA 1 POLINOMIOS
 * ingreso del polinomio en string}
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

        String sCadena = JOptionPane.showInputDialog(null, "Ingrese el polinomio");
        
        // String sCadena = "3x^3+2x-10x^4+7", auxCade ="";
        
        String [] preFormas = manejoPolinomio(sCadena);
        
        Forma1 pf1 = new Forma1(20);
        Forma2 pf2 = new Forma2(20);
        Forma3 pf3 = new Forma3();
        
        
        
        int op = 0, op2 = 0;
        do{
            op = menu();
            switch (op) {
                case 1:
                    
                    op2 = menuFormas();
                    pf1.organizarenForma1(preFormas, pf1);
                   
                    switch (op2) {
                        case 1: 
       
                            break;
                        case 2:
                            break;
                            
                        case 3:
                            
                            pf1.evaluarPolinomio(pf1);
                            break;
                        case 4: //mostrar
                            pf1.mostrar(pf1);
                            break;
                            
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 2:
     
                    int cont=0, nTerminos=0;
                    for(int j=0;preFormas[j]!=null;j++)
                    {
                        cont++;
                    }

                    nTerminos= cont/2;             
                    pf2 = new Forma2(nTerminos*2+1);
                    pf2.organizarEnForma2(preFormas, pf2, nTerminos);
                    op2= menuFormas();

                   
                    switch (op2) {
                        case 1: 
                    
                           
                            break;
                        case 2:
                            break;
                            
                        case 3:
                            
                            break;
                        case 4: //mostrar
                            
                            break;
                            
                        default:
                            throw new AssertionError();
                    }
                    

                    break;
                case 3:
                    op2 = menuFormas();
                    
                    for(int j=0;preFormas[j]!=null;j++)
                    {
                        pf3.insertarOrdenado(Integer.parseInt(preFormas[j]), Integer.parseInt(preFormas[j + 1]));
                    }
                   
                    switch (op2) {
                        case 1: //insertar termino
                            
                           pf3.insertarTermino(pf3);
                           
                            break;
                        case 2:
                            break;
                            
                        case 3:
                            pf3.evaluar(pf3);
                            break;
                        case 4: //mostrar
                            pf3.evaluar(pf3);
                            break;
                            
                        default:
                            throw new AssertionError();
                    }

                    break;
                case 4:

                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Saliendo", "Opciones", 3 );

                    throw new AssertionError();
                    
            }
        }while(op != 0);
        
    }
    
    public static int menu()
    {
        return Integer.parseInt(JOptionPane.showInputDialog("*** Bienvenido mijo, bien pueda siga... *** \n\n" + 
                                    "1. Trabajar en Forma 1 \n" + 
                                    "2. Trabajar en Forma 2 \n" +
                                    "3. Trabajar en Forma 3 \n" + 
                                    "0. Salir \n\n Ingrese la opción: " ));
        
    }
    
      public static int menuFormas()
    {
        return Integer.parseInt(JOptionPane.showInputDialog("**MENU FORMA ELEGIDA**\n"
                + "1. Insertar termino\n"
                + "2. borrar termino \n"
                + "3. Evaluar Polinomio \n"
                + "4. Mostrar forma\n"
               // + "5. Reconstruir\n"
               // + "6. Sumar 2 polinomios\n"
               // + "7. Multiplicar 2 Polinomio\n"
                + "8. Volver\n"
                + "9. Salir\n"
                + "Ingrese una opcion: "));
    }
    
    public static String [] manejoPolinomio(String sCadena)
    {
        
        String auxCade = "";
        int j = 0;
        char veCar[] = sCadena.toCharArray();
        String []vecStr = new String[veCar.length];
        
        for (int i = 0; i < veCar.length; i++) {
            System.out.print("[" + i + "]" + veCar[i]);
        }

        for (int i = 0; i < veCar.length; i++) 
        {
            
            if (veCar[i] == '-' || Character.isDigit(veCar[i])) {
                
                if (Character.isDigit(veCar[i])) 
                {
                    auxCade += veCar[i];
                    if (i < veCar.length - 1)
                    {
                        if (veCar[i + 1] == '-' || veCar[i + 1] == '+') 
                        {
                            vecStr[j] = auxCade;
                            j++;
                            vecStr[j] = "0";
                            j++;
                            auxCade = "";
                        }
                    }else{
                            vecStr[j] = auxCade;
                            j++;
                            auxCade = "";
                            if (i + 1 == veCar.length) 
                            {
                                vecStr[j] = "0";
                            }
                    }
                }else{
                    auxCade += veCar[i];
                }

            } else {
                if (veCar[i] == 'x') {
                    if (auxCade.equals("")) {
                        vecStr[j] = "1";
                        j++;
                    } else {
                        if (auxCade.equals("-")) {
                            auxCade += "1";
                            vecStr[j] = auxCade;
                            j++;
                            auxCade = "";
                        } else {
                            vecStr[j] = auxCade;
                            j++;
                            auxCade = "";
                        }
                    }
                    if(i <= veCar.length - 2)
                    {
                        if (veCar[i + 1] == '^') {
                            i += 2;
                            auxCade += veCar[i];
                            vecStr[j] = auxCade;
                            j++;
                            auxCade = "";
                        } else {
                            vecStr[j] = "1";
                            j++;
                            auxCade = "";
                        }
                    }else{
                        vecStr[j] = "1";
                        j++;
                    }
                }
            }
            System.out.println("\n");
        }
        
        for (int i = 0; i < vecStr.length; i++) {
            System.out.print("[" + vecStr[i] + "]");
        }
        
        return vecStr;
                
    }
    

  
}


