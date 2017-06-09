/**
 * Created by ericcalasans on 09/06/17.
 */
public class Testes {
    public static void main(String[] args) {
        System.out.println("Verificacao de correcao da funcao...");
        System.out.println("Tamanho de FenwickTree(6) : "
                + (new FenwickTree(6)).size());
        System.out.println("Tamanho de allZeros(6) : "
                + (FenwickTree.allZeros(6)).size());
        System.out.println("Tamanho de allZeros(12) : "
                + (FenwickTree.allZeros(12)).size());
        FenwickTree T1 = new FenwickTree(3, new FenwickTree(1, new FenwickTree(4),
                new FenwickTree(1, new FenwickTree(2), new FenwickTree(5))),
                new FenwickTree(1, new FenwickTree(3),
                        new FenwickTree(1, new FenwickTree(6), new FenwickTree(1))));
        System.out.println("Arvore this : " + T1);
        System.out.println("Tamanho de this : " + T1.size());
    }
}
