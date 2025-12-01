public class Contribuinte implements CalculadoraTributo {
   protected String nome;
   protected String cpf;
   protected double salarioBruto;

   public Contribuinte(String nome, String cpf, double salarioBruto) {
      this.nome = nome;
      this.cpf = cpf;
      this.salarioBruto = salarioBruto;
   }

   public String getNome() {
      return this.nome;
   }

   public String getCpf() {
      return this.cpf;
   }

   public double getsalarioBruto() {
      return this.salarioBruto;
   }

   public double calcularINSS() {
      return 0.0;
   }

   public double calcularIRPF() {
      return 0.0;
   }

   public double calcularSalarioLiquido() {
      return 0.0;
   }

   public void exibirResumo() {
      System.out.println("Nome do funcionário: " + this.getNome());
      System.out.println("Salário bruto:" + this.getsalarioBruto());
      System.out.println("INSS: " + this.calcularINSS());
      System.out.println("IRPF: " + this.calcularIRPF());
      System.out.println("Salário Líquido: " + this.calcularSalarioLiquido());
   }
}
