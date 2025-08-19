import java.util.Scanner;

public class ex2_l3 {

    public static void main(String args[]) {
        
        int mon = 1100;

        Scanner in = new Scanner (System.in);
        
        //System.out.println("teste: ");
        //a = in.nextInt();

        int uni = ((mon%100)%10);
        int dec = (mon%100) - uni;
        int cent = (mon%1000) - dec - uni;
        int thou = mon - cent - dec - uni;

        String thou_s = "";


        switch (thou/1000){
            case 0:
                thou_s = "";
                break;
            case 1:
                thou_s = "mil";
                break;
            case 2:
                thou_s = "dois mil";
                break;
            case 3:
                thou_s = "tres mil";
                break;
            case 4:
                thou_s = "quatro mil";
                break;
            case 5:
                thou_s = "cinco mil";
                break;
            case 6:
                thou_s = "seis mil";
                break;
            case 7:
                thou_s = "sete mil";
                break;
            case 8:
                thou_s = "oito mil";
                break;
            case 9:
                thou_s = "nove mil";
                break;
        }

        String cent_s = "";

        switch (cent/100){
            case 0:
                cent_s = "";
                break;
            case 1:
                cent_s = "cento";
                break;
            case 2:
                cent_s = "duzentos";
                break;
            case 3:
                cent_s = "trezentos";
                break;
            case 4:
                cent_s = "quatrozentos";
                break;
            case 5:
                cent_s = "quinhentos";
                break;
            case 6:
                cent_s = "seicentos";
                break;
            case 7:
                cent_s = "setecentos";
                break;
            case 8:
                cent_s = "oitocentos";
                break;
            case 9:
                cent_s = "novecentos";
                break;
        }

        String dec_s = "";
        String uni_s = "";

        if(dec/10 == 1){
            dec += uni;
            switch (dec){
                case 0:
                    dec_s = "";
                    break;
                case 11:
                    dec_s = "onze";
                    break;
                case 12:
                    dec_s = "doze";
                    break;
                case 13:
                    dec_s = "treze";
                    break;
                case 14:
                    dec_s = "quatorze";
                    break;
                case 15:
                    dec_s = "quinze";
                    break;
                case 16:
                    dec_s = "dezesseis";
                    break;
                case 17:
                    dec_s = "dezessete";
                    break;
                case 18:
                    dec_s = "dezoito";
                    break;
                case 19:
                    dec_s = "dezenove";
                    break;
        }
        }

        switch (dec/10){
            case 0:
                //dec_s = "";
                break;
            case 1:
                //dec_s = "dez";
                break;
            case 2:
                dec_s = "vinte";
                break;
            case 3:
                dec_s = "trinta";
                break;
            case 4:
                dec_s = "quarenta";
                break;
            case 5:
                dec_s = "cinquenta";
                break;
            case 6:
                dec_s = "sessenta";
                break;
            case 7:
                dec_s = "setenta";
                break;
            case 8:
                dec_s = "oitenta";
                break;
            case 9:
                dec_s = "noventa";
                break;
        }

        
        switch (uni){
            case 0:
                uni_s = "";
                break;
            case 1:
                uni_s = "um";
                break;
            case 2:
                uni_s = "dois";
                break;
            case 3:
                uni_s = "tres";
                break;
            case 4:
                uni_s = "quatro";
                break;
            case 5:
                uni_s = "cinco";
                break;
            case 6:
                uni_s = "seis";
                break;
            case 7:
                uni_s = "sete";
                break;
            case 8:
                uni_s = "oito";
                break;
            case 9:
                uni_s = "nove";
                break;
        }

        //System.out.println (+thou + " "  +cent);

        thou /= 1000;
        cent /= 100;

        //System.out.println (+thou + " " +cent);

        //print 4 casas dec
        if(thou > 0 && cent > 0 && dec >= 10 && dec < 19){
            System.out.println(thou_s + " " + cent_s + " e " + dec_s);
        }
        else if(thou > 0 && cent > 0 && dec > 0 && uni > 0){
            System.out.println(thou_s + " " + cent_s + " " + dec_s + " e " + uni_s);
        }
        //print 3 casas dec
        if(thou == 0 && cent > 0 && dec >= 10 && dec < 19){
            System.out.println(cent_s + " e " + dec_s);
        }
        else if(thou == 0 && cent > 0 && dec > 0 && uni > 0){
            System.out.println(cent_s + " " + dec_s + " e " + uni_s);
        }
        //print 2 casas dec
        if(thou == 0 && cent == 0 && dec >= 10 && dec < 19){
            System.out.println(dec_s);
        }
        else if(thou == 0 && cent == 0 && dec > 0 && uni > 0){
            System.out.println(dec_s + " e " + uni_s);
        }
        //print 1 casa dec
        if(thou == 0 && cent == 0 && dec == 0 && uni > 0){
            System.out.println(uni_s);
        }
        
    }
}

