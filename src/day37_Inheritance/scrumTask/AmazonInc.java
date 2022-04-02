package day37_Inheritance.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc";

        ProductOwner po = new ProductOwner("Suhaib", 29, 'M',1,160000, company);

        BusinessAnalyst ba = new BusinessAnalyst("Cihad", 30, 'M', 2, 150000, company);

        ScrumMaster sm = new ScrumMaster("Anel", 26, 'F', 3, 145000, company);



        Tester tester1=new Tester("Chinara",32,'F',"QA",1415,125000,company);

        Tester tester2=new Tester("Yasaman",31,'F', "QE",1416,130000,company);

        Tester tester3=new Tester("Irena",29,'F',"SDET",1417,128000,company);

        Tester tester4=new Tester("Cihad",26,'M',"QA",1418,125000,company);
        Tester[] testers={tester1,tester2,tester3,tester4};


        Developer developer1=new Developer("Max", 40, 'M', "Senior Java Developer", 3665, 180000, company);
        Developer developer2=new Developer("Allison", 18, 'F', "Junior Java Developer", 364, 120000, company);
        Developer developer3=new Developer("Tom", 26, 'M', "Java Developer", 3654, 140000, company);
        Developer developer4=new Developer("Manas", 40, 'M', "Full Stack Developer", 6568, 280000, company);
        Developer developer5=new Developer("Evelyn", 30, 'F', "JS Developer", 788, 160000, company);
        Developer[] developers={developer1,developer2,developer3,developer4,developer5};

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);

        scrumTeam.addDevelopers(developers);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("------------------------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name +" : "+tester.salary);
        }

        System.out.println("------------------------------------------------");

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name+" : "+developer.salary);
        }





    }

}