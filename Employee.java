class Employee extends Person {
    String job;
    public Employee(String name, int age,String sex,String job){
        super(name,age,sex);
        this.job = job;
    }
    public void setJob(String job){
        if(job != null){
            this.job = job;
        }   
    }
    public String getJob(){
        return this.job;
    }
        public void getInfo(){
        super.getInfo();
        System.out.println("cong viec la : "+ this.job);
    }
    
}
