class TernaryAssignment{
public static void main(String[ ] args)
{
int x=40;
int y=90;int z=140;
int result=x>y?(x>z?x:z):(y>z?y:z);
System.out.println("the large number is :" +result);
int result1=x<y?(x<z?x:z):(y<z?y:z);
System.out.println("the small number is:" +result1);
}
}

