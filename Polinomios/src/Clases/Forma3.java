
package Clases;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author sala306
 */
public class Forma3 {
    
    //Atributos
    
    Nodo Punta, Final;

    public Nodo getPunta() {
        return Punta;
    }

    public void setPunta(Nodo Punta) {
        this.Punta = Punta;
    }

    public Nodo getFinal() {
        return Final;
    }

    public void setFinal(Nodo Final) {
        this.Final = Final;
    }

    public Forma3() {
        
        Punta = null;
        Final = null;
    }
    
    /*public void insertarFinal(int c, int e)
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

    }*/
    
        public void insertarTermino(Forma3 a)
    {
        int c=0, e=0;
        c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el coeficiente: "));
        e=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente: "));
        a.insertarOrdenado(c, e);
    }
    
    public void evaluar(Forma3 a)
    {
        //-x+37x^4+101-218x^2-x^7
        Nodo p = a.getPunta();
        int x,resul=0;
        x = Integer.parseInt(JOptionPane.showInputDialog("Vamos a darle un valor a X: "));
        while (p!=null)
        {
            resul+=p.getCoe()*(Math.pow(x,p.getExp()));
            p=p.getLiga();
        }
        JOptionPane.showMessageDialog(null, resul,"El resultado es:", 1);
    }
    
    public void mostrar(Forma3 vec)
    {
        //JOptionPane.showMessageDialog(null, Arrays.asList(Punta));
    
        Nodo p = Punta;
        while (p!= null)
        {
            JOptionPane.showMessageDialog(null, "|" + p.getCoe() + "|" + p.getExp() +    "|->","Polinomio en Forma 3", 1);
            p = p.getLiga();
        }
      
    }
    
    public void insertarOrdenado(int c, int e)
    {
        Nodo a = new Nodo(c, e);
        if (Punta == null) 
        {
            setPunta(a);
            setFinal(a);
        } else {
            Nodo p = new Nodo();
            Nodo Aux = new Nodo();
            p = getPunta();
            while (p.getLiga() != null && p.getExp() > e) {
                Aux = p;
                p = p.getLiga();
            }
            if (p.getExp() == e) {
                p.setCoe(c + p.getCoe());
            } else if (p == getPunta()) {
                if (e < p.getExp()) {
                    p.setLiga(a);
                    Final = a;
                } else {
                    a.setLiga(getPunta());
                    setPunta(a);
                }
            }
            else if (p == Final) {
                if (e > p.getExp()) {
                    Aux.setLiga(a);
                    a.setLiga(p);
                }else{
                    p.setLiga(a);
                    Final = a;
                }
            }else{
                Aux.setLiga(a);
                a.setLiga(p);
            }
        }
        
        
        
    }
 
}
