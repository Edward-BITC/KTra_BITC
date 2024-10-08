
import java.util.ArrayList;
import java.util.Scanner;

public class QLNL{
    private ArrayList dsnl;
    String name;
    int age;
    String sex;
    public QLNL(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        dsnl = new ArrayList();
    }
    public void AddNewPerson(Scanner sc){
        System.out.println("Nhap ten : ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Nhap tuoi : ");
        age = sc.nextInt();
        System.out.println("Nhap gioi tinh : ");
        sc.nextLine();
        sex = sc.nextLine();
    }
    public void FindName(String name){

    }
}
