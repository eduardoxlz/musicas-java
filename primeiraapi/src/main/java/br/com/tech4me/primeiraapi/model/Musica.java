package br.com.tech4me.primeiraapi.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("musicas")
public class Musica {

    @Id
    private String id;
    private  String nome;
  private String cantor;
 private String anoLancamento;



 public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}



    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCantor() {
        return cantor;
    }
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }
    public String getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
