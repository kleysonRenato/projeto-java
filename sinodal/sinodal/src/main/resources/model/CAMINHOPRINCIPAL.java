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


@Entity
class Jogador {
    @Id @GeneratedValue
    private Long id;
    private String titulosconquistados;
    private String titulosperdidos;
    private String titulosdisputados;
    private String convocações;
}


////////////////////////////////////
// Polimorfismo: Diferentes tipos de Ataque
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
abstract class Jogador {
    @Id @GeneratedValue
    private Long id;
    private int quantidade;
   
    public abstract void executar();
}

@packaged com.example.sinodal.model.Jogador;
@Entity
class Tempodecorrida extends Jogador {
    @Override
    public void executar() {
        System.out.println("Atleta correu 100 metros em 10 segundos");
    }
}

@Entity
@packaged com.example.sinodal.model.Jogador;
class Chutesaogol extends Jogador {
    @Override
    public void executar() {
        System.out.println("O atleta chutou a bola em direção ao gol");
    }
}

@Entity
@packaged com.example.sinodal.model.Jogador;
class Sofreufaltas extends Jogador {
    @Override
    public void executar() {
        System.out.println("O atleta sofreu uma falta");
    }
}

@Entity
@packaged com.example.sinodal.model.Jogador;
class Partidasjogadas extends Jogador {
    @Override
    public void executar() {
        System.out.println("O atleta jogou partidas");
    }
}

@Entity
@packaged com.example.sinodal.model.Jogador;
class Assistencias extends Jogador {
    @Override
    public void executar() {
        System.out.println("O atleta deu assistências");
    }
}

@Entity
@packaged com.example.sinodal.model.Jogador;
class Impedimentos extends Jogador {
    @Override
    public void executar() {
        System.out.println("O atleta foi pego em impedimento");
    }
}


@Entity
@packaged com.example.sinodal.model.Jogador;
class Lesoes extends Jogador {
    @Override
    public void executar() {
        System.out.println("O atleta sofreu uma lesão");
    }
}