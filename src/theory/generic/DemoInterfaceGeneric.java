package theory.generic;

public  class  DemoInterfaceGeneric implements InterfaceGeneric<String>{
    // yes or no determine specify parameter
    // if no: it is object
    // if yes: it is specify parameter
    @Override
    public String getName() {
        return "suong";
    }
}
