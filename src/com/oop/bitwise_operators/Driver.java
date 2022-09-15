package com.oop.bitwise_operators;

public class Driver {

	public static void main(String[] args) {
		
        // Bitwise Operators. there are 6 Bitwise Operators 

        int a = 10, b = 20;

        System.out.println(~a); // (Complement(~) tilde) 00001010 => 11110101 (1's complement) => (-128 + 64 + 32 + 16 + 0 + 0 + 2 + 1) => -11 (first bit 1 that's why - for it.)

        System.out.println(a & b); // (Bitwise And) 00001010 & 00010100 => 00000000 => 0

        System.out.println(a | b); // (Bitwise Or) 00001010 | 00010100 => 00011110 => 30

        System.out.println(a ^ b); // (Bitwise Xor) 00001010 ^ 00010100 => 00011110 => 30

        System.out.println(a << 2); // (Left Shift - gain bit) 00001010.0000 => 0000101000.00 => 40

        System.out.println(a >> 2); // (Right shift - loss bit) 00001010.0000 => 000010.100000 => 2
	}

}
