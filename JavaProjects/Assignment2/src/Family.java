import com.sun.tools.javac.Main;

public class Family {
    String FatherName, MotherName, SonName, DaughterName;
    int FatherSalary, MotherSalary, SonFee, DaughterFee;
    int Grocery = 500;

    public static void main(String[] args) {
Family fam = new Family("Haresh", "Beena", "Kish", "Nik");
Family fam1 = new Family(434, 5453, 43,43);
fam.getSavigs();
fam.getTotalFee();
fam.getTotalSalary();
fam.savingCheck();
fam.displayNames();


    }
        Family (String fatherName, String motherName, String sonName, String daughterName) {
            FatherName = fatherName;
            MotherName = motherName;
            SonName = sonName;
            DaughterName = daughterName;
        }
        Family(int fatherSalary, int motherSalary, int sonFee, int daughterFee){
        FatherSalary = fatherSalary;
        MotherSalary = motherSalary;
        SonFee = sonFee;
        DaughterFee = daughterFee;
        }
    public void displayNames() {
        System.out.println(FatherName);
        System.out.println(MotherName);
        System.out.println(SonName);
        System.out.println(DaughterName);
    }

    public int getTotalSalary () {
        return FatherSalary + MotherSalary;
    }

    public int getTotalFee () {
        return SonFee + DaughterFee;
    }

    public int getSavigs () {
        return getTotalSalary() - getTotalFee() - Grocery;
    }

    public void savingCheck () {
        if (getSavigs() >= 1000) {
            System.out.println("Congratulations!! " + FatherName + " you saved this much = " + getSavigs());
        } else {
            System.out.println("Dear " + FatherName + " Please try to save for the next month!");
        }
    }
    }