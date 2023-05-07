import java.util.Scanner;

public class  {

    public static void main(String[] args) {
        System.out.println("nhap so phan tu mang");
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        ListTK ds=new ListTK(n);
        
        while(true){
            System.out.println("0.thoat");
            System.out.println("1.them");
            System.out.println("2.xuat");
            System.out.println("3.tim kiem");
            System.out.println("4.so luong tai khoan da ton tai");
            System.out.println("5.xoa");
            System.out.println("6.nap tien vao tai khoan");            
            System.out.println("7.rut tien vao tai khoan");
            System.out.println("8.Chuyen tien ");

            int luachon;
            System.out.println("nhap lua chon");
            luachon=sc.nextInt();
            if(luachon==0){
                break;
            } else if(luachon==1)
            {
                ds.themTK(n);
                
            } else if(luachon==2){
                ds.xuatDS();
            }
            else if(luachon==3){
                System.out.println("nhap so tk can tim kiem");
                int a=sc.nextInt();
                ds.timKiem(a);
            }
            else if(luachon==4){
                System.out.println("so luong tai khoan ton tai:"+ds.count);
            }
            else if(luachon==5){
                System.out.println("nhap so tai khoan can xoa");
                int a=sc.nextInt();
                ds.xoa(a);
            }
            else if(luachon==6){
                System.out.println("nhap so tai khoan can nap tien");
                int a=sc.nextInt();
                System.out.println("nhap so tien can nap ");
                double b=sc.nextDouble();
                for(int i=0;i<ds.count;i++){
                    if(ds.list[i].getSoTK()==a){
                        ds.list[i].napTien(b);
                    } else {
                        System.out.println("so tai khoan khong ton tai");}
                }
                
            }
            else if(luachon==7){
                System.out.println("nhap so tai khoan can rut tien");
                int a=sc.nextInt();
                System.out.println("nhap so tien can rut ");
                double b=sc.nextDouble();
                for(int i=0;i<ds.count;i++){
                    if(ds.list[i].getSoTK()==a){
                        ds.list[i].rutTien(b);
                    } 
                    
                    else{
                        System.out.println("so tai khoan khong ton tai");}
                }
            }
            else if(luachon==8){
                System.out.println("nhap so tai khoan can  nguoi chuyen ");
                int a=sc.nextInt();
                System.out.println("nhap so tai khoan can  nguoi nhan ");
                int c=sc.nextInt();
                System.out.println("nhap so tien can chuyen ");
                int b=sc.nextInt();
                int d = 0,f=0;
                for(int i=0;i<ds.count;i++){
                    if(ds.list[i].getSoTK()==a){
                        d=i;
                    } else  if(ds.list[i].getSoTK()==c)
                    {
                        f=i;
                    } else
                        System.out.println("so tai khoan khong ton tai");
                }
                ds.chuyenTien(ds.list[d], ds.list[f], b);
            }
          
              
                
            
        }
        
        
    }
}
