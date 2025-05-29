@packaged com.example.sinodal.model.Sobreclubes;
@Entity

class Campeonatos {

    @Id @GeneratedValue
    private Long id;
    private String campeonatos Disputadando;
    private String divisão;
    private int total de titulos;
    private int rebaixamentos;


    @OneToMany
    private List<Nivel> niveis;
}