
package Clases;

/**
 *
 * @author sala306
 */
public class Forma3 {
    
    //Atributos
    
    Nodo Punta, Final;

    public Forma3() {
        
        Punta = null;
        Final = null;
    }
    
    public void insertarFinal(int c, int e)
    {
        Nodo x = new Nodo();
        
        x.setCoe(c);
        x.setExp(e);
        if(Punta == null)
        {
            Punta = x;
            Final = x;
        }
        else
        {
            Final.setLiga(x);
            Final = x;
        }
    }
    
}
