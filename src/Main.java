public class Main {

    public static void main(String[] args) {
        System.out.println(countPairs("axaxa"));
        System.out.println(endX("xxxhii"));
        System.out.println(parenBit("idhjonf(ouachita)uonw"));
        System.out.println(recursiveParseInt("0e0e"));
    }

    public static int countPairs(String str) {
        int pairs;
        if (str.length() < 3) {
            pairs = 0;
        } else {
            pairs = ((str.charAt(0) == str.charAt(2)) ? 1 : 0) + countPairs(str.substring(1));
        }
        return pairs;
    }

    public static String endX(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return endX(str.substring(1)) + 'x';
        }
        return str.charAt(0) + endX(str.substring(1));
    }

    public static String parenBit(String str) {
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return str;
        }
        if (str.charAt(0) == '(') {
            return parenBit(str.substring(0, str.length() - 1));
        }
        if (str.charAt(str.length() - 1) == ')') {
            return parenBit(str.substring(1));
        }
        return parenBit(str.substring(1, str.length() - 1));
    }

    public static int recursiveParseInt(String str) {
        if(str.length() == 0)
        {
            return 0;
        }
        //char cc = str.charAt(0);
        String ros = str.substring(1);

        int factor = 1;
        for(int i = 0; i < str.length() - 1; i++) {
            factor *= 10;
        }
        factor = factor * (str.charAt(0) - '0');
        return factor + recursiveParseInt(ros);

    }
}
