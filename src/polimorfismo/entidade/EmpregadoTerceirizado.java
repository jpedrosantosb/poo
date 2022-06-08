package polimorfismo.entidade;

public class EmpregadoTerceirizado extends Empregado {

  private Double despesaAdicional;
  
  public EmpregadoTerceirizado() {
      super();
  }

  public EmpregadoTerceirizado(String name, Integer hours, Double valuePerHours, Double despesaAdicional) {
      super(name, hours, valuePerHours);
      this.despesaAdicional = despesaAdicional;
  }
  
  public Double getDespesaAdicional() {
    return despesaAdicional;
  }

  public void setDespesaAdicional(Double despesaAdicional) {
    this.despesaAdicional = despesaAdicional;
  }

  @Override
  public double pagamento () {
      return super.pagamento() + despesaAdicional * 1.1;
  }
  
}
