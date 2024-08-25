package lista7_8;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lista7_8 {
    public static void main(String[] args) {
        final int LIMITEMAX = 100;
        final int MAX = 5;
//        final int COLUNA = 5;
        int m[][] = new int [MAX][MAX];
        int cont, l, c=0, x=1, mod;
        for(l = 0; l < MAX; l++){
            cont = x;
            for(c = cont; c < MAX; c++){
                do{
                    m[l][c] = (int) (Math.random() * (LIMITEMAX+1));
                }while(m[l][c] % 2 != 0);
            }
            x++;
        }
        x = 0;
        for(l = 1; l < MAX; l++){
            for(c = 0; c <= x; c++){
                do{
                    m[l][c] = (int) (Math.random() * (LIMITEMAX+1));
                }while(m[l][c] % 2 == 0);
            }
            x++;
        }
        for(l = 0; l < MAX; l++){
            do{
                mod = 0;
                m[l][l] = (int) (Math.random() * (LIMITEMAX+1));
                for(cont = 1; cont <= m[l][l]; cont++){
                    x = m[l][l] % cont;
                    if(x == 0){
                        mod++;
                    }
                } 
            }while(mod != 2);
        }
        String vetorOriginal = "";
        for (x = 0; x < MAX; x++){
            vetorOriginal += Arrays.toString(m[x]) + "\n";
        }
        JOptionPane.showMessageDialog(null, "Matriz gerada: \n"+vetorOriginal);
    }    
}
