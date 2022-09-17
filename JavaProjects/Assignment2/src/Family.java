public class Family {
    public static void main(String[] args) {
        String FatherName;
        String MotherName;
        String SonName;
        String DaughterName;
        int FatherSalary;
        int MotherSalary;
        int SonFee;
        int DaughterFee;
        int Grocery = 500;

        public int getTotalSalary(FatherSalary, MotherSalary){
            int TotalSalary = FatherSalary+MotherSalary;
            return TotalSalary;
        }
        public int getTotalFee(SonFee, DaughterFee){
            int TotalFee = SonFee+DaughterFee;
            return TotalFee;
        }
        public int getSavings(){
            int Savings = TotalSalary - TotalFee;
            return Savings;
        }
    }
}
