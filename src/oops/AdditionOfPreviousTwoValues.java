package oops;
public class AdditionOfPreviousTwoValues {
    public static void main(String[] args) {
        
        int a1=0,a2=1,a3,count=8;
//        first element
        System.out.println(a1+a2);
        for (int i=2;i < count;i++)
        {
//            1,1,2,3,5,8,13
            a3=a1+a2;
            System.out.println(a3);
            a1=a2;
            a2=a3;
        }
    }
}
