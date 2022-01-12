import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int month, day;
        String burc = " ";
        boolean isError = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Dogdugunuz ay : ");
        month = sc.nextInt();

        System.out.print("Dogdugunuz gun : ");
        day = sc.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Oglak";

                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        burc = "Kova";
                    } else {
                        burc = "Balik";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        burc = "Balik";
                    } else {
                        burc = "Koc";
                    }
                } else {
                    isError = true;
                }
                break;
            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        burc = "Koc";
                    } else {
                        burc = "Boga";
                    }
                } else {
                    isError = true;
                }
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        burc = "Boga";
                    } else {
                        burc = "Ikizler";
                    }
                } else {
                    isError = true;
                }
                break;
            case 6:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "Ikizler";
                    } else {
                        burc = "Yengec";
                    }
                } else {
                    isError = true;
                }
                break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Yengec";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    isError = true;
                }
                break;
            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Aslan";
                    } else {
                        burc = "Basak";
                    }
                } else {
                    isError = true;
                }
                break;
            case 9:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "Basak";
                    } else {
                        burc = "Terazi";
                    }
                } else {
                    isError = true;
                }
                break;
            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                } else {
                    isError = true;
                }
                break;
            case 11:
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                } else {
                    isError = true;
                }
                break;
            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Yay";
                    } else {
                        burc = "Oglak";
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
        }
        System.out.println("-----------");
        System.out.println("Switch case ile burc bulma");
        if (isError) {
            System.out.println("Hatali giris yaptiniz, tekrar deneyiniz.");
        } else {
            System.out.println("Burcunuz : " + burc);
        }
        System.out.println("------------");
        System.out.println("If else ile burc bulma");
        String kontrol=(day>31)?"Hatali giris yaptiniz, tekrar deneyiniz.":"Burcunuz : " + burc;

        if (month == 1 && day >= 22 && day <= 31) {
            burc="Kova";
        }else if (month == 1 && day >= 1 && day < 22) {
            burc="Oglak";
        }
        if (month == 2 && day >= 20 && day <= 28) {
            burc="Balik";
        }else if (month == 2 && day >= 1 && day < 20) {
            burc="Kova";
        }
        if (month == 3 && day >= 21 && day <= 31) {
            burc="Koc";
        }else if (month == 3 && day >= 1 && day < 21) {
            burc="Balik";
        }
        if (month == 4 && day >= 21 && day <= 30) {
            burc="Boga";
        }else if (month == 4 && day >= 1 && day < 21) {
            burc="Koc";
        }
        if (month == 5 && day >= 22 && day <= 31) {
            burc="Ikizler";
        }else if (month == 5 && day >= 1 && day < 22) {
            burc="Boga";
            System.out.println("Boga burcu");
        }
        if (month == 6 && day >= 23 && day <= 30) {
            burc="Yengec";
        }else if (month == 6 && day >= 1 && day < 23) {
            burc="Ikizler";
        }
        if (month == 7 && day >= 23 && day <= 31) {
            burc="Aslan";
        }else if (month == 7 && day >= 1 && day < 23) {
            burc="Yengec";
        }
        if (month == 8 && day >= 23 && day <= 31) {
            burc="Basak";
        }else if (month == 8 && day >= 1 && day < 23) {
            burc="Aslan";
        }
        if (month == 9 && day >= 23 && day <= 30) {
            burc="Terazi";
        }else if (month == 9 && day >= 1 && day < 23) {
            burc="Basak";
        }
        if (month == 10 && day >= 23 & day <= 31) {
            burc="Akrep";
        }else if (month == 10 && day >= 1 && day < 23) {
            burc="Terazi";
        }
        if (month == 11 && day >= 22 && day <= 30) {
            burc="Yay";
        }else if (month == 11 && day >= 1 && day < 22) {
            burc="Akrep";
        }
        if (month == 12 && day >= 22 && day <= 31) {
            burc="Oglak";
        }else if (month == 12 && day >= 1 && day < 22) {
            burc="Yay";
        }
        System.out.println(kontrol);
    }
}
