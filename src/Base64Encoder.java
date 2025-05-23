
public class Base64Encoder {

    private static final char[] BASE64_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    public static String encode(byte[] input) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < input.length) {
            int remaining = input.length - i;

            int b = (input[i++] & 0xFF) << 16;

            if (remaining > 1) b |= (input[i++] & 0xFF) << 8;
            if (remaining > 2) b |= (input[i++] & 0xFF);

            result.append(BASE64_CHARS[(b >> 18) & 0x3F]);
            result.append(BASE64_CHARS[(b >> 12) & 0x3F]);
            result.append(remaining > 1 ? BASE64_CHARS[(b >> 6) & 0x3F] : '?');
            result.append(remaining > 2 ? BASE64_CHARS[b & 0x3F] : '?');
        }

        return result.toString();
    }

}
