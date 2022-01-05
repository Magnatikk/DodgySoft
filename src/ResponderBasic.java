import java.util.Collection;

public class ResponderBasic implements Responder{
    @Override
    public String generateResponse(Collection<String> reponses) {
       return "Vous savez, tous les logicies ont des bogues. Blablabla";
    }
}
