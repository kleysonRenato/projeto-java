@packaged com.example.sinodal.model.Sobreclubes;
@Entity
class Formação {
// Compare this snippet from sinodal/src/main/resources/model/Sobreclubes.JAVA:
    @Id @GeneratedValue
    private Long id;
    private String goleiro;
    private String zagueiro;
    private String lateral;
    private String volante;
    private String meia;
    private String atacante;
    private String tecnico;
    private String preparadorfisico;

    @OneToMany
    private List<Nivel> niveis;
}