import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExercicioDebug {
    public static double calcularAreaRetanguloComInputUsuario() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base: ");
        double base = scanner.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        double areaRetangulo = base * altura;

        System.out.println("O valor da área é de " + areaRetangulo);

        return areaRetangulo;
    }

    //vai calcular as duas entradas do metodo anterior calcularAreaRetanguloComInputUsuario
    public static double calcularAreaRetangulo(double base, double altura) {

        double areaRetangulo = base * altura;

        System.out.println("O valor da área do retangulo é " + areaRetangulo);

        return areaRetangulo;
    }

    public static void calcularSomaAreas() {

        //Exemplo de uso do retorno de outra função
        double somaAreas = calcularAreaRetanguloComInputUsuario() + calcularAreaRetanguloComInputUsuario();

        System.out.println("A area total de construção é de: " + somaAreas);
    }

    public static void mostrarTodosOsValoresListaNumero(List<Integer> numeros) {

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }

    public static List<Integer> retornarListaNumeros() {

        List<Integer> listaNumero = new ArrayList<>();

        return (listaNumero);
    }

    public static String mostrarMensagemComQuantidade(List<Integer> integers) {

        List<String> nomesExibir = new ArrayList<>();

        for (int i = 0; i < integers.size(); i++) {
            nomesExibir.add(integers.get(i) + "nomes");
        }
        return nomesExibir.toString();
    }

    public static String retornarListaNomes() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a capacidade: ");
        int capacidade = scanner.nextInt();

        List<String> listaNomes = new ArrayList<>();

        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println("Digite um nome: ");
            listaNomes.add(scanner.nextLine());
        }

        return listaNomes.toString();
    }

    public static void main(String[] args) {

        System.out.println("=========================================================");
        System.out.println("Exemplo do calculo do retangulo com funções");
        System.out.println("=========================================================");

        calcularSomaAreas();


        System.out.println("=========================================================");
        System.out.println("Exemplo de mostrar lista de números com funções");
        System.out.println("=========================================================");
        mostrarTodosOsValoresListaNumero((retornarListaNumeros()));


        System.out.println("=========================================================");
        List<Integer> listaNumerosArray = (retornarListaNumeros());
        mostrarTodosOsValoresListaNumero(listaNumerosArray);

        List<String> listaNomesComQuantidade = Collections.singletonList(mostrarMensagemComQuantidade((retornarListaNumeros())));

        System.out.println("=========================================================");
        System.out.println("Exemplo de mostrar lista de quantidade de nomes com funções");
        System.out.println("=========================================================");
        System.out.println("Exemplo de array = " + listaNomesComQuantidade);

    }
}
