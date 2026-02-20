import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Digite o primeiro parametro");
    int parametroUm = sc.nextInt();
    System.out.println("Digite o segundo parametro");
    int parametroDois = sc.nextInt();

    try{
        contar(parametroUm, parametroDois);

        } catch (ParametroInvalidoException exception){
            System.out.println("Erro tente novamente, primeiro não pode ser maior do que o segundo");

    }

    sc.close();

    }

    public static void contar(int parametroUm, int parametroDois) throws  ParametroInvalidoException {
        if(parametroUm > parametroDois){
            throw new ParametroInvalidoException("tente novamente, se o primeiro for maior que o segundo vai dar erro..");
        }
        int contagem = parametroDois - parametroUm;
        for(int i = 1; i < contagem; i++){
            System.out.println("Imprimindo " + i);

        }
    }

}