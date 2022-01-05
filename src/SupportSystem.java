import java.util.Collection;
import java.util.HashSet;

public class SupportSystem {

    public InputReader input;
    public Responder resp;

    public SupportSystem(InputReader unput, Responder responder) {
        this.input = unput;
        this.resp = responder;
    }

    public void start() {
        printWelcome();
        Collection<String> test = new HashSet<>();
        while(!(test.contains("bye"))) {
            test = input.getInput();
                if (!(test.contains("bye"))) {
                    System.out.println(resp.generateResponse(test));
                }
        }
        printGoodbye();
    }

    public void printWelcome() {
        System.out.println("Bienvenue dans le systeme d'assistance technique DodgySoft");
    }

    public void printGoodbye() {
        System.out.println("Merci pour votre visite. Bye...");
    }

}
