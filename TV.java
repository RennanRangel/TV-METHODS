

public class TV {
   String marca;
   int volume;
   int canal;
   boolean ligada;


   public TV(String marca, int volume, int canal) {
       this.marca = marca;
       this.volume = volume;
       this.canal = canal;
       this.ligada = false;


   }


   public TV() {
   }


   void ligar() {
       this.ligada = true;
   }


   void desligar() {
       this.ligada = false;


   }


   void aumentarVolume() {
       if (this.volume == 100) {
           System.out.println("Volume no maximo!");
       } else {
           this.volume++;
       }
   }


   void diminuirVolume() {
      if (this.volume == 0){
          System.out.println("Volume no minimo!");
   } else{
          this.volume--;
      }


}
void mudo() {
       this.volume = 0;
       System.out.println("TV no Mudo!");
}


 void trocarCanal(int canal){
       if (canal < 1 || canal > 999){
           System.out.println("Comando Inválido");
       } else {
           this.canal = canal;
       }
 }


}

     if (canal < 1 || canal > 999){
           System.out.println("Comando Inválido");
       } else {
           this.canal = canal;
       }
 }


}

