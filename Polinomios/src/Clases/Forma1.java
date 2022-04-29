
package Clases;

/**
 *
 * @author sala306
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
    
    
}
