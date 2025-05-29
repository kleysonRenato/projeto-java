@packaged com.example.sinodal.model.Jogador;
@Entity
class Assistencias extends Jogador {
    @Override
    public void executar() {
        System.out.println("O atleta deu assistências");
    }
}