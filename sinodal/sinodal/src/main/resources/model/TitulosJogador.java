@packaged com.example.sinodal.model.Jogador;
import jakarta.persistence.*;
import java.util.List;
@Entity
class Jogador {
    @Id @GeneratedValue
    private Long id;
    private String titulosconquistados;
    private String titulosperdidos;
    private String titulosdisputados;
    private String convocações;
}
