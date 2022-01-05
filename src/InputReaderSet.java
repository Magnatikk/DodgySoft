import java.util.*;

public class InputReaderSet implements InputReader {



    @Override
    public Collection<String> getInput() {

        Set<String> essai = new HashSet<String>();
        Scanner keyboard = new Scanner(System.in);
        String phrase = keyboard.nextLine();
        String trucs[] = phrase.split(" ");

        for (String mot : trucs) {
            essai.add(mot.trim());
        }
        return essai;
    }
}
