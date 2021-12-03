import java.util.Scanner;

public class PasswortValidieren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pw = sc.nextLine();
        String[] badPW = {"12345678", "abcdefgh", "qwertzui", "asdfghjk", "yxcvbnm,", "´´098765", "+üpoiuzt",
                "#äölkjhg", "-.,mnbvc", "Passwort", "Passwort1234", "11111111", "22222222", "333333333"};
        for (String bpw : badPW) {
            if (bpw.equals(pw)) {
                System.out.println("Schlechtes Passwort!!!");
                break;
            }
        }
            boolean passwordLengthOK = passwordLength(pw);
            boolean containsNumOK = containsNum(pw);
            boolean containsUpperLowerCaseOK = containsUpperLowerCase(pw);
            boolean passwordOK = false;
            if (pw.length() > 0) {
                if (passwordLengthOK && containsNumOK && containsUpperLowerCaseOK) {
                    passwordOK = true;
                    System.out.println("Passwort erfüllt alle Anforderungen!");
                }
            }

        }


    public static boolean containsUpperLowerCase(String password) {
        char[] charArrPassword = password.toCharArray();
        for (char c : charArrPassword) {
            boolean upperCase = false;
            if (Character.isUpperCase(c)) {
                upperCase = true;
            }
            if (upperCase == true) {
                for (char d : charArrPassword) {
                    if (Character.isLowerCase(d)) return true;

                }
            }
        }
        System.out.println("Passwort muss Groß-und Kleinbuchstaben enthalten!");
        return false;

    }

    public static boolean containsNum(String password) {
        char[] pw = password.toCharArray();
        for (char c : pw) {
            if (Character.isDigit(c)) {
                //System.out.println("True");
                return true;
            }
        }
        System.out.println("Passwort muss Zahlen beinhalten!");
        return false;
    }

    public static boolean passwordLength(String password) {
        if (password.length() >= 8 && password.length() < 20) {
            return true;
        } else {
            System.out.println("Passwort darf nur 8 bis 20 Zeichen lang sein");
            return false;
        }
    }
}
