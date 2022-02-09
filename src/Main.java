import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = true;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz : ");
        month = scanner.nextInt();


        System.out.print("Doğduğunuz günü giriniz : ");
        day = scanner.nextInt();
        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Oğlak burcu";
                    } else {
                        burc = "Kova burcu ";
                    }
                } else {
                    isError = true;
                }
                break;


            case 2:
                if (month == 2) {
                    if (day <= 19)
                        burc = "Kova burcu.";
                    else
                        burc = "Balık burcu.";
                } else {
                    isError = true;
                }
                break;


            case 3:
                if (month == 3) {
                    if (day <= 20)
                        burc = "Balık burcu.";
                    else
                        burc = "Koç burcu.";
                } else {
                    isError = true;
                }
                break;


            case 4:
                if (month == 4) {
                    if (day <= 20)
                        burc = "Koç burcu.";
                    else
                        burc = "Boğa burcu.";
                } else {
                    isError = true;
                }
                break;


            case 5:
                if (month == 5) {
                    if (day <= 21)
                        burc = "Boğa burcu.";
                    else
                        burc = "İkizler burcu.";
                } else {
                    isError = true;
                }
                break;

            case 6:
                if (month == 6) {
                    if (day <= 22)
                        burc = "İkizler burcu.";
                    else
                        burc = "Yengeç burcu.";
                } else {
                    isError = true;
                }
                break;

            case 7:
                if (month == 7) {
                    if (day <= 22)
                        burc = "Yengeç burcu.";
                    else
                        burc = "Aslan burcu.";
                } else {
                    isError = true;
                }
                break;


            case 8:
                if (month == 8) {
                    if (day <= 22)
                        burc = "Aslan burcu.";
                    else
                        burc = "Başak burcu.";
                } else {
                    isError = true;
                }
                break;


            case 9:
                if (month == 9) {
                    if (day <= 22)
                        burc = "Başak burcu.";
                    else
                        burc = "Terazi burcu.";
                } else {
                    isError = true;
                }
                break;


            case 10:
                if (month == 10) {
                    if (day <= 22)
                        burc = "Terazi burcu.";
                    else
                        burc = "Akrep burcu.";
                } else {
                    isError = true;
                }
                break;

            case 11:
                if (month == 11) {
                    if (day <= 21)
                        burc = "Akrep burcu.";
                    else
                        burc = "Yay burcu.";
                } else {
                    isError = true;
                }
                break;


            case 12:
                if (month == 12) {
                    if (day <= 21)
                        burc = "Yay burcu.";
                    else
                        burc = "Oğlak burcu.";
                } else {
                    isError = true;
                }
                break;

            default:
                System.out.print("Hatalı girdiniz, tekrar deneyiniz.");
                break;
        }
                    System.out.print("Burcunuz" +burc);
        }
    }


