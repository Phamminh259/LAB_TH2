
public class CD {
    
    private int maCD;
    private String tenCD;
    private String caSy;
    private int soBH;
    private float giaThanh;
   
    public CD() {
    }
   
    public CD(int cD, String tenCD, String caSy, int soBH, float giaThanh) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.caSy = caSy;
        this.soBH = soBH;
        this.giaThanh = giaThanh;
    }
    //------------begin getter and setter--------------
    public int getMaCD() {
        return maCD;
    }
 
    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }
 
    public String getTenCD() {
        return tenCD;
    }
 
    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }
 
    public String getCaSy() {
        return caSy;
    }
 
    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }
 
    public int getSoBH() {
        return soBH;
    }
 
    public void setSoBH(int soBH) {
        this.soBH = soBH;
    }
 
    public float getGiaThanh() {
        return giaThanh;
    }
 
    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }

    @Override
    public String toString() {
        return "CD{" + "maCD=" + maCD + ", tenCD=" + tenCD + ", caSy=" + caSy + ", soBH=" + soBH + ", giaThanh=" + giaThanh + '}';
    }
    
    public void hienThiAlbum(){
        System.out.printf("%-10d %-20s %-20s %-10d %-20.1f \n",maCD,tenCD,caSy,soBH,giaThanh);
    }
    
    public void nhap(scanner sc){
        System.out.println("Nhap ma CD : ");
        maCD= sc.nextInt();
        System.out.println("Nhap ten CD : ");
        tenCD= sc.nextString();
        System.out.println("Nhap ten ca si : ");
        caSy= sc.nextString();
        System.out.println("Nhap so BH : ");
        soBH= sc.nextInt();
        System.out.println("Nhap gia thanh : ");
        giaThanh= sc.nextInt();
    }

    private static class scanner {

        public scanner() {
        }

        private int nextInt() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String nextString() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
    public void xuat(){
        System.out.println("Ma CD : "+maCD);
        System.out.println("Ten CD : "+tenCD);
        System.out.println("Ten ca si : "+caSy);
        System.out.println("So BH : "+soBH);
        System.out.println("Gia thanh : "+giaThanh);
    }
}
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static void nhapCD(CD cd) {
        System.out.print("Nhập mã CD: ");
        cd.setMaCD(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập tên CD : ");
        cd.setTenCD(sc.nextLine());
        System.out.print("Nhập tên ca sĩ : ");
        cd.setCaSy(sc.nextLine());
        System.out.print("Nhập số lượng bài hát : ");
        cd.setSoBH(sc.nextInt());
        System.out.print("Nhập giá thành : ");
        cd.setGiaThanh(sc.nextFloat());
    }
    public static void main(String[] args) {
        CD cd[] = null;
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.println("Bạn chọn làm gì?");
            System.out.println("""
                               1.Nhap thong tin CD 
                               2.Xuat danh sach Album
                               3.T\u00ednh t\u1ed5ng gi\u00e1 th\u00e0nh 
                               4.T\u1ed5ng s\u1ed1 l\u01b0\u1ee3ng CD 
                               5.S\u1eafp x\u1ebfp gi\u1ea3m d\u1ea7n theo gi\u00e1 th\u00e0nh
                               6.S\u1eafp x\u1ebfp t\u0103ng d\u1ea7n theo t\u1ef1a CD
                               Nh\u1eadp s\u1ed1 kh\u00e1c \u0111\u1ec3 tho\u00e1t""");
            a = sc.nextInt();
            switch (a) {
                case 1 -> {
                    System.out.println("Nhập số lượng CD : ");
                    n = sc.nextInt();
                    cd = new CD[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("CD thứ " + (i + 1)+": ");
                        cd[i] = new CD();
                        nhapCD(cd[i]);
                    }
                }
                case 2 -> {
                    System.out.printf("%-10s %-20s %-20s %-10s %-20s \n", "Mã CD", "Tên CD", "Tên ca sỹ", "Số bài hát", "Giá thành");
                    for (int i = 0; i < n; i++) {
                        cd[i].hienThiAlbum();
                    }
                }
                case 3 -> {
                    int tong = 0;
                    for (int i = 0; i < n; i++) {
                        tong += cd[i].getGiaThanh();
                    }
                    System.out.println("" +
                            "Tổng giá thành là : " + tong);
                }
                case 4 -> System.out.println("Tổng số lượng CD là : " + n);
                case 5 -> {
                    CD temp = cd[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (cd[i].getGiaThanh() < cd[j].getGiaThanh()) {
                                temp = cd[j];
                                cd[j] = cd[i];
                                cd[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sắp xếp thành công, Nhập số 2 để kiểm tra!");
                }
                case 6 -> {
                    CD temp = cd[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (cd[i].getTenCD().compareTo(cd[j].getTenCD())>0) {
                                temp = cd[j];
                                cd[j] = cd[i];
                                cd[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sắp xếp thành công, Nhập số 2 để kiểm tra!");
                }
                default -> {
                    System.out.println("Goodbye");
                    flag = false;
                }
            }
        }while (flag) ;
    }
}
