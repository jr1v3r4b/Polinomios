
package Clases;

/**
 *
 * @author sala306
 */
public class Forma2 {
    // Atributos
    
    private int dU, n, vecForma2[];

    public Forma2(int tam) {
        n = tam;
        dU = n - 1;
        vecForma2 = new int[n];
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

    public int[] getVecForma2() {
        return vecForma2;
    }

    public void setVecForma2(int[] vecForma2) {
        this.vecForma2 = vecForma2;
    }
    
    public int getVecForma2(int pos) {
        return vecForma2[pos];
    }

    public void setVecForma2(int pos, int d) {
        vecForma2[pos] = d ;
    }
    
    public Forma2 organizarEnForma2(String Vs[], Forma2 a, int n )
    {
        int i=0, j=0,s=0, k=1;
        int aux[]=new int [n*2];
        int exp[]=new int [aux.length/2];
        a.setVecForma2(0, n);
        for(j=0;Vs[i]!=null;j++){
            aux[j]=Integer.parseInt(Vs[i]);
            i++;
        }
        i=1; j=0;
        while(i<aux.length)
        {
            exp[j]=aux[i];
            j++;
            i=i+2;
        }
        i=0; j=0;
        for (i=0; i<aux.length; i++) 
        {
            for (j=i+1; j<exp.length; j++)
            {
             if(exp[i]<exp[j])
             {
                s= exp[i];
                exp[i] = exp[j];
                exp[j] = s;
             }
           }
        }
        i=0;j=1;
        while(i<exp.length)
        {
            if(exp[i] == aux[j])
            {
                a.setVecForma2(k, aux[j-1]);
                a.setVecForma2(k+1, aux[j]);
                k=k+2;
                i++;
            }
            j=j+2;
            if(j>aux.length)
            {
                j=1;
            }
        }
        return a;
    }
}
