import jakarta.persistence.*;
import java.util.List;

// Associação: Um Personagem tem um planilha
@Entity

class Clube {
    @Id @GeneratedValue
    private Long id;
    private String nome;
    private int ano de inauguração;
    private String estadio;
    private String titulos;
    private String divisão;
    private String mascote;
    private String cores;
    private String hino;
    private String historia;
    private String nacionalidade;
    private int socios;
    @OneToOne(cascade = CascadeType.ALL)
    private Time time;
}
