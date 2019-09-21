package library;

import java.util.Scanner;
public class Library {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Book ob =new Book();
        int n=sc.nextInt();
        if(n>0){
            sc.nextLine().trim();
            String a[] = new String[3*n];
            for (int m=0;m<(3*n);m++){
                a[m]=sc.nextLine();
            }
            int j=0;
            while(n>0){
                String s1=ob.tostring(a[j++],a[j++],a[j++]);
                System.out.print("-------------------------\n");
                System.out.println(s1+"\n");
                System.out.print("-------------------------\n");
            }
        }
        else if(n==0){
            System.out.println("N/A");
        }
    }
}
class Book{
    public String tostring(String bn,String an,String isbn){
        return "Book Name:\t"+bn+"\nAuthor Name:\t"+an+"\nISBN:\t"+isbn;
    }
}
