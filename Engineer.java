class Engineer extends Person {
    String major;
    public Engineer(String name, int age,String sex,String major){
        super(name,age,sex);
        this.major = major;
    }
    public void setMajor(String major){
        if(major != null){
            this.major = major;
        }   
    }
    public String getMajor(){
        return this.major;
    }
    public void getInfo(){
        super.getInfo();
        System.out.println("chuyen nganh la : "+ this.major);
    }
}
    

