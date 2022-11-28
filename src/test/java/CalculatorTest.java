
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Arithmetic calculator = new Arithmetic();

    @Test
    public void facalculatorrialTruePositive(){
        assertEquals(120,calculator.fact(5));
        assertEquals(24,calculator.fact(4));
    }

    @Test
    public void facalculatorrialFalsePositive(){
        assertNotEquals(120,calculator.fact(7));
        assertNotEquals( 24, calculator.fact(3), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals(8,calculator.power(2,3));
        assertEquals(64,calculator.power(4,3));
    }


    @Test
    public void powerFalsePositive(){
        assertNotEquals( 6, calculator.power(2, 2), DELTA);
        assertNotEquals( -7.3, calculator.power(2, 3), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals( 0, calculator.naturalLog(1), DELTA);
        assertEquals(0, calculator.naturalLog(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals( 6, calculator.naturalLog(2.4), DELTA);
        assertNotEquals( 7.3, calculator.naturalLog(2.1), DELTA);
    }

    @Test
    public void sqrootTruePositive(){
        assertEquals( 2, calculator.sqroot(4), DELTA);
        assertEquals( 1, calculator.sqroot(1), DELTA);
    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals( 1, calculator.sqroot(3), DELTA);
        assertNotEquals( 0, calculator.sqroot(4), DELTA);

    }

    @Test
    public void addTruePositive(){
        assertEquals( 6, calculator.add(4,2), DELTA);
        assertEquals(10, calculator.add(8,2), DELTA);
    }

    @Test
    public void addFalsePositive(){
        assertNotEquals( 60, calculator.add(46,2), DELTA);
        assertNotEquals( 100, calculator.add(82,2), DELTA);
    }

    @Test
    public void subTruePositive(){
        assertEquals( 38, calculator.sub(40,2), DELTA);
        assertEquals( 66, calculator.sub(86,20), DELTA);
    }

    @Test
    public void subFalsePositive(){
        assertNotEquals( 3, calculator.sub(40,20), DELTA);
        assertNotEquals(6, calculator.sub(8,20), DELTA);
    }

    @Test
    public void mulTruePositive(){
        assertEquals( 84, calculator.mul(4,21), DELTA);
        assertEquals( 1720, calculator.mul(86,20), DELTA);
    }

    @Test
    public void mulFalsePositive(){
        assertNotEquals( 84, calculator.mul(40,21), DELTA);
        assertNotEquals( 66, calculator.mul(86,2), DELTA);
    }

    @Test
    public void divTruePositive(){
        assertEquals( 40, calculator.div(80,2), DELTA);
        assertEquals( 66, calculator.div(132,2), DELTA);
//        assertEquals( 66, calculator.div(13,0), DELTA);
    }

    @Test
    public void divFalsePositive() {
        assertNotEquals(400, calculator.div(80, 2), DELTA);
        assertNotEquals(660, calculator.div(132, 2), DELTA);
    }

    @Test
    public void squarePositive()
    {
        assertEquals(64, Arithmetic.square(8));
        assertEquals(25, Arithmetic.square(5));
        assertEquals(400, Arithmetic.square(20));
    }

    @Test
    public void squareNegative()
    {
        assertNotEquals(40, Arithmetic.square(2));
        assertNotEquals(420, Arithmetic.square(120));
        assertNotEquals(250, Arithmetic.square(230));
    }

    @Test
    public void cubePositive()
    {
        assertEquals(64, Arithmetic.cube(4));
        assertEquals(125, Arithmetic.cube(5));
        assertEquals(729, Arithmetic.cube(9));
    }

    @Test
    public void cubeNegative()
    {
        assertNotEquals(640, Arithmetic.cube(4));
        assertNotEquals(1250, Arithmetic.cube(5));
        assertNotEquals(7290, Arithmetic.cube(9));
    }

    @Test
    public void cubeRootPositive()
    {
        assertEquals(6, Arithmetic.cuberoot(216));
        assertEquals(7, Arithmetic.cuberoot(343));
        assertEquals(3, Arithmetic.cuberoot(27));
    }

    @Test
    public void cubeRootNegative()
    {
        assertNotEquals(60, Arithmetic.cuberoot(216));
        assertNotEquals(70, Arithmetic.cuberoot(343));
        assertNotEquals(30, Arithmetic.cuberoot(27));
    }



//    Arithmetic ops test end here

//    Temperature ops test start here
    @Test
    public void convertTemperature()
    {
        assertEquals("56.0", Temperature.convertTemperature("K","K", 56));
        assertEquals("-217.14999999999998", Temperature.convertTemperature("C","K", 56));
        assertEquals("329.15", Temperature.convertTemperature("K","C", 56));
        assertEquals("132.8", Temperature.convertTemperature("F","C", 56));
        assertEquals("-358.86999999999995", Temperature.convertTemperature("F","K", 56));
        assertEquals("13.333333333333334", Temperature.convertTemperature("C","F", 56));
        assertEquals("286.8333333333333", Temperature.convertTemperature("K","F", 56));
        assertEquals("Math toUnit is not valid", Temperature.convertTemperature("T","F", 56));
    }

//    Temperature ops test end here

//    Matrix ops start here
    @Test
    void matAdd()
    {
        int[][] expresponse =new int[][]{{5,6},{7,6}};
        int[][] response = MatrixOps.matrixAdd(new int[][]{{2,3},{4,2}}, new int[][]{{3,3},{3,4}});
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

    @Test
    void matAddNull()
    {
        int[][] response = MatrixOps.matrixAdd(new int[0][0], new int[0][0]);
        assertEquals(0,response.length,"testing");
    }

    @Test
    void matAddOnce()
    {
        int[][] expresponse =new int[][]{{2}};
        int[][] response = MatrixOps.matrixAdd(new int[][]{{1}}, new int[][]{{1}});
        for (int i = 0; i < 1; i++)
        {
            for (int j = 0; j < 1; j++)
            {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

    @Test
    void matSub() {
        int[][] expresponse =new int[][]{{5,6},{7,6}};
        int[][] response = MatrixOps.matrixAdd(new int[][]{{10,8},{12,12}}, new int[][]{{5,2},{5,6}});
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                assertNotEquals(response[i][j], expresponse[i][j]);
            }
        }
    }

    @Test
    void matSubtractNull()
    {
        int[][] response = MatrixOps.matrixSubtract(new int[0][0], new int[0][0]);
        assertNotEquals(1,response.length);
    }

    @Test
    void matSubtractOnce()
    {
        int[][] expresponse =new int[][]{{2}};
        int[][] response = MatrixOps.matrixSubtract(new int[][]{{1}}, new int[][]{{1}});
        for (int i = 0; i < 1; i++)
        {
            for (int j = 0; j < 1; j++)
            {
                assertNotEquals(response[i][j],expresponse[i][j]);
            }
        }
    }

    @Test
    void multiply() {
        int[][] expresponse =new int[][]{{4,4},{10,8}};
        int[][] response = MatrixOps.matMul(new int[][]{{1,2},{3,4}}, new int[][]{{2,0},{1,2}});
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

    @Test
    void multiplyZero() {
        int[][] response = MatrixOps.matMul(new int[0][0], new int[0][0]);
        assertEquals(0,response.length,"testing");
    }

    @Test
    void multiplyOnce() {
        int[][] expresponse =new int[][]{{1}};
        int[][] response = MatrixOps.matMul(new int[][]{{1}}, new int[][]{{1}});
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

    @Test
    void powerZeroMatrix(){
        int[][] expresponse =new int[][]{{1,0},{0,1}};
        int[][] response = MatrixOps.powMat(new int[][]{{5,6},{7,6}}, 0);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

    @Test
    void powerOneMatrix(){
        int[][] expresponse =new int[][]{{5,6},{7,6}};
        int[][] response = MatrixOps.powMat(new int[][]{{5,6},{7,6}}, 1);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

    @Test
    void powerTwoMatrix(){
        int[][] expresponse =new int[][]{{67,66},{77,78}};
        int[][] response = MatrixOps.powMat(new int[][]{{5,6},{7,6}}, 2);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

    @Test
    void powerThreeMatrix(){
        int[][] expresponse =new int[][]{{20,14},{28,20}};
        int[][] response = MatrixOps.powMat(new int[][]{{2,1},{2,2}}, 3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

    @Test
    void identityMatrix(){
        int[][] expresponse =new int[][]{{1,0},{0,1}};
        int[][] response = MatrixOps.identity(2);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(response[i][j],expresponse[i][j],"testing");
            }
        }
    }

    //matrix ops tests end here

    //number system ops tests start here
    @Test
    void menuTest() {

        assertEquals("10", BinDecOctHex.numberSystem(1, "2").toString());
        assertEquals("101010110001001000110000", BinDecOctHex.numberSystem(2, "AB1230").toString());
        assertEquals("001010011000", BinDecOctHex.numberSystem(3, "1230").toString());
        assertEquals("Wrong Input!", BinDecOctHex.numberSystem(4, "").toString());
    }

    @Test
    void convertDecimalToBinary() {
        assertEquals("10", BinDecOctHex.decimalToBinary(2).toString());
        assertEquals("10101", BinDecOctHex.decimalToBinary(21).toString());
        assertEquals("", BinDecOctHex.decimalToBinary(-1).toString());
        assertNotEquals("10101", BinDecOctHex.decimalToBinary(2).toString());
    }

    @Test
    void convertHexadecimalToBinary() {
        assertEquals("101010110001001000110000", BinDecOctHex.hexadecimalToBinary("AB1230").toString());
        assertEquals("11001101010001010110", BinDecOctHex.hexadecimalToBinary("CD456").toString());
        assertEquals("11100111100010011111", BinDecOctHex.hexadecimalToBinary("E789F").toString());
        assertEquals("", BinDecOctHex.hexadecimalToBinary("").toString());
        assertEquals("", BinDecOctHex.octalToBinary("Y").toString());
    }

    @Test
    void convertOctalToBinary() {
        assertNotEquals("1010011000", BinDecOctHex.octalToBinary("1230").toString());
        assertEquals("100101110111", BinDecOctHex.octalToBinary("4567").toString());
        assertEquals("001010011000", BinDecOctHex.octalToBinary("1230").toString());
        assertEquals("", BinDecOctHex.octalToBinary("").toString());
        assertEquals("", BinDecOctHex.octalToBinary("9").toString());
    }

    @Test
    void octal() {
        assertEquals("57", BinDecOctHex.octal(71));
        assertEquals("0", BinDecOctHex.octal(0));
        assertEquals("Error", BinDecOctHex.octal(8));
        assertEquals("Error", BinDecOctHex.octal(91));
        assertEquals("Error", BinDecOctHex.octal(-1));
    }

    @Test
    void binaryToDecimal() {
        assertEquals("2", BinDecOctHex.binary(2));
        assertEquals("21", BinDecOctHex.binary(10101));
        assertEquals("16", BinDecOctHex.binary(10000));
        assertEquals("Error", BinDecOctHex.binary(-1));
    }

    @Test
    void hexadecimalToBinary() {
        assertEquals("2", BinDecOctHex.hexadecimal("2"));
        assertEquals("15", BinDecOctHex.hexadecimal("F"));
        assertEquals("0", BinDecOctHex.hexadecimal(""));
        assertEquals("Error", BinDecOctHex.hexadecimal("-1"));
    }

    @Test
    void decimalToHex() {
        assertEquals("f", BinDecOctHex.decimalToHex(15));
        assertEquals("64", BinDecOctHex.decimalToHex(100));
        assertNotEquals("0", BinDecOctHex.decimalToHex(1));
    }

    @Test
    void binaryToHex() {
        assertEquals("F", BinDecOctHex.binaryToHex(1111));
        assertEquals("40", BinDecOctHex.binaryToHex(1000000));
        assertNotEquals("0", BinDecOctHex.binaryToHex(1));
        assertEquals("\tThe Entered Number is not a Binary Number ",
                BinDecOctHex.binaryToHex(152));
    }

    @Test
    void octalToHex() {
        assertEquals("\tThe Entered Number is not Octal Number ", BinDecOctHex.octalToHex("8"));
        assertEquals("26", BinDecOctHex.octalToHex("46"));
        assertNotEquals("0", BinDecOctHex.octalToHex("1"));
    }

    @Test
    void binary() {

        assertEquals(17, BinDecOctHex.binaryInt(1111));
        assertEquals(-1, BinDecOctHex.binaryInt(-2));
        assertEquals(3, BinDecOctHex.binaryInt(11));
        assertEquals(1,BinDecOctHex.binaryInt(1));
    }

    @Test
    void decimal() {

        assertEquals(17, BinDecOctHex.decimal(15));
        assertEquals(-144, BinDecOctHex.decimal(-100));
        assertEquals(1, BinDecOctHex.decimal(1));
        assertEquals(0, BinDecOctHex.decimal(0));

    }

    @Test
    void hexadecimal() {

        assertEquals(21, BinDecOctHex.hexadecimalInt("11"));
        assertEquals(-1, BinDecOctHex.hexadecimalInt("-100"));
        assertEquals(1, BinDecOctHex.hexadecimalInt("1"));
    }


    //number system ops tests end here

    //prefix,infix,postfix ops tests start here

    @Test
    void preToInfix()
    {
        assertEquals("((a+(b-c))*((d-e)/((f-g)+h)))",Fixes.preToInfix("*+a-bc/-de+-fgh"));
        assertEquals("((A-(B/C))*((A/K)-L))",Fixes.preToInfix("*-A/BC-/AKL"));
        assertEquals("(A+B)",Fixes.preToInfix("+AB"));
        assertEquals("(((A+B)+C)+D)",Fixes.preToInfix("+++ABCD"));
        assertEquals("((A*B)+(C*D))",Fixes.preToInfix("+*AB*CD"));

    }

    @Test
    void inToPre()
    {
        assertEquals("++x/*yzwu",Fixes.infixToPrefix("x+y*z/w+u".toCharArray()));
        assertEquals("++x/*yzwu",Fixes.infixToPrefix("x+y*z/w+u".toCharArray()));
        assertEquals("++x/*yzwu",Fixes.infixToPrefix("x+y*z/w+u".toCharArray()));
        assertEquals("++x/*yzwu",Fixes.infixToPrefix("x+y*z/w+u".toCharArray()));
        assertEquals("++x/*yzwu",Fixes.infixToPrefix("x+y*z/w+u".toCharArray()));
    }

    @Test
    void postToInfix()
    {
        assertEquals("((a*b)+c)",Fixes.postToInfix("ab*c+"));
        assertEquals("((A+(B*C))+D)",Fixes.postToInfix("ABC*+D+"));
        assertEquals("((A+B)*(C+D))",Fixes.postToInfix("AB+CD+*"));
        assertEquals("((A*B)+(C*D))",Fixes.postToInfix("AB*CD*+"));
        assertEquals("(((A+B)+C)+D)",Fixes.postToInfix("AB+C+D+"));

    }

    @Test
    void inToPostfix()
    {
        assertEquals("abcd^e-fgh*+^*+i-", Fixes.infixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));
        assertEquals("ABC*+D+",Fixes.infixToPostfix("A+B*C+D"));
//        assertEquals(" AB+CDE/*-F+",Arithmetic.infixToPostfix("(A+B)–C*(D/E))+F"));
        assertEquals("AB*CD*+",Fixes.infixToPostfix("A*B+C*D"));
        assertEquals("AB+C+D+",Fixes.infixToPostfix("A+B+C+D"));
    }

    @Test
    void preToPost()
    {
        assertEquals("ABC/-AK/L-*",Fixes.preToPost("*-A/BC-/AKL"));
        assertEquals("ABC*+D+",Fixes.preToPost("++A*BCD"));
        assertEquals("AB+CD+*",Fixes.preToPost("*+AB+CD"));
        assertEquals("AB*CD*+",Fixes.preToPost("+*AB*CD"));
        assertEquals("AB+C+D+",Fixes.preToPost("+++ABCD"));
    }

    @Test
    void postToPre()
    {
        assertEquals("*-A/BC-/AKL",Fixes.postToPre("ABC/-AK/L-*"));
        assertEquals("++A*BCD",Fixes.postToPre("ABC*+D+"));
        assertEquals("*+AB+CD",Fixes.postToPre("AB+CD+*"));
        assertEquals("+*AB*CD",Fixes.postToPre("AB*CD*+"));
        assertEquals("+++ABCD",Fixes.postToPre("AB+C+D+"));
    }

    //prefix,infix,postfix ops end here.

    //simple, compound interests ops start here

    @Test
    void findSI()
    {
        assertEquals(2500.0,calculator.simpleInterest(10000,5,5));
        assertEquals(1250.0,calculator.simpleInterest(2500,5,10));
        assertEquals(5000.0,calculator.simpleInterest(10000,10,5));
        assertEquals(20.0,calculator.simpleInterest(100,5,4));
        assertEquals(80.0,calculator.simpleInterest(200,10,4));
    }

    @Test
    void findCI()
    {
//        assertEquals(2646,calculator.compoundInterest(12600,10,2));
//        assertEquals(2100.0,calculator.compoundInterest(10000,10,2));
//        assertEquals(440,calculator.compoundInterest(1000,20,2));
//        assertEquals(6620,calculator.compoundInterest(20000,10,3));
//        assertEquals(51,calculator.compoundInterest(625,4,2));
    }
    //simple, compound interests ops end here

    //permutation and combination ops start here

    @Test
    void permutationTest()
    {
        assertEquals(210,PandC.permutation(7,3));
        assertEquals(1680,PandC.permutation(8,4));
    }

    @Test
    void combinationTest()
    {
//        PandC pandC;
        assertEquals(35, PandC.combination(7,3));
        assertEquals(70, PandC.combination(8,4));
    }

    //permutation and combination ops end here

    //trigonometric ops start here

    @Test
    void sin()
    {
        assertEquals(0.49999999999999994,Trigonometry.sin(30));
    }

    @Test
    void cos()
    {
        assertEquals(0.5000000000000001,Trigonometry.cos(60));
    }

    @Test
    void tan()
    {
        assertEquals(0.9999999999999999,Trigonometry.tan(45));
    }



}
