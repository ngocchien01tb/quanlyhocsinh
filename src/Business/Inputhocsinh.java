package Business;

import DataAccess.Monhoc;
import DataAccess.Nguoi;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Inputhocsinh {
    public static ArrayList<Nguoi> nguoiArrayList = new ArrayList<>();
    public static Scanner sc= new Scanner(System.in);
    public static void Them(){
        System.out.println(" ----------------------------------------------------------");
        System.out.println("|                Nhập thông tin học sinh                   |");
        System.out.println(" ----------------------------------------------------------");
        System.out.print("|         Nhập mã học sinh: ");
        String Mahs="";
        do {
            Mahs=sc.nextLine();
        }while (Mahs.equalsIgnoreCase(""));
        System.out.print("|         Nhập họ tên: ");
        String Hoten=sc.nextLine();
        System.out.print("|         Nhập giới tính: ");
        String Gioitinh=sc.nextLine();
        System.out.print("|         Nhập lớp học: ");
        String Lop=sc.nextLine();
        System.out.print("|         Nhập ngày sinh: ");
        String Ngaysinh=sc.nextLine();
        System.out.print("|         Nhập dân tộc: ");
        String Dantoc=sc.nextLine();
        System.out.print("|         Nhập địa chỉ: ");
        String Diachi=sc.nextLine();
        System.out.println(" ----------------------------------------------------------");
        Nguoi ng=new Nguoi(Mahs,Hoten,Gioitinh,Lop,Ngaysinh,Dantoc,Diachi);
        nguoiArrayList.add(ng);
    }
    public static void Hien1hs(Nguoi ng)
    {
        System.out.printf("%20s %25s %10s %15s %10s %30s \n",ng.getMahs(),ng.getHoten(),ng.getLop(),ng.getNgaysinh(),ng.getDantoc(),ng.getDiachi());
    }
    public static void Tim(String ma)
    {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%20s %25s %10s %15s %10s %30s \n","Mã","Họ tên","Lớp","Ngày sinh","Dân tộc","Địa chỉ");
        for (Nguoi ng:
             nguoiArrayList) {
            if(ng.getMahs().equalsIgnoreCase(ma))
            {
                Hien1hs(ng);
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
    }
    public static void Hien()
    {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%20s %25s %10s %15s %10s %30s \n","Mã","Họ tên","Lớp","Ngày sinh","Dân tộc","Địa chỉ");
        for (Nguoi ng:
             nguoiArrayList) {
            Hien1hs(ng);
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
    }
    public static void Xoa(String Ma)
    {
        for(int i=0;i<nguoiArrayList.size();i++)
        {
            if(Ma.equalsIgnoreCase(nguoiArrayList.get(i).getMahs()))
            {
                nguoiArrayList.remove(i);
            }
        }
    }
    public static void Sua(String Ma)
    {
        System.out.println(" ----------------------------------------------------------");
        System.out.println("|                 Sửa thông tin học sinh                   |");
        System.out.println(" ----------------------------------------------------------");
        for (Nguoi ng:
             nguoiArrayList) {
            if(ng.getMahs().equalsIgnoreCase(Ma))
            {
                System.out.print("|         Sửa mã học sinh: ");
                ng.setMahs(sc.nextLine());
                System.out.print("|         Sửa họ tên: ");
                ng.setHoten(sc.nextLine());
                System.out.print("|         Sửa lớp: ");
                ng.setLop(sc.nextLine());
                System.out.print("|         Sửa ngày sinh: ");
                ng.setNgaysinh(sc.nextLine());
                System.out.print("|         Sửa dân tộc: ");
                ng.setDantoc(sc.nextLine());
                System.out.print("|         Sửa địa chỉ: ");
                ng.setDiachi(sc.nextLine());
                System.out.println(" ----------------------------------------------------------");
                break;
            }
        }
    }
    public static void Luu() throws IOException {
        File file = new File("Hocsinh.txt");
        if(!file.exists())
        {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        for(Nguoi ng: nguoiArrayList)
        {
            fileOutputStream.write(ng.toString().getBytes());
            fileOutputStream.write("\n".getBytes());

        }
    }
    public static void Doc()
    {
        try {
            File file = new File("Hocsinh.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null)
            {
                String Mamh=line.split("#")[0];
                String hoten=line.split("#")[1];
                String gioitinh=line.split("#")[2];
                String lop=line.split("#")[3];
                String ngaysinh=line.split("#")[4];
                String dantoc=line.split("#")[5];
                String diachi=line.split("#")[6];
                Nguoi ng=new Nguoi(Mamh,hoten,gioitinh,lop,ngaysinh,dantoc,diachi);
                nguoiArrayList.add(ng);
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
