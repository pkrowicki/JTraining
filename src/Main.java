/************************
 * This is my Java playground where I test and learn various things.
 * It's not supposed to be clear, readable, etc.
 *
 * This file contains my "notes" from Udemy Java tutorial
 *
 ************************/




public class Main {

    private static void L3PrimitiveDT() {
        byte var1 = Byte.MAX_VALUE;
        short var2 = Short.MAX_VALUE;
        int var3 = Integer.MAX_VALUE;
        long var4 = Long.MAX_VALUE;
        float var5 = Float.MAX_VALUE;
        double var6 = Double.MAX_VALUE;
        char var7 = '\u00a9'; // 2 bytes
        boolean var8 = false;
        String var9 = "Max values of Java Primitives";
        var9 = var9+",\nand this sentence is 9th, called String.\n\n";

        System.out.println(var9 +"Byte: " + var1 + "\nShort: " + var2 + "\nInteger: " + var3 + "\nLong: " + var4 + "\nFloat: " + var5 + "\nDouble: " + var6 + "\nChar: " + var7 +"\nBoolean: " + var8);
    }

    public static void main(String[] args) {

        L3PrimitiveDT();
    }
}
