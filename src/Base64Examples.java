
public class Base64Examples {
    public static void shfaqShembuj() {
        String shembull = "Pershendetje!";
        String eKoduar = Base64Encoder.encode(shembull.getBytes());
        String eDekoduar = new String(Base64Decoder.decode(eKoduar));

        System.out.println("Teksti origjinal: " + shembull);
        System.out.println("E koduar: " + eKoduar);
        System.out.println("E dekoduar: " + eDekoduar);
    }
}
