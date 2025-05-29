@packaged com.example.sinodal.model.Sobreclubes;
@Entity
class EstatisticasClube {
// Compare this snippet from sinodal/src/main/resources/model/Sobreclubes.JAVA:
    @Id @GeneratedValue
    private Long id;
    private int Formação;
    private String Jogos;
    private int Vitorias;
    private int Empates;
    private String Derrotas;
    private String Gols;
    private String Golssofridos;
    private String campeonatos vencidos;
    private String campeonatos a disputar;
    private int Jogadores;
    private String Técnico;
    private int socios;
   
    @OneToMany
    private List<Nivel> niveis;
}