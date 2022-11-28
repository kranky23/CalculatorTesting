public class BinDecOctHex
{
    static String decimalToHex(int num) {

        String str;
        str = new String(Integer.toHexString(num));
        return str;
    }

    static String binaryToHex(int binaryNum) {

        StringBuilder result = new StringBuilder();
        int[] hex = new int[1000];
        int r = 0, c = 0, num, b;
        int i = 1, j = 0, rem, dec = 0;
        num = binaryNum;
        int firstDigit = Integer.parseInt(Integer.toString(num).substring(0, 1));
        if (firstDigit > 0 || firstDigit == 1) {
            while (num > 0) {
                if ((num % 10 == 0) || (num % 10 == 1))
                    c++;
                r++;
                num = num / 10;
            }
        }
        if (c == r) {
            while (binaryNum > 0) {
                rem = binaryNum % 2;
                dec = dec + rem * i;
                i = i * 2;
                binaryNum = binaryNum / 10;
            }
            i = 0;
            while (dec != 0) {
                hex[i] = dec % 16;
                dec = dec / 16;
                i++;
            }
            System.out.print("\tHexaDecimal value: ");

            for (j = i - 1; j >= 0; j--) {
                if (hex[j] > 9) {
                    char ch = (char) (hex[j] + 55);
                    result.append(ch);
                } else {
                    result.append(hex[j]);
                }
            }
        } else {
            return "\tThe Entered Number is not a Binary Number ";
        }
        return result.toString();
    }

    static String octalToHex(String octnum) {

        int decnum;
        String hexnum;
        int no, mod1, mod2, mod3, diff1, diff2, diff3, num1, num2, num3;
        no = Integer.parseInt(octnum);
        mod1 = no % 10;
        mod2 = no % 100;
        mod3 = no % 1000;
        diff1 = no - mod1;
        diff2 = no - mod2;
        diff3 = no - mod3;
        num1 = diff1 / 10;
        num2 = diff2 / 100;
        num3 = diff3 / 1000;
        if (no == 8 || no == 9 || mod1 == 8 || mod1 == 9 || mod2 == 8 || mod2 == 9 || mod3 == 8 || mod3 == 9 || num1 == 8 || num1 == 9 || num2 == 8 || num2 == 9 || num3 == 8 || num3 == 9) {
            return "\tThe Entered Number is not Octal Number ";
        } else {
            decnum = Integer.parseInt(octnum, 8);
            hexnum = Integer.toHexString(decnum);
            System.out.print("\tEquivalent Hexadecimal Value of " + octnum + " is : ");
            return hexnum;
        }

    }

    // Binary to octal
    static int binaryInt(int bin) {
        int n = 0, decimal = 0, octa = -1;
        int t = 0;
        int b = bin;
        if (b >= 0) {
            while (t == 0 || t == 1 && b != 0) {
                t = b % 10;
                b = b / 10;
            }
        }
        if (b == 0) {
            while (true) {
                if (bin == 0) {
                    break;
                } else {
                    int temp = bin % 10;
                    decimal += temp * Math.pow(2, n);
                    bin = bin / 10;
                    n++;
                }
            }
            octa = decimal(decimal);
        }
        return octa;
    }

    //Hexa decimal to Octal
    static int hexadecimalInt(String hexdec_num) {

        int dec_num = 0, k = 1;
        String digits = "0123456789ABCDEF";
        hexdec_num = hexdec_num.toUpperCase();
        int v = hexdec_num.length();
        int tp = 0;
        if (tp >= 0) {
            for (k = 0; k < hexdec_num.length(); k++) {
                char h = hexdec_num.charAt(k);
                if ((h == '0') || (h == '1') || (h == '2') || (h == '3') || (h == '4') || (h == '5') || (h == '6') || (h == '7') || (h == '8') || (h == '9') || (h == 'A') || (h == 'B') || (h == 'C') || (h == 'D') || (h == 'E') || (h == 'F')) {
                    int d = digits.indexOf(h);
                    dec_num = 16 * dec_num + d;
                } else {
                    dec_num = -1;
                    break;
                }
            }
            tp = decimal(dec_num);
        }
        return tp;
    }

    //below are the helper functions for binary,octal number conversions
    static String octal(int oct) {
        int n = 0, decimal = 0, octa = -1;
        int bin = oct;
        int t = 0;
        int b = bin;
        if (b >= 0) {
            while (t < 8 && b > 0) {
                t = b % 10;
                b = b / 10;
            }

            if (t >= 8 || b < 0) {
                return "Error";
            }
        }
        if (b == 0) {
            while (true) {
                if (bin == 0) {
                    break;
                } else {
                    int temp = bin % 10;
                    decimal += temp * Math.pow(8, n);
                    bin = bin / 10;
                    n++;
                }
            }
        } else
            return "Error";
        return decimal + "";
    }

    static String binary(int bin) {
        int n = 0, decimal = 0, octa = -1;
        int t = 0;
        int b = bin;
        if (b >= 0) {
            while (t == 0 || t == 1 && b != 0) {
                t = b % 10;
                b = b / 10;
            }
        }
        if (b == 0) {
            while (true) {
                if (bin == 0) {
                    break;
                } else {
                    int temp = bin % 10;
                    decimal += temp * Math.pow(2, n);
                    bin = bin / 10;
                    n++;
                }
            }
        } else
            return "Error";
        return decimal + "";
    }

    static int decimal(int num) {
        int octalNumber = 0, i = 1;
        while (num != 0) {
            octalNumber += (num % 8) * i;
            num /= 8;
            i *= 10;
        }
        return octalNumber;
    }

    static String hexadecimal(String hexdec_num) {

        int dec_num = 0, k = 1;
        String digits = "0123456789ABCDEF";
        hexdec_num = hexdec_num.toUpperCase();
        for (k = 0; k < hexdec_num.length(); k++) {
            char cr = hexdec_num.charAt(k);
            if (!Character.isDigit(cr) && !(cr == 'A' || cr == 'B' || cr == 'C' || cr == 'D' || cr == 'E' || cr == 'F')) {
                return "Error";
            }
            int d = digits.indexOf(cr);
            dec_num = 16 * dec_num + d;
        }
        return dec_num + "";
    }

    public static StringBuilder decimalToBinary(int i) {

        String number = new String("");
        StringBuilder newNumber = new StringBuilder();
        int x = i;
        while (x > 0) {
            int y = x % 2;
            number = number + Integer.toString(y);
            x = x / 2;
        }
        newNumber.append(number);
        newNumber.reverse();
        return newNumber;
    }

    public static StringBuilder hexadecimalToBinary(String number) {

        StringBuilder newNumber = new StringBuilder();
        char ch;
        int i = number.length();
        for (int x = 0; x < i; x++) {
            ch = number.charAt(x);
            if(ch=='0')
                newNumber.append("0000");
            else if(ch=='1')
                newNumber.append("0001");
            else if(ch=='2')
                newNumber.append("0010");
            else if(ch=='3')
                newNumber.append("0011");
            else if(ch=='4')
                newNumber.append("0100");
            else if(ch=='5')
                newNumber.append("0101");
            else if(ch=='6')
                newNumber.append("0110");
            else if(ch=='7')
                newNumber.append("0111");
            else if(ch=='8')
                newNumber.append("1000");
            else if(ch=='9')
                newNumber.append("1001");
            else if(ch=='A')
                newNumber.append("1010");
            else if(ch=='B')
                newNumber.append("1011");
            else if(ch=='C')
                newNumber.append("1100");
            else if(ch=='D')
                newNumber.append("1101");
            else if(ch=='E')
                newNumber.append("1110");
            else if(ch=='F')
                newNumber.append("1111");
            else
                System.out.println("input error");

//            switch (ch)
//            {
//                case '0':
//                    newNumber.append("0000");
//                    break;
//                case '1':
//                    newNumber.append("0001");
//                    break;
//                case '2':
//                    newNumber.append("0010");
//                    break;
//                case '3':
//                    newNumber.append("0011");
//                    break;
//                case '4':
//                    newNumber.append("0100");
//                    break;
//                case '5':
//                    newNumber.append("0101");
//                    break;
//                case '6':
//                    newNumber.append("0110");
//                    break;
//                case '7':
//                    newNumber.append("0111");
//                    break;
//                case '8':
//                    newNumber.append("1000");
//                    break;
//                case '9':
//                    newNumber.append("1001");
//                    break;
//                case 'A':
//                    newNumber.append("1010");
//                    break;
//                case 'B':
//                    newNumber.append("1011");
//                    break;
//                case 'C':
//                    newNumber.append("1100");
//                    break;
//                case 'D':
//                    newNumber.append("1101");
//                    break;
//                case 'E':
//                    newNumber.append("1110");
//                    break;
//                case 'F':
//                    newNumber.append("1111");
//                    break;
//                default:
//                    System.out.println("Input error");
//            }
        }
        return newNumber;
    }

    public static StringBuilder octalToBinary(String number) {
        char ch;
        StringBuilder newNumber = new StringBuilder();
        int i = number.length();
        for (int x = 0; x < i; x++)
        {
            ch = number.charAt(x);
            if(ch=='0')
                newNumber.append("000");
            else if(ch=='1')
                newNumber.append("001");
            else if(ch=='2')
                newNumber.append("010");
            else if(ch=='3')
                newNumber.append("011");
            else if(ch=='4')
                newNumber.append("100");
            else if(ch=='5')
                newNumber.append("101");
            else if(ch=='6')
                newNumber.append("110");
            else if(ch=='7')
                newNumber.append("111");
            else
                System.out.println("Input error");


//            switch (ch) {
//                case '0':
//                    newNumber.append("000");
//                    break;
//                case '1':
//                    newNumber.append("001");
//                    break;
//                case '2':
//                    newNumber.append("010");
//                    break;
//                case '3':
//                    newNumber.append("011");
//                    break;
//                case '4':
//                    newNumber.append("100");
//                    break;
//                case '5':
//                    newNumber.append("101");
//                    break;
//                case '6':
//                    newNumber.append("110");
//                    break;
//                case '7':
//                    newNumber.append("111");
//                    break;
//                default:
//                    System.out.println("Input error"); }
        }
        return newNumber;
    }


    public static StringBuilder numberSystem(int operation, String number)
    {
        if (operation == 1)
        {
            if (number.isEmpty())
            {
                return new StringBuilder();
            }
            int i = Integer.valueOf(number);
            return decimalToBinary(i);

        }
        else if (operation == 2)
        {
            return hexadecimalToBinary(number);

        }
        else if (operation == 3)
        {
            return octalToBinary(number);
        }
        return new StringBuilder("Wrong Input!");
    }
}
