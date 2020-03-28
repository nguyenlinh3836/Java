package giftview;
import giftcontroller.GiftController;
import giftmodel.Gift;
import java.util.Scanner;
public class GiftShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Gift gift1 = new Gift();
        GiftController g1 = new GiftController();
        int input;
        do {
            System.out.print("Gift Shop: \n" +
                    "1. print all book.\n" +
                    "2. insert book.\n" +
                    "3. delete book.\n" +
                    "0. Exit\n" +
                    "Choose your action: ");
            input = in.nextInt();
            while ( input<0 || input > 3 ){
                System.out.print("Gift Shop: \n" +
                        "1. print all book.\n" +
                        "2. insert book.\n" +
                        "3. delete book.\n" +
                        "0. Exit\n" +
                        "Choose your action: ");
                input = in.nextInt();
            }
            switch (input) {
                case 1:
                    g1.selectGift(gift1);
                    break;
                case 2:
                    g1.insertGift(gift1);
                    break;
                case 3:
                    g1.deleteGift(gift1);
                    break;
            }
        }while (input != 0);
    }
}
