public class App {
    public static void main(String[] args) throws Exception {
        Banco conta = new Banco();
        conta.setNumeroconta(123);
        conta.setSeunome("juan");
        conta.setStatus(true);
        conta.abrirConta("CC");
        conta.suaconta();
        System.out.println("-----------------------");
        conta.sacar(150F);
        conta.fecharConta();
    }
}
