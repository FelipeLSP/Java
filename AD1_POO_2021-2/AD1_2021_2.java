import java.time.*;
public class AD1_2021_2 {
    public static void main(String[] args) {
        Dicionario palavras = new Dicionario();
        palavras.setValor(new Chave("autor"), new Valor("Coord. Disciplina"));
        palavras.setValor(new Chave("alias"), palavras.getValor(new
        Chave("autor")));
        palavras.setValor(new Chave("data-atual"), new Valor(LocalDate.now()));
        palavras.setValor(new Chave("hora-atual"), new Valor(LocalTime.now()));
        palavras.setValor(new Chave("disciplina"), new Valor("POO"));
        LocalDate data_ad1 = LocalDate.of(2021, 8, 16);
        palavras.setValor(new Chave(data_ad1), new Valor("Lancar AD1 na plataforma"));
        palavras.delValor(new Chave("alias"));
        System.out.println(palavras);
        System.out.println(palavras.toJson());
        Dicionario.salvar("teste.txt", palavras.toJson());
    }
}
