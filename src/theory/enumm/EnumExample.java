package theory.enumm;

public class EnumExample {
    public static void main(String[] args) {
        EnumPerson[] personArray = EnumPerson.values();

        for (EnumPerson x : personArray) {
            String infor = getInformation(x);
            System.out.println(infor);
        }

    }

    public static String getInformation(EnumPerson x) {
        String name = x.getName();
        int age = x.getAge();
        String nationality = x.getNationality();
        x.getHalf();
        String parents = x.getParents();
        return name+" "+age+" "+nationality+" "+parents;
    }
}
