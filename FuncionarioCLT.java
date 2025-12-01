public class FuncionarioCLT extends Contribuinte {
   public FuncionarioCLT(String nome, String cpf, double salarioBruto) {
      super(nome, cpf, salarioBruto);
   }

   public double calcularINSS() {
      double salario = this.salarioBruto;
      double inss = 0.0;
      double faixa;
      if (salario > 0.0) {
         faixa = Math.min(salario, 1412.0);
         inss += faixa * 0.075;
      }

      if (salario > 1412.0) {
         faixa = Math.min(salario, 2666.68) - 1412.0;
         inss += faixa * 0.09;
      }

      if (salario > 2666.68) {
         faixa = Math.min(salario, 4000.03) - 2666.68;
         inss += faixa * 0.12;
      }

      if (salario > 4000.03) {
         faixa = salario - 4000.03;
         inss += faixa * 0.14;
      }

      return (double)Math.round(inss * 100.0) / 100.0;
   }

   public double calcularIRPF() {
      double base = this.salarioBruto - this.calcularINSS();
      double irpf;
      if (base <= 2112.0) {
         irpf = 0.0;
      } else if (base <= 2826.65) {
         irpf = base * 0.075 - 158.4;
      } else if (base <= 3751.05) {
         irpf = base * 0.15 - 370.4;
      } else if (base <= 4664.68) {
         irpf = base * 0.225 - 651.73;
      } else {
         irpf = base * 0.275 - 884.96;
      }

      return (double)Math.round(irpf * 100.0) / 100.0;
   }

   public double calcularSalarioLiquido() {
      return this.salarioBruto - this.calcularINSS() - this.calcularIRPF();
   }
}
