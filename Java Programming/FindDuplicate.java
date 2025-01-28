/*
import java.util.Scanner;      ///for displaying number in words
class display{
    public static void main(String[] args) {
        int n,r;
        String str="";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        while(n>0){
            r=n%10;
            n=n/10;
            str=str+r;
        }
        System.out.println(str);
        char c;
        for(int i=str.length()-1;i>=0;i--){
            c=str.charAt(i);
            switch(c){
                case '0' -> System.out.print("Zero ");
                case '1' -> System.out.print("One ");
                case '2' -> System.out.print("Two ");
                case '3' -> System.out.print("Three ");
                case '4' -> System.out.print("Four ");
                case '5' -> System.out.print("Five ");
                case '6' -> System.out.print("Six ");
                case '7' -> System.out.print("Seven ");
                case '8' -> System.out.print("Eight ");
                case '9' -> System.out.print("Nine ");
            }
        }
    }
}
*/
/* 
import java.util.Scanner;
class Ap{
    public static void main(String[] args) {   //For printing AP series 
        int a,d,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first term of AP series:");
        a=sc.nextInt();
        int ap=a;
        System.out.println("Enter the common difference of AP series:");
        d=sc.nextInt();
        System.out.println("Enter the number of terms of AP series:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(ap+",");
            ap=ap+d;
        }
    }
}
*/
/* 
class Gp{
    public static void main(String[] args) {   //For printing GP series
        int a,r,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a,r and n of GP series:");
        a=sc.nextInt();
        r=sc.nextInt();
        n=sc.nextInt();
        int gp=a;
        for(int i=0;i<n;i++){
            System.out.print(gp+",");
            gp=gp*r;
        }
    }
}
*/
/* 
class fibonacci{
    public static void main(String[] args) {      //For printing fibonacci series
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms of fibonacci series:");
        n=sc.nextInt();
        int a,b;
        System.out.println("enter a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.print(a+","+b+",");
        for(int i=0;i<=n-2;i++){
            int c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}
*/
/* 
class nestedLoops{
    public static void main(String[] args) { //demonstration of nested loops
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("("+i+","+j+")");
            }
            System.out.println("");
        }
    }
}
*/
/* 
class pattern1{
    public static void main(String[] args) {  //for printing pattern 1
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(j+" ");
            }
        System.out.println("");
        }
    }
}
*/
/* 
class pattern2{
    public static void main(String[] args) { //for printing pattern 2 
                                                   
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(i+" ");
            }
        System.out.println("");
        }
    }
}
*/
/* 
class pattern3{ 
    public static void main(String[] args) {        //for printing pattern 3
        int count=0;         
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                ++count;
                System.out.format(" %02d ",count);
            }
        System.out.println("");
        }
    }
}
*/
/* 
class pattern4{
    public static void main(String[] args) {   //for printing pattern 4
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
        System.out.println("");
        }
    }
}
*/
/* 
class pattern5{
    public static void main(String[] args) { //for printing pattern 5
        int count=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
        System.out.println("");
        }
    }
}
*/
/* 
class pattern6{
    public static void main(String[] args) { //for printing pattern 6
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i+1 ;j++){
                System.out.print(j+" ");
            }
        System.out.println("");
        }
    }
}
*/
/* 
class pattern7{
    public static void main(String[] args) {     //for printing pattern 7
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i<=j){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
        System.out.println("");
        }
    }
}
*/
/* 
class pattern8{
    public static void main(String[] args) {    //for printing pattern 8
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i+j>5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
        System.out.println("");
        }
    }
}
*/
/* 
class array{
    public static void main(String[] args) {
        int A[]={1,2,3,4,5}; //directly taking a array without specifying the size of array
        int B[]=new int[10];  //taking first the size of array without giving values
        for(int x:A){          //printing the values of A using for-each loop or enhanced loop
            System.out.print(x);
        }
        for (int i=0;i<=A.length;i++){  //printing the values of A using normal for loop by accessing the indexing of array 
            System.out.println(A[i]);
        }
    }
}
*/
/* 
class arraySum{
    public static void main(String[] args) {   //finding the sum of all elements in an array through for loop
        int A[]={1,2,3,4,5,6};
        int sum=0;
        for(int i=0;i<=A.length;i++){
         sum=sum+i;
        }
        System.out.println("Sum of all elements of array is "+sum);
    }
}
*/
/*
class arraySum{
    public static void main(String[] args) {   //finding the sum of all elements in an array through for each loop
        int A[]={1,2,3,4,5,6};
        int sum=0;
        for(int i:A){
         sum=sum+i;
        }
        System.out.println("Sum of all elements of array is "+sum);
    }
}
*/
/* 
class linearSearch{
    public static void main(String[] args) {    //For linear search
        int A[]={1,3,4,6,7,10,78,90};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a key value to search: ");
        int key=sc.nextInt();
        for(int i=0;i<=A.length;i++){
            if(key==A[i]){
                System.out.println("Element found at "+i);
                System.exit(0);
            }
        }
        System.out.println("Not found");

    }
}
*/
/*
class maxElement{
    public static void main(String[] args) {  //For finding the maximum element within an array
        int A[]={3,9,7,13,15,2,1,8,6};
        int max=A[0];
        for(int i=0;i<A.length;i++){
            if(max<A[i]){
                max=A[i];
            }
        }
        System.out.println("Max element is "+ max);
    }
}
*/

/* 
class secondMax{
    public static void main(String[] args) {  //for finding second highest element of an array
        int A[]={3,9,7,8,12,6,15,5,4,10,50,78,91};
        int max1,max2;
        max1=max2=A[0];
        for(int i=0;i<A.length;i++){
            if(max1<A[i]){
                max2=max1;
                max1=A[i];
            }
            else if(max2<A[i]){
                max2=A[i];
            }
        }
        System.out.println("1st maximum element is "+max1);
        System.out.println("Second maximum element is "+max2);

    }
}
*/
/* 
class leftRotation{
    public static void main(String[] args) {      //rotating an array leftwards 
        int A[]={3,9,7,8,12,6,15,5,4,10,50,78,91};
        for(int x:A){
            System.out.print(x+",");
        }
        System.out.println("");
        int temp=A[0];
        for(int i=1;i<A.length;i++){
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        for(int x:A){
            System.out.print(x+",");
        }
        System.out.println("");
    }
}
*/
/* 
class rightRotation{
    public static void main(String[] args) {    //rotating an array rightwards
        int A[]={3,9,7,8,12,6,15,5,4,10};
        for(int x:A){
            System.out.print(x+",");
        }
        System.out.println("");
        int temp=A[A.length-1];
        for(int i=A.length-1;i>0;i--){
            A[i]=A[i-1];
        }
        A[0]=temp;
       
        for(int x:A){
            System.out.print(x+",");
        }
        
    }
}
*/

/* 
class arrayInsertion{
    public static void main(String[] args) {            //for inserting an element into a array at a prticular index
        int A[]=new int[10];
        A[0]=3; A[1]=9; A[2]=7; A[3]=8; A[4]=12; A[5]=6;
        int n=6;
        for(int i=0;i<n;i++){
            System.out.print(A[i]+",");
        }
        System.out.println("");
        int x=20;
        int index=2;
        for(int i=n;i>index;i--){
            A[i]=A[i-1];
        }
        A[index]=x;
        for(int i=0;i<n;i++){
            System.out.print(A[i]+",");
        }
    }
}
*/
/* 
class arraydeletion{
    public static void main(String[] args) {         //for deleting an element from a particular index in a array 
        int A[]=new int[10];
        A[0]=5; A[1]=9; A[2]=6; A[3]=10; A[4]=12; A[5]=17;
        int n=6;
        for(int i=0;i<n;i++){
            System.out.print(A[i]+",");
        }
        System.out.println("");
        
        for(int i=2;i<n;i++){
            A[i-1]=A[i];
        }
        for(int i=0;i<n-1;i++){
            System.out.print(A[i]+",");
        }
    }
}
*/
/* 
class arraycopy{
    public static void main(String[] args) {        ///copying an array element to an another array on same index
        int A[]={8,6,10,9,2,15,7,13,14,11};
        int B[]=new int[10];
        System.out.println("Array A is: ");
        for(int x: A){
            System.out.print(x+",");
        }
        for(int i=0;i<A.length;i++){
            B[i]=A[i];
        }
        System.out.println("");
        System.out.println("Array B is: ");
        for (int i = 0; i <B.length; i++) {
            
        System.out.print(B[i]+",");        }
        
    }
}
*/
/*
class reversearray{
    public static void main(String[] args) {     //copying an array into an another array in an revrse order
        int A[]={8,6,10,9,2,15,7,13,14,11};
        int B[]=new int[A.length];
        
        for(int i=A.length-1,j=0;i>=0;i++,j++)
        {
            B[j]=A[i];
        }
        
        for(int x:B)
        {
            System.out.println(x+",");
        }
}
}
*/
/* 
class Arraysize{
    public static void main(String[] args) {        //increasing the size of an array
        int A[]={8,9,6,3,4};
        System.out.println("Size of array A before: "+A.length);
        int B[]=new int[2*A.length];
        for(int i = 0; i < A.length; i++) {
            B[i]=A[i];   
        }
        System.out.println("Elements of Array A: ");
        for(int x:A){
            System.out.print(x+",");
        }
        A=B;
        B=null;
        System.out.println("");
        System.out.println("Size of array A after:"+A.length); 
    }
}
*/
/*
class Addmatrices{
    public static void main(String[] args) {    //Adding two matrices using 2D Array
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        for(int a[]: A){
            for(int b:a){
                System.out.print(b+" ");
            }
        System.out.println("");
        }
        System.out.println("");
        int B[][]={{1,5,2},{6,8,4},{3,9,7}};
        for(int a[]: B){
            for(int b:a){
                System.out.print(b+" ");
            }
        System.out.println("");
        }
        System.out.println("");
        int C[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        System.out.println("The result after adding two arrays:");
        for(int x[]:C){
            for(int y: x){
                System.out.print(y+" ");
            }
        System.out.println("");    
        }
    }
}
*/
/*
class Mulmatrices{
    public static void main(String[] args) {     //for multiplying two matrices using two 2D arrays
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,3,5},{6,8,4},{3,9,7}};
        int C[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                C[i][j]=0;
                for(int k=0;k<3;k++){
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            
            }
        }
    System.out.println("Array after multiplication: ");
    for(int x[]:C){
        for(int y:x){
            System.out.print(y+" ");
        }
    System.out.println("");
    }
    }
}
*/
/*
class Arraysortstring{
    public static void main(String[] args) {        //for sorting an array of Strings
        String arr[]={"java","python","pascal","basic"};
        java.util.Arrays.sort(arr);
        for(String x:arr){
            System.out.print(x+",");
        } 
    }
}
*/
/*     
public class PalindromeCheck {
    public static boolean isPalindrome(String str) {   //for checking pallindrome in string
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "madam";
        System.out.println(isPalindrome(input));  // Output: true
    }
}
*/
/*
public class Maxnumber{
    public static int maxnum(int [] array) {    //for finding maximum element of an array by creating an method
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={3,5,7,2,8};
        System.out.println(maxnum(arr));
    }
}
*/
/* 
public class Twosum{
    public static boolean isSum(int[] array, int target){  //for two  sum problem using naive method
           int n= array.length;
           for(int i=0;i<n;i++){ 
             for(int j=i+1;j<n;j++){
                if(array[i]+array[j]==target);
                return true;
             }
           }
           return false;
    }
    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int sum=9;
        System.out.println(isSum(nums, sum));
    }
}
*/
/*
public class fizzbuzz{
    public static void main(String[] args) {  //for printing fizz in place of multiple of 3 and buzz for 5 and fizzbuzz for 3 and 5
        int i=1;
        while (i<101){
            if(i%3==0 && i%5==0){
                System.out.print("fizzbuzz,");}
            else if(i%5==0){
                System.out.print("buzz,");
            }
            else if(i%3==0){
                System.out.print("fizz,");
            }
            
            else{
                System.out.print(i+",");
            }
            i++;
        }
    }
}
*/
/*
public class Missingnum{
    public static int findmissing(int [] n) {    //for finding missing number in an array of distinct elements in a sequence
        int res=0;
        for(int i=1;i<n.length;i++){
         res^=i;
        }
        for(int i=0;i<n.length-1;i++){
            res^=n[i];
        }
        return res;
    }
   public static void main(String[] args) {
    int nums[]={3,0,1,2,5};
    System.out.println(findmissing(nums));
   }
}
*/
/*
import java.util.Scanner;

public class Replace{
    public static void main(String[] args) {   //replacing '0' with '5' in an input number
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number: ");
        String str=sc.nextLine();
        String result= str.replace('0','5');
        System.out.println(result);
    }
}
*/
/* 
import java.util.HashSet;

public class FindDuplicate{
    public static int findDuplicate(int [] arr){   //for finding duplicate element on an array using hash table in O(n) time complexity
       HashSet<Integer> set= new HashSet<>();
       for(int num: arr){
        if(set.contains(num)){
            return num;    //Duplicate element found
        }
        set.add(num);
       }
       return -1;  //No duplicate element found
    }
    public static void main(String[] args) {
        int arr[]={1,4,6,7,8,9,8};
        System.out.println(findDuplicate(arr));
    }
}
*/
