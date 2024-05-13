public class fibo{

public void fun(int n){
int a=0;
int b=1;

System.out.println(a);
System.out.println(b);



for(int i=1;i<=n-2;i++){
int c=a+b;
a=b;
b=c;
System.out.println(c);

}


}

public static void main(String[] args){
fibo obj=new fibo();
obj.fun(6);
}

}