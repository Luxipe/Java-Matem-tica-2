public class Pastel3 {
    public static void main(String[] args) {
        double volumeCone = 94; // o valor do volume do cone é 94
        double altura = 9; // a altura vai ser 9
        double raio = Math.sqrt((3 * volumeCone) / (Math.PI * altura * altura)); 
        
        System.out.println("O raio da base do cone é: " + raio + " cm"); // vai ter o total da base do cone. 
    }
}
