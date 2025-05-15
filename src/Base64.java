import java.io.*;
import java.util.Scanner;

public class Base64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            boolean vazhdo = true;

            while (vazhdo) {
                System.out.println("\nZgjidh opsionin:");
                System.out.println("1. Shembuj të gatshëm");
                System.out.println("2. Encode tekst (manual)");
                System.out.println("3. Decode tekst (manual)");
                System.out.println("4. Encode nga file");
                System.out.println("5. Decode nga file");
                System.out.println("0. Dil");

                int zgjedhja = scanner.nextInt();
                scanner.nextLine();

                switch (zgjedhja) {
                    case 1:
                        Base64Examples.shfaqShembuj();
                        break;
                    case 2:
                        System.out.println("Shkruaj tekstin për kodim:");
                        String tekstPerKodim = scanner.nextLine();
                        String eKoduar = Base64Encoder.encode(tekstPerKodim.getBytes());
                        System.out.println("Rezultati i koduar: " + eKoduar);
                        break;
                    case 3:
                        System.out.println("Shkruaj tekstin për dekodim:");
                        String tekstPerDekodim = scanner.nextLine();
                        byte[] eDekoduarBytes = Base64Decoder.decode(tekstPerDekodim);
                        String eDekoduar = new String(eDekoduarBytes);
                        System.out.println("Rezultati i dekoduar: " + eDekoduar);
                        break;
                    case 4:
                        System.out.print("Shkruaj emrin e file-it për të lexuar tekstin: ");
                        String inputFileEncode = scanner.nextLine();
                        String contentEncode = lexoNgaFile(inputFileEncode);
                        String encodedFromFile = Base64Encoder.encode(contentEncode.getBytes());

                        System.out.print("Shkruaj emrin e file-it për të ruajtur tekstin e koduar: ");
                        String outputFileEncode = scanner.nextLine();
                        shkruajNeFile(outputFileEncode, encodedFromFile);
                        System.out.println("Teksti u kodua dhe u ruajt me sukses.");
                        break;
                    case 5:
                        System.out.print("Shkruaj emrin e file-it për të lexuar tekstin e koduar: ");
                        String inputFileDecode = scanner.nextLine();
                        String contentDecode = lexoNgaFile(inputFileDecode);
                        byte[] decodedBytes = Base64Decoder.decode(contentDecode);
                        String decodedText = new String(decodedBytes);

                        System.out.print("Shkruaj emrin e file-it për të ruajtur tekstin e dekoduar: ");
                        String outputFileDecode = scanner.nextLine();
                        shkruajNeFile(outputFileDecode, decodedText);
                        System.out.println("Teksti u dekodua dhe u ruajt me sukses.");
                        break;
                    case 0:
                        vazhdo = false;
                        break;
                    default:
                        System.out.println("Zgjedhje e pavlefshme!");
                }

                if (vazhdo) {
                    System.out.print("\nDëshiron të vazhdosh? (po/jo): ");
                    String pergjigje = scanner.nextLine().trim().toLowerCase();
                    if (!pergjigje.equals("po")) {
                        vazhdo = false;
                    }
                }
            }

            System.out.println("Programi përfundoi.");
        } catch (Exception e) {
            System.out.println("Gabim: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    public static String lexoNgaFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder content = new StringBuilder();
        String rreshti;
        while ((rreshti = reader.readLine()) != null) {
            content.append(rreshti).append("\n");
        }
        reader.close();
        return content.toString().trim();
    }


    public static void shkruajNeFile(String fileName, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.write(content);
        writer.newLine();
        writer.close();
    }


}
