@packaged com.example.sinodal.model.Jogador;
@Entity
@packaged com.example.sinodal.model.Jogador;
class Sofreufaltas extends Jogador {
    @Override
    public void executar() {
        System.out.println("O atleta sofreu uma falta");
    }
}