public class Child extends Abstract implements Interface {
    public static void main(String[] args) {
        System.out.println("This is Displayer that display message");
        Child displayer = new Child();
        displayer.AbstractMessage();
        displayer.InterfaceMessage();
    }

    @Override
    public void InterfaceMessage() {
        System.out.println("This is Override Message from Interface");
    }
}
