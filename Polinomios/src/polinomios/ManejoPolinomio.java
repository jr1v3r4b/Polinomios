
package polinomios;
import java.util.Scanner;

/**
 *
 * @author sala306
 */
public class ManejoPolinomio {
    
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);
        String sCadena = "2x-13x^4+3-8x^5", auxCade = "";
        // String sCadena = "3x^3+2x-10x^4+7", auxCade ="";
        int j = 0;
        char veCar[] = sCadena.toCharArray();
        String[] vecStr = new String[veCar.length];

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
    }
    
    
}
