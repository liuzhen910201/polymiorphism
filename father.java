class person{
    public void a(){
	System.out.println("person");
    }
}
public class father{
    public static void main(String[] args){
	father m = new son();
	father n = new father();
	son x = new son();
	//son y = new father();//father类无法传递给Éson 
	//m.a();
	//stranger s = new stanger();
	//s=(stranger)x;//son²»ÄÜ×ª»»³Éstranger
	stranger.a();//c
	son l = (son)m;
	l.a();//b
	//son k= (son)n;//java.lang.ClassCastException:father cannot be cast to son
	person tt= new person();
	tt.a();//person
    }
    public void a(){
	System.out.println("a");
    }
}
class son extends father{
    public void a(){
	System.out.println("b");
    }
}
class stranger{
    father bb = new father();
    
    father hh = new son();
    public static void a(){
	System.out.println("c");
	
    }
}
