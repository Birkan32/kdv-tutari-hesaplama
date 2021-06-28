import java.util.Scanner ;

public class kdv {
    public static void main(String[] args) {
        double kdvOran1= 0.18 , kdvTutar1, kdvliTutar1,  kdvOran2= 0.08 , kdvTutar2, kdvliTutar2 ;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz ; " ) ;
        int tutar = input.nextInt();
        if(tutar>0 && tutar<1000) {

            kdvTutar1 = tutar * kdvOran1;
            kdvliTutar1 = tutar + kdvTutar1;
            System.out.println("KDV Tutari :" +  kdvTutar1 );
        }
        else {
            kdvTutar2 = tutar * kdvOran2;
            kdvliTutar1 = tutar + kdvTutar2;
            System.out.println("KDV Tutari :" +  kdvTutar2 );
        }

    }
}