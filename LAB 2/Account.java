
package accountlist;



    public class Account  {

        double sotien;
        int sotk;
        String tentk;
        String trangthai;

        public Account(double sotien, int sotk, String tentk, String trangthai) {
            this.sotien = sotien;
            this.sotk = sotk;
            this.tentk = tentk;
            this.trangthai = trangthai;
        }

        public double getSoten() {
            return sotien;
        }

        public void setSotien(double sotien) {
            if (sotien >= 50) {
                this.sotien = sotien;
            } else {
                this.sotien = 0;
            }
        }

        public int getSotk() {
            return sotk;
        }

        public void setSotk(int Sotk) {
            if (Sotk > 0 && Sotk != 0) {
                this.sotk = sotk;
            } else {
                this.sotien = 0;
            }
        }

        public String gettentk() {
            return tentk;
        }

        public void settentk(String tentk) {
            if (tentk != null) {
                this.tentk = tentk;
            } else {
                this.tentk = "khong thay";
            }
        }

        public String getTrangthai() {
            return trangthai;
        }

        public void setTrangthai(String trangthai) {
            if (sotien >= 50 && sotk > 0 && sotk != 0 && tentk != null) {
                this.trangthai = "hople";
            } else {
                this.trangthai = "dellhople";
            }
        }

        @Override
        public String toString() {
            return "Account{" + "sotien=" + sotien + ", sotk=" + sotk + ", tentk=" + tentk + ", trangthai=" + trangthai + '}';
        }

        public void naptienvaotk(double sotiennapvao) {
            double tiennapvao = sotien + sotiennapvao;
            System.out.println("S\u00d3 ti\u1ec1n \u0111\u00e3 n\u1ea1p l\u00e0" + tiennapvao);
        }

        public void ruttientk(double sotienrut) {
            double tienrut = sotien - sotienrut;
            System.out.println("S\u00d3 ti\u1ec1n r\u00fat l\u00e0" + tienrut);
        }

        public void chuyenkhoan(double tienchuyenkhoan) {
            double chuyenkhoandi = sotien - tienchuyenkhoan;
            System.out.println("" + chuyenkhoandi);
            double chuyenkhoanvao = sotien - tienchuyenkhoan;
            System.out.println("so tien nhan la" + chuyenkhoandi);
        }

        public void quahan(double sodu, double laixuat) {
            double sodutk = sodu + sodu * laixuat;
            System.out.println("so tien dao han la" + sodutk);
        }
    }
    

