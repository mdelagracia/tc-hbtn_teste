import java.util.regex.*;

public class Person {
    public boolean checkUser(String nomeUser){


        Pattern pattern = Pattern.compile("[a-zA-Z0-9]{8,}");
        Matcher matcher = pattern.matcher(nomeUser);

        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }
    public boolean checkPassword(String password) {

        Pattern pattern = Pattern.compile("(?=.*[}{@#$%,.^?~=+\\-_\\/*\\-+.\\|])(?=.*[a-zA-Z])(?=.*[0-9]).{8,}");
        Matcher matcher = pattern.matcher(password);

        boolean result = matcher.matches();
        System.out.println(result);
        return result;

    }
}