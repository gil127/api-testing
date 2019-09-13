package com.kaltura.utils;

import java.util.Random;

public class RandomData {

    private static final Random random = new Random();
    private static final char[] LOWER_EN_SYMBOLS;
    private static final char[] DIGITS;
    private static char[] goodChars = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'M', 'N', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    private RandomData() {}

    static {
        StringBuilder tmp = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            tmp.append(ch);
        }
        LOWER_EN_SYMBOLS = tmp.toString().toCharArray();
        DIGITS = "0123456789".toCharArray();
    }

    public static String getString(int length, char[] symbols) {
        if (length < 1) {
            throw new IllegalArgumentException("Can't generate string with length < 1: " + length);
        }
        char[] buf = new char[length];
        for (int i = 0; i < buf.length; ++i) {
            char d = symbols[random.nextInt(symbols.length)];
            if (i == 0 && (d == '0' || d == '1')) {
                d = symbols[getInt(2, 9)];
            }
            buf[i] = d;
        }
        return new String(buf);
    }

    public static String getString(int length) {
        return getString(length, LOWER_EN_SYMBOLS);
    }

    public static int getInt(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }
}
