package urlValidator;

public class Main {
    public static void main(String[]args){
        System.out.println(UrlValidator.validateUrl("http://www.onet.pl"));
        System.out.println(UrlValidator.validateUrl("https://mail.google.com"));
        System.out.println(UrlValidator.validateUrl("http://wiadmosci.onet.pl"));
        System.out.println(UrlValidator.validateUrl("wp.pl"));
        System.out.println(UrlValidator.validateUrl("http://wiadmosci"));
    }
}
