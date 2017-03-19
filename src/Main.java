/************************
 * This is my Java playground where I test and learn various things.
 * It's not supposed to be clear, readable, etc.
 *
 * This file contains my "notes" from Udemy Java tutorial
 *
 ************************/




public class Main {

    private static void L3PrimitiveDT() {
        byte var1 = Byte.MAX_VALUE;  // var1 = Byte.MAX_VALUE is an expression, whole statement is... statement.
        short var2 = Short.MAX_VALUE;
        int var3 = Integer.MAX_VALUE;
        long var4 = Long.MAX_VALUE;
        float var5 = Float.MAX_VALUE;
        double var6 = Double.MAX_VALUE;
        char var7 = '\u00a9'; // 2 bytes
        boolean var8 = false;
        String var9 = "Max values of Java Primitives";
        var9 = var9+",\nand this sentence is 9th (not PDT, but...), called String.\n\n";

        System.out.println(var9 +"Byte: " + var1 + "\nShort: " + var2 + "\nInteger: " + var3 + "\nLong: " + var4 + "\nFloat: " + var5 + "\nDouble: " + var6 + "\nChar: " + var7 +"\nBoolean: " + var8);
    }

    private static void L4Of1(int liczba){
        System.out.println(liczba);
    }

    private static void L4Operators() {

        int result = 5;
        L4Of1(result+=27);
        L4Of1(result*=6);
        L4Of1(result-=11);
        L4Of1(result/=3);
        L4Of1(--result);
        L4Of1(++result);
        boolean isToF = true;
        String trojoperator = isToF ? "Wartosc to true" : "Wartosc to false";
        System.out.println(trojoperator);

    }

    private static int L5MethodsExmpleAndOverloading(boolean isGameOver, int score, int levelNumber, int bonusPnts){
        if (isGameOver){
            return score+(levelNumber*bonusPnts);
        }
        else{
            return 0;
        }
    }
    private static int L5MethodsExampleAndOverloading(int powerScore){
        return powerScore*10;
    }

    public static void main(String[] args) {

        L3PrimitiveDT();
        L4Operators();
        //L5 bracket
        System.out.println(L5MethodsExmpleAndOverloading(true,1232, 3, 200));
        boolean gameEndVarBool = true;
        int levelNmbr, bonus, highscore = 1398;
        int finalscore = L5MethodsExmpleAndOverloading(gameEndVarBool, highscore, levelNmbr=5,bonus=450);
        System.out.println(finalscore);
        //Overloading method:
        finalscore=L5MethodsExampleAndOverloading(200);
        System.out.println(finalscore);
        //End of L5 bracket
    }
}
