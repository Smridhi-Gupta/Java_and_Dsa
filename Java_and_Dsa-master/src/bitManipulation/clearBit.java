package bitManipulation;

public class clearBit {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n,i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearIBits(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    // 2nd method
    public static int clearIBit(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(10,1));
        System.out.println(updateIthBit(10,2,1));
        System.out.println(clearIBits(15,2));
        System.out.println(clearIBit(10,2,4));
    }
}
