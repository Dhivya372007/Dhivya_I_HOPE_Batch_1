import java.util.*;
public class LinkedhashSet {
    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<>();
        set.add("KSP");
        System.out.println(set);
        set.add("RampeX");
        System.out.println(set);
        set.add("Aishu");
        set.add("Akshaya");
        set.add("Edlyn");
        System.out.println(set);
        for(String str:set){
            System.out.println(str);
        }
    }
}
