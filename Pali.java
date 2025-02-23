 //Write a program to check number is a palindrome or not
public class Pali{
 public  static void main(String args[]){
  int n = 213;
  String temp = "" + n;
  String sb = new StringBuilder(temp).reverse().toString();
  if (temp.equals(sb)){
      System.out.println(n +" is a palindrome");
  }else{
      System.out.println(n +" is not a palindrome");
  }
  }
  }
