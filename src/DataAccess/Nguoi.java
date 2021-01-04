package DataAccess;

public class Nguoi {
    private String Mahs;
    private String Hoten;
    private String Gioitinh;
    private String Lop;
    private String Ngaysinh;
    private String Dantoc;
    private String Diachi;

    public Nguoi(String mahs, String hoten, String gioitinh, String lop, String ngaysinh, String dantoc, String diachi) {
        Mahs = mahs;
        Hoten = hoten;
        Gioitinh = gioitinh;
        Lop = lop;
        Ngaysinh = ngaysinh;
        Dantoc = dantoc;
        Diachi = diachi;
    }

    @Override
    public String toString() {
        return Mahs+"#"+Hoten+"#"+Gioitinh+"#"+Lop+"#"+Ngaysinh+"#"+Dantoc+"#"+Diachi;
    }


    public String getMahs() {
        return Mahs;
    }

    public void setMahs(String mahs) {
        Mahs = mahs;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        Gioitinh = gioitinh;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        Ngaysinh = ngaysinh;
    }

    public String getDantoc() {
        return Dantoc;
    }

    public void setDantoc(String dantoc) {
        Dantoc = dantoc;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

}
