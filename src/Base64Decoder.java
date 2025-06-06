public class Base64Decoder {

    private static final char[] base64Chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    public static byte[] decode(String base64) {
        int[] base64Inv = new int[256];
        for (int i = 0; i < base64Inv.length; i++) base64Inv[i] = -1;
        for (int i = 0; i < base64Chars.length; i++) base64Inv[base64Chars[i]] = i;


        base64 = base64.replace("=", "");
        
        int length = base64.length();
        int outputLength = (length * 6) / 8;
        byte[] output = new byte[outputLength];

        int buffer = 0;
        int bitsLeft = 0;
        int outputIndex = 0;

        for (char c : base64.toCharArray()) {
            if (base64Inv[c] == -1) continue;


            buffer = (buffer << 6) | base64Inv[c];
            bitsLeft += 6;

            if (bitsLeft >= 8) {
                bitsLeft -= 8;
                output[outputIndex++] = (byte) ((buffer >> bitsLeft) & 0xFF);
            }
        }

        return output;
    }


}

