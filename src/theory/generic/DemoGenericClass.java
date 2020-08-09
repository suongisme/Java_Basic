package theory.generic;

public class DemoGenericClass {
    public static void main(String[] args) {
        // create GenericClass Object and determine specify parameter String, Integer

        GenericClass<String, Integer> gl = new GenericClass<String, Integer>("SuongNguyen", 18);
        System.out.println("Generic is: String and Integer");
        System.out.println(gl.getKey()+" "+gl.getValue());

        //create GenericClass Object and determine specify parameter String, Integer
        System.out.println("\nneric is: String and Integer");
        GenericClass<String, Integer> gl2 = new GenericClass<String, Integer>("NguyenVanSuong",1000);
        System.out.println(gl2.getKey()+" "+gl2.getValue());

        // when generic is another objec
        GenericClass<User, Integer> gl3 = new GenericClass<User, Integer>(new User(), 1000);
        System.out.println("\nGeneric is: User and Integer");
        User a = gl3.getKey();
        a.setName("SuongNguyen");
        a.setAge(19);
        a.setAddress("Dong Anh-Ha Noi");
        System.out.println(a);

        // gl assign gl2
        gl = gl2;
        System.out.println("\nGeneric is: String and Integer");
        System.out.println(gl.getKey()+" "+gl.getValue());

        //create InheritGenericAnotherClass Object
        InheritGenericAnothorClass in = new InheritGenericAnothorClass<String, String, Integer>("Suong","Nguyen",100);
        System.out.println(in.getValue()+" "+in.getKey()+" "+in.getSomething());
    }
}
