package Automation_Questions;

import java.util.Objects;
import java.util.Scanner;

public class ATM_Question {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("           SAYIN JAVA, TÜRKİYE İŞ BANKASINA HOŞGELDİNİZ"
                                                               );

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 4 Haneli Şifrenizi Giriniz");
        String girilenSifre = scan.nextLine().replaceAll("\\d", "*");

        if (!(girilenSifre.length()==4)){

          int hak =3;

            while (true){

                if (hak ==1){
                    System.out.println("Bu Son Hakkınız");

                }else {
                    System.out.println("Hatalı Sifre Girimi Yaptınız Lütfen Tekrar Deneyiniz");
                  System.out.println("Lütfen 4 haneli Şifrenizi Giriniz :");

                  girilenSifre= scan.nextLine().replaceAll("\\d", "*");
                    System.out.println("Sifreniz : " + girilenSifre);
                       hak--;

                      if (hak==0){
                          System.out.println("Hesabınız Kilitlendi, Lütfen Banka İle İletişime Geçiniz");

                             System.exit(0);
                      }
                }
            }
        }else {

      //--------------------------------------------------------------------------------------------------------//
            System.out.println("1-Para Çekme " + "2-Para Yatırma "
                             + "3-EFT " + "4-Ödemeler " + "5-Hesap Özeti");

               String seçilenİşlem= scan.nextLine();

                  switch (seçilenİşlem){

                      case "1":
                          System.out.println("Para Çekme");
                          break;

                      case "2":
                          System.out.println("Para Yatırma");
                          break;

                      case "3":
                          System.out.println("ETF");
                          break;

                      case "4":
                          System.out.println("Ödemler");
                          break;

                      case "5":
                          System.out.println("Hesap Özeti");
                          break;

                  }

               if (seçilenİşlem.equals("1")){
                  System.out.println("Lütfen Çekmek İstediğiniz Miktarı Giriniz\n"
                                    + "1-50 TL\n"
                                    +"2-100 TL\n"
                                    +"3- 250 TL\n"
                                    +"4- 500 TL\n"
                                    +"5-Diğer");

                     String seçilenMiktar = scan.nextLine();

                        if (Objects.equals(seçilenMiktar,"1")){
                            System.out.println("50 TL Çekiliyor Lütfen Bekleyiniz...");
                            Thread.sleep(3000);
                            System.out.println("Lütfen Kartınızı Alınız");

                        } else if (Objects.equals(seçilenMiktar,"2")) {
                            System.out.println("100 Tl Çekiliyor Lütfen Bekleyiniz...");
                            Thread.sleep(3000);
                            System.out.println("Lütfen Kartınızı Alınız");

                        } else if (Objects.equals(seçilenMiktar,"3")) {
                            System.out.println("250 TL Çekiliyor Lütfen Bekleyiniz...");
                            Thread.sleep(3000);
                            System.out.println("Lütfen Kartınızı Alınız");

                        } else if (Objects.equals(seçilenMiktar,"4")) {
                            System.out.println("500 TL Çekiliyor Lütfen Beklyeniz...");
                            Thread.sleep(3000);
                            System.out.println("Lütfen Kartınızı Alınız");

                        } else if (Objects.equals(seçilenMiktar,"5")) {
                            System.out.println("Lütfen Çekmek İstediğiniz Miktarı Giriniz");
                            int çekilecekMiktar = scan.nextInt();

                               if (çekilecekMiktar>5001){
                                  System.out.println("Günlük Nakit Para Çekme Limitiniz 5000 TL'yi aşamaz");

                              }else {
                                   System.out.println("Çekmek İstediğiniz Miktar :" + çekilecekMiktar
                                                   + " TL Hazırlanıyor Lütfen Bekleyiniz...");
                                   Thread.sleep(3000);
                                   System.out.println("İşleminiz Başarıyla Gerçekleşmiştir, Lütfen Kartınızı Alınız");
                               }

                        } else if (seçilenİşlem.equals("2")) {
                            System.out.println("Lütfen Paranızı Hazırlanıyınız");
                            Thread.sleep(5000);

                            System.out.println("Lütfen paranızı ekranda gosterildiği gibi yerleştiriniz");
                            Thread.sleep(5000);

                            System.out.println("Para Yatırma İşleminiz Gerçekleşmiştir, Lütfen Kartınızı Alınız");

                        } else if (seçilenİşlem.equals("3")) {
                            System.out.println("Lütfen ETF Yapmak İstediğiniz Hesabın 16 Haneli İban Numarasını Giriniz ");

                               String girilenIbanNo = scan.nextLine();

                              if (!(girilenIbanNo.length()==16)){
                                  System.out.println("Lütfen Girilen Iban Numarasının 16 Haneli Olduğunu Kontrol Ediniz");

                              } else if (girilenIbanNo.length()==16) {
                                  System.out.println("Lütfen Göndermek İstediğiniz Tutarı Giriniz");
                                
                                  int göderilecekMiktar= scan.nextInt();
                                  System.out.println(girilenIbanNo+ " 'a " +göderilecekMiktar+ " TL Gönderiliyor Lütfen Bekleyiniz");
                                 
                                  Thread.sleep(3000);
                                  System.out.println("İşleminiz Başarı İle Gerçekleşmiştir, Lütfen Makbuzunuzu Ve Kartınızı Alınız");

                              }

                        } else if (seçilenİşlem.equals("4")) {
                            System.out.println("Lütfen Ödemesini Yapmak İstediğiniz Şeçeneği Şeçiniz\n"
                                                 +"1-Elektirik\n"
                                                 +"2-Su\n"
                                                 +"3-Doğalgaz\n");
                                
                               String ödenecekFatura= scan.nextLine();
                                 
                                  if (Objects.equals(ödenecekFatura,"1")){
                                      System.out.println("Lütfen 10 Haneli Elektirik Abone Numarasını Giriniz");
                                      
                                     String elktrAboneNo= scan.nextLine();
                                       
                                        if (!(elktrAboneNo.length()==10)){
                                            System.out.println("Lütfen Elektirik Faturanızı 10 Hane Olacak Şekilde Tekrar Giriniz");
                                            
                                        }else{
                                            System.out.println("Faturanız Ödeniyor Lütfen Bekleyiniz...");
                                            Thread.sleep(3000);
                                            System.out.println("Elektirik Faturanız Başarıyla Ödenmiştir, Lütfen Kartınızı Alınız");
                                        }
                                  
                                  } else if (Objects.equals(ödenecekFatura,"2")) {
                                      System.out.println("Lütfen 8 Haneli Su Abone Numarasını Giriniz ");
                                      
                                     String suAboneNo= scan.nextLine();
                                        
                                        if (!(suAboneNo.length()==8)){
                                            System.out.println("Lütfen Su Faturanızı 8 Hane Olacak Şekilde Tekrar Giriniz");

                                        }else {
                                            System.out.println("Faturanız Ödeniyor Lütfen Bekleyiniz...");
                                            Thread.sleep(3000);
                                            System.out.println("Su Faturanız Başarıyla Ödenmiştir, Lütfen Kartınızı Alınız");
                                        }
                                        
                                  } else if (Objects.equals(ödenecekFatura,"3")) {
                                      System.out.println("Lütfen 6 Haneli Doğalgaz Abone Numarasını Giriniz ");

                                      String doğalgazAboneNo= scan.nextLine();

                                      if (!(doğalgazAboneNo.length()==6)){
                                          System.out.println("Lütfen Doğalgaz Faturanızı 6 Hane Olacak Şekilde Tekrar Giriniz");

                                      }else {
                                          System.out.println("Faturanız Ödeniyor Lütfen Bekleyiniz...");
                                          Thread.sleep(3000);
                                          System.out.println("Doğalgaz Faturanız Başarıyla Ödenmiştir, Lütfen Kartınızı Alınız");
                                      }
                                      
                                  }

                        } else if (seçilenİşlem.equals("5")) {
                            System.out.println("Lütfen Görmek İstediğiniz Hesap Özetini Seçiniz\n"
                                                   +"1-Klan Bakiye\n"
                                                   +"2-Hesap Özeti\n");

                               String seçilenHesapÖzeti= scan.nextLine();

                                  if (Objects.equals(seçilenHesapÖzeti,"1")){
                                      System.out.println("Kalan Bakiyeniz Makbuz Olarak Yazdırılıyor, Lütfen Bekleyiniz");
                                      Thread.sleep(3000);
                                      System.out.println("Kalan Bakiye Makbuzunuz Başarıyla Yazdırılmıştır");
                                      Thread.sleep(1000);
                                      System.out.println("Lütfen Kartınızı Alınız");

                                 } else if (Objects.equals(seçilenHesapÖzeti,"2")) {
                                      System.out.println("Hesap Özetiniz Makbuz Olarak Yazdırılıyor, Lütfen Bekleyiniz");
                                      Thread.sleep(3000);
                                      System.out.println("Hesap Özetiniz Başarıyla Yazdırılmıştır");
                                      Thread.sleep(1000);
                                      System.out.println("Lütfen Kartınızı Alınız");

                                  }

                        }else {
                            System.out.println("Hatalı Tuşlama Yaptınız, Lütfen Tekrar Deneyiniz");
                        }

               }
        }
    }
}
