/**
 * Laboratório de Programação 2 - Lab02
 * @author Larissa M. de S. Rodrigues
 **/

public class Descanso{
  private int horasDescanso;
  private int numeroSemanas;

  public Descanso() {
    this.horasDescanso = 0;
    this.numeroSemanas = 0;
  }

  public void defineHorasDescanso(int valor){
    this.horasDescanso = valor;
  }

  public void defineNumeroSemanas(int valor){
    this.numeroSemanas = valor;
  }

  public String getStatusGeral(){
    String status = "cansado";
    if(numeroSemanas == 0){
      status = "cansado";
    }
    else if(horasDescanso / numeroSemanas >= 26){
      status = "descansado";
    }
    return status;
  }
}