import jakarta.persistence.*;
import java.util.List;

// Associação: Um Personagem tem um planilha
@Entity

class Jogador {
    @Id @GeneratedValue
    private Long id;
    private String nome;
    private String posicao;
    private int idade;
    private String altura;
    private int peso;
    private String nacionalidade;
    @OneToOne(cascade = CascadeType.ALL)
    private Time time;
}
