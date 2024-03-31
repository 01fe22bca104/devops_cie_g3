public class Devops_engineer extends Employee {
    public float bonus=7000;
    public void add_bonus()
    {
        salary+=bonus;
        System.out.println("Incremented salary"+salary);

    }
    public static void main(String[] args) {
        Devops_engineer d=new Devops_engineer();
        d.display_details();
        d.add_bonus();
    }
}
