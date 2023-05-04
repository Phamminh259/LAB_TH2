
package accountlist;


import java.util.ArrayList;
import java.util.Scanner;
public class AccountList {
    ArrayList <Account> acc ;
    int count ;
    public AccountList() {
        acc = new ArrayList<Account>(10);
        count = 0;
    }
    public AccountList(int n){
        if (n > 0) {
            acc = new ArrayList<Account>(n);
        } else {
            acc = new ArrayList<Account>(10);
            count = 0;
        }
    }
    public void themTK(Account a) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap so luong can them :"); 
        int n = sc.nextInt();
        for (int i = 1; i<= n; i++){
            System.out.println("Lan nhap thu " + i);
            a = new Account();
            Scanner b = new Scanner(System.in);
            System.out.println("Nhap so tai khoan: ");
            long sotk = b.nextLong();
            a.setsotk(sotk);
            b.nextLine();
            System.out.println("Nhap ten tai khoan: ");
            String tentk = b.nextLine();
            a.settentk(tentk);
            System.out.println("Nhap so tien: ");
            double sotien = b.nextDouble();
            a.setsotien(sotien);
            acc.add(a);
        }
    }
    public void timTK(long soTK) {
        for (int i = 0; i < count; i++) {
            if (acc.get(i).getsotk() == soTK) {
                System.out.println(acc.get(i).toString());
            }
        }
    }
    public void xoaTK(long soTK) {
        System.out.println("Nhap so tai khoan can xoa: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (acc.get(i).getsotk() == soTK) {
                acc.remove(i);
                count--;
                System.out.println("Da xoa thanh cong");
            }
        }
    }
    public int demTK() {
        return acc.size();
    }
    public void inTK() {
        for (Account a : acc) {
            System.out.println(a.toString());
        }
    }
    public void napTien() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap so tai khoan can nap tien: ");
        long soTK = sc.nextLong();
        System.out.println("Nhap so tien can nap: ");
        double soTien = 0;
        do {
            soTien = sc.nextDouble();
            if (soTien <= 0) {
                System.out.println("So tien khong hop le, vui long nhap lai: ");
            }
        } while (soTien <= 0);
        for (int i = 0; i < acc.size(); i++) {
            Account a = acc.get(i);
            if (a.getsotk() == soTK) {
                a.setsotien(a.getsotien() + soTien);
                System.out.println("Da nap tien thanh cong");
            } else if (a.getsotk() != soTK) {System.out.println("Khong tim thay STK nay !");
        }

        }
        
    }
    public void rutTien(){
        Scanner c = new Scanner(System.in);
        System.out.println("Nhap so tai khoan can rut tien: ");
        long soTK = c.nextLong();
        System.out.println("Nhap so tien can rut: ");
        double soTien = 0;
        do {
            soTien = c.nextDouble();
            if (soTien <= 0) {
                System.out.println("So tien khong hop le, vui long nhap lai: ");
            }
        } while (soTien <= 0);
        for ( int i = 0; i < acc.size(); i++){
            Account a = acc.get(i);
            if (a.getsotien() == soTK){
                if (a.getsotien() >= soTien){
                    a.setsotien(a.getsotien() - soTien);
                    System.out.println("Da rut tien thanh cong");
                } else {
                    System.out.println("So tien khong du de rut");
                }
            }
            else if (a.getsotk() != soTK) {
                System.out.println("Khong tim thay STK nay !");
            }
        }
        
    }
    public void chuyenTien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tai khoan can chuyen: ");
        long soTK = sc.nextLong();
        System.out.println("Nhap so tien can chuyen: ");
        double soTien = sc.nextDouble();
        System.out.println("Nhap so tai khoan nhan: ");
        long soTKNhan = sc.nextLong();
        do {
            if (soTien <= 0) {
                System.out.println("So tien khong hop le, vui long nhap lai: ");
            }
        } while (soTien <= 0);
        for ( int i = 0; i < acc.size() ; i++){
            Account a = acc.get(i);
            if (a.getsotk() == soTK){
                if (a.getsotien() >= soTien){
                    a.setsotien(a.getsotien() - soTien);
                    System.out.println("Da chuyen tien thanh cong");
                }
            }
        }
        for ( int i = 0; i < acc.size() ; i++){
            Account a = acc.get(i);
            if (a.getsotk() == soTKNhan){
                a.setsotien(a.getsotien() + soTien);
                return;
            }
            else if (a.getsotk() != soTKNhan) {
                System.out.println("Khong tim thay STK nay !");
            }
        }
       }

    public void menu(){
        System.out.println("\n--------QUAN LY TAI KHOAN--------\n"+
                        "1. Them tai khoan\n"+ // them tai khoan vao danh sach
                        "2. So tai khoan hien co\n"+ // dem so tai khoan hien co
                        "3. In thong tin tai khoan\n"+ // in thong tin tai khoan
                        "4. Nap tien vao tai khoan\n"+ // nap tien vao tai khoan
                        "5. Rut tien tu tai khoan\n"+ // rut tien tu tai khoan
                        "6. Chuyen tien\n"+ // chuyen tien tu tai khoan A sang tai khoan B
                        "7. Thoat\n");
    }

}