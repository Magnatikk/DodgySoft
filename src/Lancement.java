public class Lancement {
    public static void main(String[] args) {

        InputReader inputReader = new InputReaderSet();
        Responder responder = new ResponderBasic();
        SupportSystem supp = new SupportSystem(inputReader, responder);
        supp.start();
    }
}
