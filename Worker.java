class Worker extends Person {
    int rank;
    public Worker(String name, int age,String sex, int rank){
        super(name,age,sex);
        this.rank = rank;
    }
    public void setRank(int rank){
        if(rank >= 1 && rank <=10){
            this.rank = rank;
        }   
    }
    public int getRank(){
        return this.rank;
    }

    public void getInfo(){
    super.getInfo();
    System.out.println("cap bac la : "+ this.rank);
}
}

    

    

