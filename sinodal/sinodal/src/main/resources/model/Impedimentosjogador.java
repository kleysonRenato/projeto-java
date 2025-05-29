

@packaged com.example.sinodal.model.Jogador;
@Entity
class Impedimentos extends Jogador {
    @Override
    public void executar() {
        System.out.println("O atleta foi pego em impedimento");
    }
}
