public class PessoaJuridica extends Contribuinte {
   public PessoaJuridica(String nome, String cpf, double salarioBruto) {
      super(nome, cpf, salarioBruto);
   }

   public double calcularINSS() {
      return 0.0;
   }

   public double calcularIRPF() {
      return 0.0;
   }

   public double calcularSalarioLiquido() {
      return this.salarioBruto;
   }
}
