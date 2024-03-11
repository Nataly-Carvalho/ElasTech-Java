import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        System.out.println("Você ganha quanto por hora?");
        double QuantidadeHoras = scan.nextDouble();

        System.out.println("Você trabalha quantas horas por mes?");
        double horaMes = scan.nextDouble();

        double salarioBruto = QuantidadeHoras * horaMes;

        double isento = 900;
        double porcento5 = 1500;
        double porcento10 = 2500;

        double descontoIR =0;

        if (salarioBruto <= isento){
            descontoIR = 0;
        }else if(salarioBruto <= porcento5){
            descontoIR = salarioBruto * 0.05;
        } else if ( salarioBruto <= porcento10) {
            descontoIR = salarioBruto * 0.10;
        } else{
            descontoIR = salarioBruto * 0.20;
        }

        double descontoINSS = salarioBruto *0.1;
        double descontoSindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;
        double descontoTotal = descontoIR + descontoSindicato + fgts + descontoINSS;
        double salarioLiquido = salarioBruto - descontoTotal;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("(-) IR (5%): R$ "+ descontoIR);
        System.out.println("(-) Sindicato (3%): R$ " + descontoSindicato);
        System.out.println("FGTS (11%): R$ "+ fgts);
        System.out.println("INSS : R$ "+ descontoINSS);
        System.out.println("Total de descontos: R$ "+ descontoTotal);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
    }

}
