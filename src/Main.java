public class Main {
    public static void main(String[] args) {

        IdandPasswords idandPasswords = new IdandPasswords();

        new LoginPage(idandPasswords.getLoginInfo());
    }
}