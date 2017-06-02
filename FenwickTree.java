/**
 * Created by ericcalasans on 02/06/17.
 */
public class FenwickTree {
    private int value;
    private int leftSize;
    private FenwickTree left;
    private FenwickTree right;

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

    public FenwickTree(int value){
        this.value = value;
        this.leftSize = 0;
        this.left = null;
        this.right = null;
    }




}
