package theory.enumm;

public enum EnumPerson implements EnumInterfaceExample{

    NguyenVanSuong("Nguyen Van Suong", 18, "VietNam"){
        @Override
        void getHalf() {
            System.out.println("Nguyen Thi D");
        }

        @Override
        public String getParents() {
            return "Mr.A";
        }
    },
    NguyenVanA("Nguyen Van A", 19, "USA"){
        @Override
        void getHalf() {
            System.out.println("Nguyen Thi C");
        }

        @Override
        public String getParents() {
            return "Ms.B";
        }
    },
    NguyenVanB("Nguyen Van B", 20,"UK"){
        @Override
        void getHalf() {
            System.out.println("Nguyen Thi A");
        }

        @Override
        public String getParents() {
            return "Mr.C";
        }
    };

    private String name;
    private int age;
    private String nationality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    EnumPerson(String name, int age, String nationality){
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    abstract void getHalf();


}
