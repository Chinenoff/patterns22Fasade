public class BinOps {
    public String sum(String a, String b) {
        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        int intRes = intA + intB;
        return Integer.toBinaryString(intRes);
    }

    public String mult(String a, String b) {
        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        int intRes = intA * intB;
        return Integer.toBinaryString(intRes);
    }
}