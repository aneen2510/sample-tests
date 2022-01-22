public class SampleMain {

    public static void main(String []args){
        SampleTests flower = new SampleTests();
        flower.addDetails("Lilly");
        flower.addDetails("Rose");
        flower.addDetails("Lotus");
        flower.printDetails();

        flower.addName(1,"Aneena");
        flower.addName(2,"Ranjith");
    }


}
