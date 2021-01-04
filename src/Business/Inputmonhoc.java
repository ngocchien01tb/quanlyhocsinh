package Business;

import DataAccess.Monhoc;
import DataAccess.Nguoi;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Inputmonhoc {
    public static ArrayList<Monhoc> monhocs=new ArrayList<>();
    public static Scanner scn=new Scanner(System.in);
    public static void Them()
    {
        System.out.println(" ----------------------------------------------------------");
        System.out.println("|                Nhập điểm học sinh                        |");
        System.out.println(" ----------------------------------------------------------");
        System.out.print("|       Nhập mã học sinh nhập điểm: ");
        String mahs= scn.nextLine();
        boolean kt=false;
        for (Nguoi ng:
             Inputhocsinh.nguoiArrayList) {
            if(mahs.equalsIgnoreCase(ng.getMahs()))
            {
                kt=true;
                break;
            }
        }
        if(kt)
        {
            System.out.print("|       Nhập điểm môn toán: ");
            double toan=Double.parseDouble(scn.nextLine());
            System.out.print("|       Nhập điểm môn lý: ");
            double ly=Double.parseDouble(scn.nextLine());
            System.out.print("|       Nhập điểm môn hóa: ");
            double hoa=Double.parseDouble(scn.nextLine());
            System.out.print("|       Nhập điểm môn văn: ");
            double van=Double.parseDouble(scn.nextLine());
            System.out.print("|       Nhập điểm môn anh: ");
            double anh=Double.parseDouble(scn.nextLine());
            System.out.print("|       Nhập điểm môn sinh: ");
            double sinh=Double.parseDouble(scn.nextLine());
            System.out.print("|       Nhập điểm môn sử: ");
            double su=Double.parseDouble(scn.nextLine());
            System.out.print("|       Nhập điểm môn gdcd: ");
            double gdcd=Double.parseDouble(scn.nextLine());
            System.out.print("|       Nhập điểm môn địa: ");
            double dia=Double.parseDouble(scn.nextLine());
            System.out.println(" ----------------------------------------------------------");
            Monhoc mh=new Monhoc(mahs,toan,ly,hoa,van,anh,sinh,su,gdcd,dia);
            monhocs.add(mh);
        }
        else
        {
            System.out.println("-----------Không có học sinh có mã bạn vừa nhập------------");
        }

    }
    public static void Hien()
    {
        System.out.println(" -------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%20s %25s %10s %10s %10s %10s %10s %10s %10s %10s %10s %20s\n","Ma HS","Ten HS","Đ Toán","Đ Lý","Đ Hóa","Đ Văn","Đ Anh","Đ Sinh","Đ Sử","Đ Địa","Đ GDCD","Điểm TB");
        for (int i = 0; i < monhocs.size(); i++) {
            for (Nguoi ng:
                 Inputhocsinh.nguoiArrayList) {
                if(monhocs.get(i).getMahs().equalsIgnoreCase(ng.getMahs()))
                {
                    System.out.printf("%20s %25s %10s %10s %10s %10s %10s %10s %10s %10s %10s %20s\n",monhocs.get(i).getMahs(),ng.getHoten(),monhocs.get(i).getToan(),monhocs.get(i).getLy(),monhocs.get(i).getHoa(),monhocs.get(i).getVan(),monhocs.get(i).getAnh(),monhocs.get(i).getSinh(),monhocs.get(i).getSu(),monhocs.get(i).getDia(),monhocs.get(i).getGdcd(),monhocs.get(i).diemTB());
                }
            }
        }
        System.out.println(" -------------------------------------------------------------------------------------------------------------------");
    }
    public static void Tradiem(String ma)
    {
        System.out.println(" ----------------------------------------------------------------------------------------------------------------");
        System.out.printf("%20s %25s %10s %10s %10s %10s %10s %10s %10s %10s %10s %20s\n","Ma HS","Ten HS","Đ Toán","Đ Lý","Đ Hóa","Đ Văn","Đ Anh","Đ Sinh","Đ Sử","Đ Địa","Đ GDCD","Điểm TB");
        boolean kt=false;
        for (int i = 0; i < monhocs.size(); i++) {
            if(monhocs.get(i).getMahs().equalsIgnoreCase(ma))
            {
                kt=true;
                if(kt)
                {
                    for (Nguoi ng:
                            Inputhocsinh.nguoiArrayList) {
                        if(monhocs.get(i).getMahs().equalsIgnoreCase(ng.getMahs()))
                        {
                            System.out.printf("%20s %25s %10s %10s %10s %10s %10s %10s %10s %10s %10s %20s\n",monhocs.get(i).getMahs(),ng.getHoten(),monhocs.get(i).getToan(),monhocs.get(i).getLy(),monhocs.get(i).getHoa(),monhocs.get(i).getVan(),monhocs.get(i).getAnh(),monhocs.get(i).getSinh(),monhocs.get(i).getSu(),monhocs.get(i).getDia(),monhocs.get(i).getGdcd(),monhocs.get(i).diemTB());
                            break;
                        }
                    }
                    break;
                }
            }
        }
        System.out.println(" ----------------------------------------------------------------------------------------------------------------");
    }
    public static void HienHSG()
    {
        System.out.println(" ----------------------------------------------------------------------------------------------------------------");
        System.out.printf("%20s %25s %10s %10s %10s %10s %10s %10s %10s %10s %10s %20s\n","Ma HS","Ten HS","Đ Toán","Đ Lý","Đ Hóa","Đ Văn","Đ Anh","Đ Sinh","Đ Sử","Đ Địa","Đ GDCD","Điểm TB");
        for (int i = 0; i < monhocs.size(); i++) {
            if(monhocs.get(i).diemTB()>=8)
            {
                for (Nguoi ng:
                        Inputhocsinh.nguoiArrayList) {
                    if(monhocs.get(i).getMahs().equalsIgnoreCase(ng.getMahs()))
                    {
                        System.out.printf("%20s %25s %10s %10s %10s %10s %10s %10s %10s %10s %10s %20s\n",monhocs.get(i).getMahs(),ng.getHoten(),monhocs.get(i).getToan(),monhocs.get(i).getLy(),monhocs.get(i).getHoa(),monhocs.get(i).getVan(),monhocs.get(i).getAnh(),monhocs.get(i).getSinh(),monhocs.get(i).getSu(),monhocs.get(i).getDia(),monhocs.get(i).getGdcd(),monhocs.get(i).diemTB());
                        break;
                    }
                }
            }
        }
        System.out.println(" ----------------------------------------------------------------------------------------------------------------");
    }
    public static int Thongketruot()
    {
        int dem=0;
        for (int i = 0; i < monhocs.size(); i++){
            if(monhocs.get(i).diemTB()<5)
            {
                dem++;
            }
        }
        return dem;
    }
    public static int Thongkehsg()
    {
        int dem=0;
        for (int i = 0; i < monhocs.size(); i++){
            if(monhocs.get(i).diemTB()>=8)
            {
                dem++;
            }
        }
        return dem;
    }
    public static void Hienhoclai()
    {
        System.out.println(" ----------------------------------------------------------------------------------------------------------------");
        System.out.printf("%20s %25s %10s %10s %10s %10s %10s %10s %10s %10s %10s %20s\n","Ma HS","Ten HS","Đ Toán","Đ Lý","Đ Hóa","Đ Văn","Đ Anh","Đ Sinh","Đ Sử","Đ Địa","Đ GDCD","Điểm TB");
        for (int i = 0; i < monhocs.size(); i++) {
            if(monhocs.get(i).diemTB()<5)
            {
                for (Nguoi ng:
                        Inputhocsinh.nguoiArrayList) {
                    if(monhocs.get(i).getMahs().equalsIgnoreCase(ng.getMahs()))
                    {
                        System.out.printf("%20s %25s %10s %10s %10s %10s %10s %10s %10s %10s %10s %20s\n",monhocs.get(i).getMahs(),ng.getHoten(),monhocs.get(i).getToan(),monhocs.get(i).getLy(),monhocs.get(i).getHoa(),monhocs.get(i).getVan(),monhocs.get(i).getAnh(),monhocs.get(i).getSinh(),monhocs.get(i).getSu(),monhocs.get(i).getDia(),monhocs.get(i).getGdcd(),monhocs.get(i).diemTB());
                        break;
                    }
                }
            }
        }
        System.out.println(" ----------------------------------------------------------------------------------------------------------------");
    }
    public static void Xoa(String ma)
    {
        for (int i = 0; i < monhocs.size(); i++) {
            if(monhocs.get(i).getMahs().equalsIgnoreCase(ma))
            {
                monhocs.remove(i);
            }
        }
    }
    public static void Luu() throws IOException {
        File file = new File("Monhoc.txt");
        if(!file.exists())
        {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        for(Monhoc mh: monhocs)
        {
            fileOutputStream.write(mh.toString().getBytes());
            fileOutputStream.write("\n".getBytes());

        }
    }
    public static void Doc()
    {
        try {
            File file = new File("Monhoc.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null)
            {
                String Mamh=line.split("#")[0];
                double toan=Double.parseDouble(line.split("#")[1]);
                double ly=Double.parseDouble(line.split("#")[2]);
                double hoa=Double.parseDouble(line.split("#")[3]);
                double van=Double.parseDouble(line.split("#")[4]);
                double anh=Double.parseDouble(line.split("#")[5]);
                double sinh=Double.parseDouble(line.split("#")[6]);
                double su=Double.parseDouble(line.split("#")[7]);
                double gdcd=Double.parseDouble(line.split("#")[8]);
                double dia=Double.parseDouble(line.split("#")[9]);
                Monhoc mh =new Monhoc(Mamh,toan,ly,hoa,van,anh,sinh,su,gdcd,dia);
                monhocs.add(mh);


            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
