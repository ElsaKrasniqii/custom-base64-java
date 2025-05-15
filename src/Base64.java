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


                        break;
                    case 4:


                        break;
                    case 5:


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
}
