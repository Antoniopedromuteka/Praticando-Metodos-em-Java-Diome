public class Emprestimo {

    public static double getTaxaTresParcelas(){
        return 0.45;
    }

    public static double getTaxaDuasParcelas(){
        return 0.3;
    }




    public static void calcular(double valor, int parcela){
        if(valor>0 && valor>parcela){
            if(parcela==2){
                double valorFinal = valor + (valor/parcela)*getTaxaDuasParcelas();
                System.out.println("O valor a pagar em "+parcela+" parcelas é de: "+valorFinal);
            }else
            if (parcela==3){
                double valorFinal = valor + (valor/parcela)*getTaxaTresParcelas();
                System.out.println("O valor a pagar em "+parcela+" parcelas é de: "+valorFinal);
            }else{
                System.out.println("A quantidade de parcelas não existe ");
            }

        }
    }
}
