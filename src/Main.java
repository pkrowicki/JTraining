/************************
 * This is my Java playground where I test and learn various things.
 * It's not supposed to be clear, readable, etc.
 *
 * This file contains my "notes" from Udemy Java tutorial
 *
 *
 * Animals.java, Dog.java - inheritance
 * VipCustomers.java, BAcc.java, Car.java - classes and constructors
 *
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
    private static boolean L4Of2EvenNumber(int liczba){
        if((liczba %2)==0){
            return true;
        }
        else{
            return false;
        }
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
        boolean even = L4Of2EvenNumber(12);
        System.out.println("Is 12 an even number?: " + even);
        even = L4Of2EvenNumber(11);
        System.out.println("Is 11 an even number?: " + even);

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

    private static void L6Switch(String pick){
        switch(pick.toLowerCase()){
            case "one":
                System.out.println("First string!");
                break;
            case "two":
                System.out.println("Second string!");
                break;
            case "three":
                System.out.println("Third string!");
                break;
            default:
                System.out.println("Empty or invalid string! :(");
                break;
        }
    }

    private static void L7FastAboutLoops(){
//        FOR loop
        for(int x=0; x<3; x++){
            System.out.println("FOR loop number:" + x);
        }
//        WHILE loop
        int y=0;
        boolean whileCheck = true;
        while(whileCheck){
            y++;
            if(y>3){
                whileCheck=false;
                System.out.println("WHILE loop completed, bool is " + whileCheck);
            }
        }
//        DO-WHILE loop
        do{
            System.out.println("DO-WHILE loop executed once even when \"while\" statement is not fulfilled");
        }while(y!=4);
    }

    private static void L8Classes(){

        Car audi = new Car();
        Car ford = new Car();
        System.out.println("Model of car before setting is " + audi.getModel());
        audi.setModel("a7");
        System.out.println("Model of car is " + audi.getModel());
        audi.setModel("a5");
        System.out.println("Model of car after failing validation: " +audi.getModel());

    }

    private static void L9FunWithClasses(){

//      ****  Without using constructors:

        BAcc customer1 = new BAcc();

//      **** Quick check for default values:

        customer1.getCstMail();
        customer1.getCstName();

//      **** Setting values

        customer1.setAccNmbr(0001);
        customer1.setBalance(100.00);
        customer1.setCstName("Andrew","Slowinski");
        customer1.setCstMail("aslowinski@site.pl");
        customer1.setCstNumber(505505505);

//      **** Checking info:

        System.out.println("\n********************\n");
        System.out.println("Customer name is: " + customer1.getCstName());
        System.out.println("Customer account number is: " + customer1.getAccNmbr());
        System.out.println("Customer e-mail is: " + customer1.getCstMail());
        System.out.println("Customer phone number is: " + customer1.getCstNumber());
        System.out.println("Customer account balance is: " + customer1.getBalance());
        customer1.depoFounds(100.50);
        customer1.withFounds(300);
        System.out.println("Customer account balance is: " + customer1.getBalance());
        customer1.withFounds(150.00);

//      **** With constructor:

        BAcc customer2 = new BAcc(1002, 0.00, "Bob", "Yammet", "bobsky@bob.net", 777666555);

//      **** Checking info:

        System.out.println("\n********************\n");
        System.out.println("Customer name is: " + customer2.getCstName());
        System.out.println("Customer account number is: " + customer2.getAccNmbr());
        System.out.println("Customer e-mail is: " + customer2.getCstMail());
        System.out.println("Customer phone number is: " + customer2.getCstNumber());
        System.out.println("Customer account balance is: " + customer2.getBalance());
        customer2.depoFounds(20.60);
        customer2.withFounds(30);
        System.out.println("Customer account balance is: " + customer2.getBalance());
        customer2.withFounds(10.00);

        BAcc customer3 = new BAcc("Timotty", "Lewinsky", "tl@timtom.so", 606707444);

        System.out.println("\n********************\n");
        System.out.println("Customer name is: " + customer3.getCstName());
        System.out.println("Customer account number is: " + customer3.getAccNmbr());
        System.out.println("Customer e-mail is: " + customer3.getCstMail());
        System.out.println("Customer phone number is: " + customer3.getCstNumber());
        System.out.println("Customer account balance is: " + customer3.getBalance());


    }

    private static void L10PolishingConstructors(){

        VipCustomers andrewT = new VipCustomers("Andrew Tonks", 1000.00, "at@drew.net");
        System.out.println("\nFirst VIP customer: " + andrewT.getcName() + "\nCredit Limit: " + andrewT.getcCreditLimit() + "\nE-mail: " + andrewT.getcEmail());
        System.out.println("\n********* Next customer **********\n");
        VipCustomers bobR = new VipCustomers("Bob Robs", 990d);
        System.out.println("First VIP customer: " + bobR.getcName() + "\nCredit Limit: " + bobR.getcCreditLimit() + "\nE-mail: " + bobR.getcEmail());
        System.out.println("\n********* Next customer **********\n");
        VipCustomers vickyV = new VipCustomers();
        System.out.println("First VIP customer: " + vickyV.getcName() + "\nCredit Limit: " + vickyV.getcCreditLimit() + "\nE-mail: " + vickyV.getcEmail());



    }

    private static void L11Inheritance(){

        Animals animal1 = new Animals("Animal 1", 1,1,54,12);
        Dog dog1 = new Dog("Husky", 30, 12, 2,4,1,20,"short snowy");
        dog1.eat();
        dog1.walk();
        dog1.run();

    }



    public static void main(String[] args) {

//        L3PrimitiveDT();
//        L4Operators();
////        L5 bracket
//        System.out.println(L5MethodsExmpleAndOverloading(true,1232, 3, 200));
//        boolean gameEndVarBool = true;
//        int levelNmbr, bonus, highscore = 1398;
//        int finalscore = L5MethodsExmpleAndOverloading(gameEndVarBool, highscore, levelNmbr=5,bonus=450);
//        System.out.println(finalscore);
////        Overloading method:
//        finalscore=L5MethodsExampleAndOverloading(200);
//        System.out.println(finalscore);
////        End of L5 bracket
//        L6Switch("TWo");
//        L7FastAboutLoops();
//        L8Classes();
//        L9FunWithClasses();  // And constructors. Mostly with constructors.
//        L10PolishingConstructors();
        L11Inheritance();

    }
}
