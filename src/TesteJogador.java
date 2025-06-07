
public class TesteJogador {
    public static void main(String[] args) {
        Jogador pedro = new Jogador();
        pedro.nome = "Pedro";
        pedro.altura = 1.82;
        pedro.anoMatricula = 2021;

        Jogador carla = new Jogador();
        carla.nome = "Carla";
        carla.altura = 1.85;
        carla.anoMatricula = 2022;

        System.out.println(pedro.nome + " tem " + pedro.altura + "m de altura.");
        carla.treino();
    }
}