/**
 * Created by ericcalasans on 02/06/17.
 */
public class FenwickTree {
    //Campos
    private int value;
    private int leftSize;
    private FenwickTree left;
    private FenwickTree right;

    //Sets e gets
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getLeftSize() {
        return leftSize;
    }

    public void setLeftSize(int leftSize) {
        this.leftSize = leftSize;
    }

    public FenwickTree getLeft() {
        return left;
    }

    public void setLeft(FenwickTree left) {
        this.left = left;
    }

    public FenwickTree getRight() {
        return right;
    }

    public void setRight(FenwickTree right) {
        this.right = right;
    }

    //Construtores
    public FenwickTree(int value){
        this.value = value;
        this.leftSize = 0;
        this.left = null;
        this.right = null;
    }

    public FenwickTree(int leftSize, FenwickTree left, FenwickTree right){
        this.value = left.value + right.value;
        this.leftSize = leftSize;
        this.left = left;
        this.right = right;
    }

    public FenwickTree(int value, int leftSize, FenwickTree left, FenwickTree right){
        this.value = value;
        this.leftSize = leftSize;
        this.left = left;
        this.right = right;
    }

    public String toString(){
        if(this.left == null || this.right == null){
            return "[" + this.value + ", " + this.leftSize + "]";
        } else {
            return "["+this.value + ", " + this.leftSize + ", "
                    + this.left.toString() + ", " + this.right.toString() + "]";
        }
    }

    public static FenwickTree allZeros(int n){
        if (n==0) return null;
        if (n==1) return new FenwickTree(0);
        int m = n/2;
        return new FenwickTree(0, n-m, allZeros(n-m), allZeros(m));
    }

    public int size(){
        if(this.leftSize == 0){
            return 1;
        } else {
            return left.size() + right.size();
        }
    }

    public void increment(int i, int delta){
        this.value += delta;

        if(!(i == 0 && this.leftSize == 0)){
            if(i < this.leftSize){
                this.left.increment(i, delta);
            } else {
                this.right.increment(i - this.leftSize, delta);
            }
        }
    }

    public int prefixSum(int upto){
        int soma = 0;

        if (this.left != null) {
            if (this.leftSize > upto) {
                soma = this.left.prefixSum(upto);
            } else {
                soma = this.left.value + this.right.prefixSum(upto - this.leftSize);
            }
        } else {
            if(upto != 0){
                soma = this.value;
            }
        }
        return soma;
    }



}
