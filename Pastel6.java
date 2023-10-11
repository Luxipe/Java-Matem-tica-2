public class Pastel6 {
    private static double areaCirculo;

    public static void main(String[] args) {
      double comprimentoRetangulo = 20; // o comprimento do retangulo vai ser 20.
      double larguraRetangulo = 10; // a largura do retangulo vai ser 10.
      // vai Encontrar o raio do círculo com base no perímetro do retângulo
      double raio = (comprimentoRetangulo + larguraRetangulo) / (2 * Math.PI);
        
      // vai Calcular a área do círculo
      areaCirculo = Math.PI * raio * raio;
      System.out.println("A área do círculo é: " + areaCirculo + " cm²");// vai falar o total da area do circulo em cm²
    }
}
     


    
