@packaged com.example.sinodal.model.Jogador;
import jakarta.persistence.*;
import java.util.List;
// Agregação: Um Jogo pode ter vários Níveis, mas os Níveis podem existir sem o Jogo
@Entity
class Cartoes {
    @Id @GeneratedValue
    private Long id;
    private String amarelo;
    private String vermelho;
   
    @OneToMany
    private List<Nivel> niveis;
}

