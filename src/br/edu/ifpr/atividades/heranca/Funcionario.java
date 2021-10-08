package br.edu.ifpr.atividades.heranca;

public class Funcionario {
  private float horasSemanais;
  private float valorHora;
  private String departamento;
  private double salario;

  public Funcionario() {
    super();
  }

  public Funcionario(float valorHora, float horasSemanais) {
    super();
    this.valorHora = valorHora;
    this.horasSemanais = horasSemanais;
  }

  protected double getHorasSemanais() {
    return this.horasSemanais;
  }

  protected void setHorasSemanais(float horasSemanais) {
    this.horasSemanais = horasSemanais;
  }

  protected float getValorHora() {
    return this.valorHora;
  }

  protected void setValorHora(float valorHora) {
    this.valorHora = valorHora;
  }

  protected String getDepartamento() {
    return this.departamento;
  }

  protected void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  protected double getSalario() {
    return this.salario;
  }

  protected void setSalario(double salario) {
    this.salario = salario;
  }

  protected void calcularSalario() {
    setSalario(getValorHora() * getHorasSemanais() * 4);
  }

  protected void trabalhar() {
    System.out.println("Trabalhando...");
  }

}