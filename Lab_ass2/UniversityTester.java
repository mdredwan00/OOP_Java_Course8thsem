public class UniversityTester{
    public static void main(String[] args){
        University un1 = new University();
        University un2 = new University();
        System.out.println("Location of Un1:"+ un1);
        System.out.println("Location of Un2:"+ un2);
        System.out.println("instance val for u1"+un1.name+",and for u1 country:"+un1.country);
        System.out.println("instance val for u1"+un2.name+",and for u1 country:"+un2.country);
        System.out.println("Are u1 and u2 refering to the same object:" + (un1 == un2));


        un1.name = "Imperial college London";
        un1.country = "England";
        System.out.println("Name:"+un1.name+",Country:"+un1.country);
        un2.name = "Northern university Bangladesh";
        un2.country = "Bangladesh";
        System.out.println("Name"+un2.name+",Country:"+un2.country);

    }
}