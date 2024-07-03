/**
 * Laboratório de Programação 2 - Lab02
 * @author Larissa M. de S. Rodrigues
 **/

 public class RegistroTempoOnline {
  private String nomeDisciplina;
  private int tempoGastoOnline; // horas com a disciplina
  private int tempoEsperado; // horas para a disciplina

  public RegistroTempoOnline(String nome){
    this.nomeDisciplina = nome;
    this.tempoEsperado = 120;
  }

  public RegistroTempoOnline(String nome, int tempoEsperado){
    this.nomeDisciplina = nome;
    this.tempoEsperado = tempoEsperado;
  }
  
  public void adicionaTempoOnline(int tempo){
    //Adicionar tempo online
    this.tempoGastoOnline += tempo;
  }

  public boolean atingiuMetaTempoOnline(){
    //Verificar tempo online
    if(tempoGastoOnline >= tempoEsperado){
      return true;
    }
    return false;
  }

  @Override
  public String toString(){
    //Imprimir estado
    return this.nomeDisciplina + " " +
          this.tempoGastoOnline + "/" +
          this.tempoEsperado;
  }
}
