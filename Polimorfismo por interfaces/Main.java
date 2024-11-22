//Classe main para testes.
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void reproduzirSons(List<FazSom> emissoresDeSom) {
        for (FazSom emissor : emissoresDeSom) {
            emissor.emitirSom();
        }
    }

    public static void main(String[] args) {
        List<FazSom> emissoresDeSom = new ArrayList<>();
        emissoresDeSom.add(new Papagaio());
        emissoresDeSom.add(new Cachorro());
        emissoresDeSom.add(new Gato());
        emissoresDeSom.add(new Alarme());

        reproduzirSons(emissoresDeSom);
    }
}
