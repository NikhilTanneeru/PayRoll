class Emp
{
    int id;
    String name;
    int pass;
    double basic;
    double gross;
    double bonus;
    double dA_hra;

    Emp(int id , String name , int pass)
    {
        this.id=id;
        this.name=name;
        this.pass=pass;
    }
    public String toString()
    {
        return("Name:"+name+"\n"+"ID:"+id+"\n"+"Password:"+pass+"\n"+"Gross:"+gross+"\n");
    }

}
