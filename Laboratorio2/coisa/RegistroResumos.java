package coisa;
/**
 * Laboratório de Programação 2 - Lab02
 * @author Larissa M. de S. Rodrigues
 **/

public class RegistroResumos {
  private int numeroMaximoResumos;
  private String[] temas;
  private String[] resumos;
  private int contador;

  public RegistroResumos(int numeroMaximoResumos){
    this.numeroMaximoResumos = numeroMaximoResumos;
    this.temas = new String[numeroMaximoResumos];
    this.resumos = new String[numeroMaximoResumos];
  }

  public void adiciona(String tema, String resumo){
    //Adicionar resumo
    this.temas[this.contador] = tema;
    this.resumos[this.contador] = resumo;
    this.contador += 1;
    
    if(this.contador >= numeroMaximoResumos){
      this.contador = 0;
    }
  }

  public String[] pegaResumos(){
      //Visualizar resumo
      String[] todosResumos = new String[this.numeroMaximoResumos];
      for(int i = 0; i < numeroMaximoResumos; i++){
        todosResumos[i] = this.temas[i] + ": " + this.resumos[i];
      }
      return todosResumos;
  }
  
  public String imprimeResumos(){
    //Exibir resumos
    String saida = "- " + this.conta() + " resumo(s) cadastrado(s)\n";
    if(this.conta() >= 1 ){
      saida += "- " + this.temas[0] + " | " + this.temas[1];
    }
    return saida;
  }
  
  public int conta(){
    //Conta resumos
    int conta = 0;
    for (int i = 0; i < numeroMaximoResumos; i++){
      if(temas[i] == null){
        break;
      }
      conta += 1;
    }
    return conta;
  }

  public boolean temResumo(String tema){
    for(int i = 0; i < contador; i++){
      if(this.temas[i].equals(tema)){
        return true;
      }
    }
    return false;
  }
}
