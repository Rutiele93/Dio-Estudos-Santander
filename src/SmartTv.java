public class SmartTv {
  Boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligar(){
    ligada=true;
  }

  public void desligar(){
    ligada = false;
  }

  public void aumentarVolume() {
      this.volume++;     
  }

  public void diminuirVolume() {
      this.volume--;
      
  }

  public void aumentarCanal() {
      this.canal++;
  }

  public void diminuirCanal() {
      this.canal--;
  }

  public void definirCanal(int novoCanal) {
      this.canal = novoCanal;
  }

}
