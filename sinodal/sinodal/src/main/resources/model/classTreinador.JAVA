import jakarta.persistence.*;
import java.util.List;

// Associação: Um Personagem tem um planilha
@Entity

class Jogador {
    @Id @GeneratedValue
    private Long id;
    private String nome;
    private String nacionalidade;
    private String formação preferida;
    private String jogos;
    private int desempenho;
    private String titulos;
    private String times que treinou;
    @OneToOne(cascade = CascadeType.ALL)
    private Time time;
}
