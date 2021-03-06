package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Min Byte Value = " + myMinByteValue);
        System.out.println("Max Byte Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Min Short Value = " + myMinShortValue);
        System.out.println("Max Short Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Min Long Value = " + myMinLongValue);
        System.out.println("Max Long Value = " + myMaxLongValue);

        //assumed int and casting
        short bigSHortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        //challenge
        byte myChallengeByte = 125;
        short myChallengeShort = 32_000;
        int myChallengeInt = 100_000;
        long myLongNumber = 50_000L + 10L * (myChallengeByte
                                           + myChallengeShort
                                           + myChallengeInt);
        System.out.println(myLongNumber);
    }
}
