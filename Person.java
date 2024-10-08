public class Person {
    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void setName(String name){
        if(name != null){
            this.name = name;
        }   
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }   
    }
    public int getAge(){
        return this.age;
    }
    public void setSex(String sex){
        if(sex != null){
            this.sex = sex;
        }   
    }
    public String getSex(){
        return this.sex;
    }
    public void getInfo(){
        System.out.println("Ho va ten : " + this.name);
        System.out.println("Tuoi :  : " + this.age);
        System.out.println("Gioi tinh : " + this.sex);

    }
}