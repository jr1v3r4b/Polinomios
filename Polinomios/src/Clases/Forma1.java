package Clases;

import javax.swing.JOptionPane;

import java.util.Arrays;

/**
 *
 */
public class Forma1 {
    //    Atributos
    
    private int dU, n, vecForma1[];
    
    //  Metodos

    public Forma1(int tam) {
        n = tam;
        dU = n-1;
        vecForma1 = new int [n];
    }

    public int getdU() {
        return dU;
    }

    public void setdU(int dU) {
        this.dU = dU;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getVecForma1() {
        return vecForma1;
    }

    public void setVecForma1(int[] vecForma1) {
        this.vecForma1 = vecForma1;
    }
    
    public int getVecForma1(int pos) {
        return vecForma1[pos];
    }

    public void setVecForma1(int pos, int d) {
        vecForma1[pos] = d ;
    }
 
    public Forma1 organizarenForma1(String preForma[], Forma1 pf1)
    {
        int grado = 0, pos;
        int aux[]= new int [preForma.length];
        
        for (int i=0; preForma[i] != null;i++)
        {
            aux[i]=Integer.parseInt(preForma[i]);  
        }
        
        for(int i=1; i<=aux.length - 2; i+=2)
        {
            if(grado < aux[i])
            {
                grado=aux[i];
            }
        }
        
        
        pf1.setN(grado + 2);
        pf1.setdU(grado + 1);
        pf1.vecForma1 = new int [grado + 2];
        pf1.setVecForma1(0, grado);

        
        for(int i=0;aux[i] != 0;i+=2)
        {
            pos = pf1.dU-aux[i+1];
            pf1.setVecForma1(pos, aux[i]);
        }
        
        return pf1;
        
    }
    
    public void mostrar(Forma1 vec)
    {
        JOptionPane.showMessageDialog(null, Arrays.toString(vecForma1));
        
      /*for (int i = 0; i <= vec.getdU(); i++)
      {
          JOptionPane.showMessageDialog(null, "|" + vec.getVecForma1(i) ,"Polinomio en Forma 1", 1 );
      } */
    }

    public void evaluarPolinomio(Forma1 vec)
    {
        int i = 1, x, exp, result =0;
        
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Qué valor le vas a dar a la X ? : "));
        while (i <= vec.getdU())
        {
            exp = vec.getdU() - 1;
            if(vec.getVecForma1(i) == 1 && vec.getVecForma1(i) == -1)
            {
                result += x;
               
            }
            if(exp == 0 )
            {
                result = result + vec.getVecForma1(i);
            }
            else
            {
                result = (int)(result + (vec.getVecForma1(i)*(Math.pow(x, exp))));
            }
        }
    }
}
    
