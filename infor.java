package tdc.edu.doancanhan;



import java.io.Serializable;

public class infor implements Serializable {
        private  String sanpham;
        private  String khachhang;
        private  String hoten;
        private String diachi;
        private int hinh;

    public String getSanpham() {
        return sanpham;
    }

    public void setSanpham(String sanpham) {
        this.sanpham = sanpham;
    }

    public String getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(String khachhang) {
        this.khachhang = khachhang;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    @Override
    public String toString() {
        return "infor{" +
                "sanpham='" + sanpham + '\'' +
                ", khachhang='" + khachhang + '\'' +
                ", hoten='" + hoten + '\'' +
                ", diachi='" + diachi + '\'' +
                ", hinh=" + hinh +
                '}';
    }}

