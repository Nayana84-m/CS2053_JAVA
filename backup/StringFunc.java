class StringFunc{
public static void main(String args[]) {
String sb1 = "First Lab";
String sb2 = "Second Lab";
String sb3 = sb1;
System.out.println("Length of sb1: " + sb1.length());
System.out.println("Char at index 3 in sb3: " +sb3.charAt(3));
System.out.println("String1 equals to String2 "+ sb1.equals(sb2));
System.out.println("String1 equals to String3 "+sb1.equals(sb3));
sb1="Modified Lab";
System.out.println("sb1 is " + sb1);
System.out.println("sb3 is " + sb3);
System.out.println("String1 equals to String3 "+sb1.equals(sb3));
}
}