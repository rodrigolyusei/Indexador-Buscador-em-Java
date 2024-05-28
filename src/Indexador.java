package src;

//import src.ManipulaArquivo;

public class Indexador {
    public static void main(String[] args) {
        ManipulaArquivo manipulaArquivo = new ManipulaArquivo();

        switch(args.length){
            case 1:
                manipulaArquivo.ler(args[0]);
                break;
            case 2:
                manipulaArquivo.ler(args[0]);
                break;
            default:
                System.out.println("Argumento inválido");
        }
        
    }
}