public class Task2 {
    public static void main(String[] args) {
        Float f1=127f;
        Float f2=127f;
        System.out.println(f1==f2);//false
        Integer x=200;
        Integer y=200;
        System.out.println(x==y);//false
        Integer a=127;
        Integer b=127;
        System.out.println(a==b);//true
    }
}

/*
Java internally caches:
Integer values from -128 to 127
This is called the Integer Cache


== checks whether two references point to the same object, not just equal values.
For Integer: Values between -128 to 127 are reused internally (same object).
So 127 == 127 → true
But 200 == 200 → false (different objects created) (outside java's integer cached range)
For Float:
No such reuse happens because every assignment creates a new object (because it doesnt follow caching mechanism (Float) )
So even if same value, it'll have different objects only...
*/
