
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
}
