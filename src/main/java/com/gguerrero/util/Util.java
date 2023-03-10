package com.gguerrero.util;


public class Util {

    public static int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static boolean getBoolean(){
        int n = getRandom(0,1);
        return n != 0;
    }

    public static boolean getBooleanProb(int prob) {
        int n = getRandom(0, 100);
        return n < prob;
    }

    public static int getIntProb(int prob) {
        return getBooleanProb(prob) ? 1 : 0;
    }
}
