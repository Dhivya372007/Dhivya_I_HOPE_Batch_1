public class WrapperClassEg{
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        Integer objA=10;
        System.out.println(a);
        System.out.println(a==objA);
        System.out.println(objA.hashCode());
    }
}
