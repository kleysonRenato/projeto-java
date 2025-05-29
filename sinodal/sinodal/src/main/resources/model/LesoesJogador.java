@packaged com.example.sinodal.model.Jogador;
@Entity
class Lesoes extends Jogador {
    @Override
    public void executar() {
        System.out.println("O atleta sofreu uma lesão");
    }
}