package latihan.bit;

public class Bit {
	/*
    Nama        : Wildan Muhammad Fikri
    Kelas       : IF1
    NIM         : 10118044
    Deskripsi   : Implementasi operasi bit
     */
	public static void main(String[] args) {
        int a = 60; // 60 = 0011 1100
        int b = 13; // 13 = 000 1101
        int c = 0;

        c = a & b;
        // 12 = 000 1100
        System.out.println("a & b = " + c);

        c = a | b;
        // 61 = 0011 1101
        System.out.println("a | b = " + c);

        c = a ^ b;
        // 49 = 0011 0001
        System.out.println("a ^ b = " + c);

        c = ~a;
        // -61 = 1100 0011
        System.out.println("~a = " + c);

        c = a << 2;
        // 240 = 1111 0000
        System.out.println("a << 2 = " + c);

        c = a >> 2;
        // 15 = 0000 1111
        System.out.println("a >> 2 = " + c);
    }
}
