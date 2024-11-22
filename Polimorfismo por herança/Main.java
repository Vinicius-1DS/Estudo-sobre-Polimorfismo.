//Classe main para testes.
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new papagaio();
        Animal animal2 = new cachorro();
        Animal animal3 = new gato();

        animal1.fazerSom();
        animal2.fazerSom();
        animal3.fazerSom();
    }
}
