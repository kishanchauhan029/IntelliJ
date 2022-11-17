package co.pragra.learning;

public class PhoneChecker {
    private String phoneNumber;
    private PhoneTypeEnum phoneTypeEnum;

    public PhoneChecker(String phoneNumber, PhoneTypeEnum phoneTypeEnum) {
        this.phoneNumber = phoneNumber;
        this.phoneTypeEnum = phoneTypeEnum;
    }

    public boolean testPhone(String phone){ return phone.matches("[0-9]+");}
}
