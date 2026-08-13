
package br.com.meusistema.main;
import br.com.meusistema.model.Carro;

public class Sistema {
    public static void main(String[] args) {
        System.out.println("Iniciando o sistema...");

        Carro meuCarro = new Carro();

        meuCarro.modelo = "Fusca";
        meuCarro.cor = "Azul";

        meuCarro.buzinar();
    }
}

   package br.com.meusistema.model;     
public class Carro { 
  public String modelo;
  public String cor;
  public void buzinar() { 
    System.out.println("O " + modelo + " " + cor + " fez: BIIII BIIII!");    
  }  
} 
