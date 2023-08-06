import java.lang.Math;
// to print natural number using while loop
class HelloWorld {
    public static void main(String[] args) {
    int i=1;
    while(i<=10){
        System.out.println(i);
        i++;
    }
    }
}
// same programme using dowhile
class Helloworld{
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=10);
    }
}
// to print the table of a number
class table{
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            System.out.println("5" + "*"+i+"="+5*i);
            i++;
        }
    }
}
class rev{
    public static void main(String[] args) {
        int num=12345;
        int rev=0;
        int l;
        while(num>0){
            l=num%10;
            rev=rev*10+l;
            num=num/10;


        }
        System.out.println(rev);
    }
}
class  fact{
    public static void main(String[] args) {
        int n=6;
        int fact=1;
        while(n>0){
            fact=n*fact;
            n=n-1;
        }
        System.out.println(fact);
    }
}
class pal{
    public static void main(String[] args) {
        int num=121;
        int o=num;
        int rev=0;
        int l;
        while(num>0){
            l=num%10;
            rev=rev*10+l;
            num=num/10;


        }
        if(rev==o){
        System.out.println("no is pallindrome");
        }
        else{
            System.out.println("not pallindrome");
        }
    }
}
class hii{
    public static void main(String[] args) {
        int n=874567;
        double f;
        int l;
        int count=0;
        while(n>10){
           n= n/10;
        count=count++;
        }
        f=n/(Math.pow(10,count));
        System.out.println(f);
        System.out.println(n%10);


    }
}
