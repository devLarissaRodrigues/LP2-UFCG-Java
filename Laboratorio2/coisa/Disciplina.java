package coisa;
import java.util.Arrays;

/**
 * Laboratório de Programação 2 - Lab02
 * @author Larissa M. de S. Rodrigues
 **/

public class Disciplina {
  private String nomeDisciplina;
  private int horasEstudo;
  private double[] notas;

public Disciplina(String nomeDisciplina){
  this.nomeDisciplina = nomeDisciplina; 
  this.notas = new double[4];
}

public void cadastraHoras(int horas){
  //Cadastrar horas de estudo
  this.horasEstudo += horas;
}

public void cadastraNota(int nota, double valorNota){
  // notas possíveis: 1, 2, 3 e 4
  //Cadastrar uma nota
  this.notas[nota-1] = valorNota;
}

public boolean aprovado(){
  //  Verificar se foi aprovado
  if(this.media() >= 7){
    return true;
  }
  return false;
}

@Override
public String toString(){
  //Imprimir estado
  return this.nomeDisciplina + " " +
        this.horasEstudo + " " + 
        this.media() + " " +
        Arrays.toString(this.notas);
}

  private double media(){
    double media = 0;
    double soma = 0;

    for(int i=0; i < this.notas.length; i++){
      soma += notas[i];
    }
    media = soma/this.notas.length;
    return media;
  }
}
