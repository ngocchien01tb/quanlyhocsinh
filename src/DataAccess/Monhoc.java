package DataAccess;
public class Monhoc
{

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public double getAnh() {
        return anh;
    }

    public void setAnh(double anh) {
        this.anh = anh;
    }

    public double getSinh() {
        return sinh;
    }

    public void setSinh(double sinh) {
        this.sinh = sinh;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getGdcd() {
        return gdcd;
    }

    public void setGdcd(double gdcd) {
        this.gdcd = gdcd;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }
    private String mahs;

    public String getMahs() {
        return mahs;
    }

    public void setMahs(String mahs) {
        this.mahs = mahs;
    }

    public Monhoc(String mahs, double toan, double ly, double hoa, double van, double anh, double sinh, double su, double gdcd, double dia) {
        this.mahs = mahs;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.van = van;
        this.anh = anh;
        this.sinh = sinh;
        this.su = su;
        this.gdcd = gdcd;
        this.dia = dia;
    }
    public double diemTB()
    {
        return (toan+ly+hoa+van+anh+sinh+su+gdcd+dia)/9.0;
    }
    private double toan;
    private double ly;
    private double hoa;
    private double van;
    private double anh;
    private double sinh;
    private double su;
    private double gdcd;
    private double dia;
    @Override
    public String toString() {
        return mahs+"#"+toan+"#"+ly+"#"+hoa+"#"+van+"#"+anh+"#"+sinh+"#"+su+"#"+gdcd+"#"+dia;
    }
}