package Automation_Questions;

import java.util.Scanner;

public class Coffee_Question {

    public static void main(String[] args) throws InterruptedException {

        /*

       1. Basit bir Kahve makinesi oluşturun. 3 çeşit kahvemiz olsun.
       2. Sistem şu soruyu sorsun: "Hangi kahveyi istersiniz"
       3. Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
       Örn:  Hangi Kahveyi İstersiniz? 1.Türk Kahvesi   2.Filtre Kahve   3.Espresso

     String hangiKahve oluşturun ve var olan kahvelerden birini
    yazınız.  (Örn: Türk kahvesi. --->  Büyük-küçük harf uyarlı olması için String
    methodu kullanın.)

                --------------------------------------------------todo 1. Koşul
            Bölümü------------------------------------

                 Eğer kahve Türk kahvesi ise,
         konsola = "Türk kahvesi hazırlanıyor :))" yazsın(dümdüz Türk Kahvesi yazmayın
        (String hangikahve'yi çagırın.)

                 Eğer filtre kahve ise,  konsola= "Filtre kahveniz hazırlanıyor :))" yazsın
        (String hangiKahve'yi kullanın !!)

                 Eğer Esperesso ise, konsola = "Esperesso hazırlanıyor :))" yazsın
        (String hangiKahve'yi kullanın !!)

                 Eğer yanlış harf girerseniz, konsola = "Hatalı tuşlama yaptınız" yazsın.
        ( Hatalı tuşlamadan sonra kod çalışmaya devam
        edecektir, o konuyu daha görmedik bu yuzden baştan başlatalım.)

                 Sistem bize şu soruyu sorsun : "Süt eklememizi ister misiniz ?"
        ( Evet veya Hayır olarak cevaplayınız):   "

                 Konsolda aynen böyle yazmalı. Parantez içi de konsolda olsun.

                 -------------------------------------------------todo 2.Koşul
            Bölümü-----------------------------------

                            String sut oluşturun.

                Eğer String sut, evet'e eşitse, konsola, Süt ekleniyor...
        yazınısını yazsın.

                (Büyük küçük harf duyarlı olmaması için String methodu
        kullanın. Olması gereken ihtimaller: Evet, EVET, evEt, EVEt vs.
                eğer String sut, Hayır'a eşit ise, konsola = "Süt eklenmiyor"
        yazısı gelsin.

                 ------------------------------------------------todo 3.Koşul
            Bölümü-----------------------------------

                            Sistem bize "Şeker ister misiniz ? "(Evet veya Hayır
            cevabını veriniz) : " şeklinden bir soru sorsun.
                ( büyük küçük harfduyarlılığı olmaması için String method
            kullanın)

                String şeker oluşturunuz.

                if(){   Eğer String şeker Evet'e eşitse,
                      sistem bize "Kaç şeker olsun?" sorusunu sormalı. Sorunun
                altına int kacŞeker oluşturunuz.   Şeker sayısını giriniz.
                        Ve konsola şunu yazdırınız örnek: 5 şeker
                ekleniyor.  (ipucu: Bu kodların hepsi if bloğunun içerisinde olucak)

             }else{     Eğer String şeker Hayır'a eşitse, sistem bize "Şeker
             eklenmiyor" cevabını versin.

                        ÖNEMLİ !!= bir int girdisinden sonra String girdisi
            yapacaksak, araya bir boş nextLine koymanız gerekiyor.

                        String basKod = sc.nextLine();    ) dummy kod ekleyiniz.

                 -----------------------------------------------todo 4.Koşul
            Bölümü------------------------------------

                        Sistem bize "Hangi boyutta olsun ?" ( Büyük Boy -
            Orta Boy - Küçük Boy olarak giriniz) :   sorusunu sorsun
                (büyük küçük harf duyarlılığı olmamalı. yani kullanıcı
             büyük boy veya BÜYÜK Boy girdiğinde kabul etmeli.)

                String boyut oluşturun...

                       Eğer String boyut Büyük Boy'a eşitse = Kahveniz Büyük
            Boy hazırlanıyor. (Büyük boy kısmını String boyut'u kullanarak
            yazalım= "Kahveniz" + boyut + "hazırlanıyor.")

                       Eğer String boyut Orta Boy'a eşitse = Kahveniz Orta
            Boy hazırlanıyor. (Orta boy kısmını String boyut'u kullanarak
            yazalım= "Kahveniz" + boyut + "hazırlanıyor.")

                        Eğer String boyut Küçük Boy'a eşitse = Kahveniz Küçük
            Boy hazırlanıyor. (Küçük boy kısmını String boyut'u kullanarak
            yazalım= "Kahveniz" + boyut + "hazırlanıyor.")

                       -------------------------------------------------------
            SONUÇ BÖLÜMÜ--------------------------------------------

                            Şiparişlerimizi verdik. son hali görmek istiyoruz.

                    Konsola şunu yazdırın Örnek :  Türk Kahvesi Orta Boy
            hazırdır. Afiyet olsun :>
                    (Türk kahvesi için String hangiKahveyi kullanın.     orta
            boy için de String boyut'u kullanın.)


     */


        System.out.println("      Merhaba ne içmek istersiniz ?      ");

        System.out.println("A-Türk Kahvesi " + " B-Fitre Kahve " + " C-Espresso " +
                "D-Latte " + " E-Sıcak Çikolata");

        System.out.println("Lütfen tercihinizi yapın.");

        Scanner scan = new Scanner(System.in);
        String kahveTercihi = scan.nextLine().toUpperCase();


        if(! (kahveTercihi.equals("A") || kahveTercihi.equals("B") ||
                kahveTercihi.equals("C") || kahveTercihi.equals("D") ||
                kahveTercihi.equals("E"))) {

            System.out.println("Hatalı tuşlama yaptınız");

            return;

        }

        //----------------------------------------- TODO 1. Koşul Bölümü -------------------------------------------//
//***************************************** Ustte Kahve Tercih Satiri *********************************************//


        System.out.println("Süt eklememizi ister misiniz ?" + "\nEVET: " +
                "HAYIR:");

        String sutSecimi = scan.nextLine().toUpperCase();


        switch(sutSecimi) {

            case "E":
                sutSecimi="Sütlü";

                System.out.println("Süt ekleniyorr...\n");
                Thread.sleep(2000);

                break;


            case "H":
                sutSecimi = "Sade ";

                System.out.println("Süt eklenmeyecek...\n");
                Thread.sleep(1000);

                break;


            default:

                System.out.println("Hatalı tuşlama yaptınız.\n");


                return;

        }



        //----------------------------------------- TODO 2. Koşul Bölümü -------------------------------------------//
//***************************************** Üstte Süt Tercihi Satiri ***********************************************//


        System.out.println("Şeker eklemek ister misin ?\n" + " EVET: " +
                "Hayır:");

        String şekerSecimi = scan.nextLine().toUpperCase();

        switch(şekerSecimi){

            case "E":

                System.out.println("Lütfen şeker miktarınızı giriniz.");
                int şekerMiktarı;

                while(!(scan.hasNextLine())){

                    System.out.println("Hatalı tuşlama yaptınız!!!");
                    System.out.println("lütfen şeker miktarını sayı olarak giriniz");

                    scan.nextLine();
                }

                şekerMiktarı = scan.nextInt();


                System.out.println(şekerMiktarı + " adet şeker ekleniyor...\n");

                şekerSecimi = şekerMiktarı+ "Şekerli";
                Thread.sleep(1000);

                String basKod = scan.nextLine();


                break;


            case "H":
                şekerMiktarı= 0;

                System.out.println("Şeker eklenmeyecek...\n");
                Thread.sleep(1000);

                break;

            default:

                System.out.println("Hatalı tuşlama yaptınız.\n");


                return;

        }




        //-------------------------------------- TODO 3. Koşul Bölümü ---------------------------------------//
//***************************************** Üstte Seker Tercihi Satiri *************************************//


        System.out.println("Lütfen bardak boyutunu seçiniz ");

        System.out.println("B- Büyük Boy " + " O- Orta Boy " + " K- Küçük Boy");

        String bBoy = "Büyük Boy";
        String oBoy = "Orta Boy";
        String kBoy = "Küçük Boy";

        String bardakSeçimi = scan.nextLine().toUpperCase();

        if(bardakSeçimi.equals("B")){

            System.out.println("Büyük Boy");
            Thread.sleep(500);
            bardakSeçimi = bBoy;


        } else if(bardakSeçimi.equals("O")){

            System.out.println("Orta Boy");
            Thread.sleep(500);
            bardakSeçimi = oBoy;

        }else if(bardakSeçimi.equals("K")){

            System.out.println("Küçük Boy");
            Thread.sleep(500);
            bardakSeçimi = kBoy;

        }else{

            System.out.println("Hatalı giriş yaptınız");

        }





        //--------------------------------------- TODO 4. Koşul Bölümü -----------------------------------------//
//***************************************** Bardak Boyutu Tercihi Satiri *************************************//


        if(kahveTercihi.equals("A")){

            System.out.println(şekerSecimi + sutSecimi +
                    " Türk Kahveniz hazırlanıyor...");
            Thread.sleep(2000);
            System.out.println(bardakSeçimi + " Türk kahveniz hazır, " +
                    "Afiyet Olsun!!!");

        }else if (kahveTercihi.equals("B")){

            System.out.println(şekerSecimi + sutSecimi +
                    " Filtre Kahveniz hazırlanıyor...");
            Thread.sleep(2000);
            System.out.println(bardakSeçimi + " Filtre kahveniz hazır, " +
                    "Afiyet Olsun!!!");

        }else if (kahveTercihi.equals("C")){

            System.out.println(şekerSecimi + sutSecimi +
                    " Esperssonuz hazırlanıyor... ");
            Thread.sleep(2000);
            System.out.println(bardakSeçimi + " Espressonuz hazır, " +
                    "Afiyet Olsun!!!");

        }else if(kahveTercihi.equals("D")){

            System.out.println(şekerSecimi + sutSecimi +
                    " Latteniz hazırlanıyor...");
            Thread.sleep(2000);
            System.out.println(bardakSeçimi + " Latteniz hazır, " +
                    "Afiyet Olsun!!!");

        }else if(kahveTercihi.equals("E")){

            System.out.println(şekerSecimi + sutSecimi +
                    " Sıcak Çikolatanız hazırlanıyor...");
            Thread.sleep(2000);
            System.out.println(bardakSeçimi + " Sıcak Çikolatanız hazır, " +
                    "Afiyet olsun!!!");

        }else{

            System.out.println("Hatalı tuşlama yaptınız, tekrar deneyin!!!");
        }



    }
}
