import java.nio.file.*;
import java.io.IOException;
public class Salvavel {
    public static void salvar(String nomeArquivo, String conteudo) {
        Path file = Paths.get(nomeArquivo);
        try {
            Files.write(file, conteudo.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Problemas na escrita do arquivo!");
            e.printStackTrace();
        }
    }
}
