class Encapsulation{

    private String name;
    private int rollno;
    
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setRollno(int rollno){
        this.rollno=rollno;
    }

    public int getRollno(){
        return rollno;
    }
    public static void main(String[] args){
        Encapsulation s= new Encapsulation();
        s.setName("Ram");
        s.setRollno(2);

        System.out.println(s.getName());
        
        System.out.println(s.getRollno());
}
}