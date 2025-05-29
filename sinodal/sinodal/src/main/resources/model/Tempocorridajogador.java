@packaged com.example.sinodal.model.Jogador;
@Entity
class Tempodecorrida extends Jogador {
    @Override
    public void executar() {
        System.out.println("Atleta correu 100 metros em 10 segundos");
    }
}
