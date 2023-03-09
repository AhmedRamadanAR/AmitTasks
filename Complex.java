package Complex;
public class ex1 {

	public static void main(String[] args) {
        Complex c1=new Complex(1,5);
        Complex c2=new Complex(2,-7);
        
         Complex.printComplex(c1);
         Complex.printComplex(c2);
         Complex.printComplex(Complex.add(c1, c2));
         Complex.printComplex(Complex.sub(c1, c2));


	}

}
class Complex {
int real=0;
int imag=0;
Complex(int real,int imag){
	this.real=real;
	this.imag=imag;
}
Complex(){}
public static void printComplex(Complex container) {
    if(container.imag>0)
    {
    	System.out.println(container.real+"+"+container.imag+"i");
    }
    else if(container.imag<0){
    	System.out.println(container.real+""+container.imag+"i");
    
    }
    
    else {
    	System.out.println(container.real);
    }
	
}
public static Complex add(Complex c1,Complex c2) {
	Complex container=new Complex();
	 container.real=c1.real+c2.real;
	 container.imag=c1.imag+c2.imag;

	  return container;
	  
}
public static Complex sub(Complex c1,Complex c2) {
	Complex container=new Complex();
	container.real=c1.real-c2.real;
	container.imag=c1.imag-c2.imag;

	return container;
}


}

