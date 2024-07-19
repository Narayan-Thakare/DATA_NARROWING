package data_narrowing;


public class  Narrrowing
{
	public static void main(String[] args) 
	{


System.out.println("this is for double ");
		{
			
			
double d = 123432.00;
float f = (float) d;
long l = (long)d;
int i = (int)d;
short s = (short)d;
byte b= (byte)d;
char ch = (char)d	 ;

	  System.out.println(f);
	  System.out.println(l);
	  System.out.println(i);
	  System.out.println(s);
	  System.out.println(b);
	  System.out.println(ch);

		}
	
		System.out.println("this is for float ");
		
		{

float f = 120.0f;
long l = (long)f;
int i = (int)f;
short s = (short)f;
byte b= (byte)f;
char ch = (char)f	 ;



	  System.out.println(l);
	  System.out.println(i);
	  System.out.println(s);
	  System.out.println(b);
	  System.out.println(ch);
	  
	  
	  

		}
		
		
		
		System.out.println("this is for long");
		
		{


long l = 120343443434l;
int i = (int)l;
short s = (short)l;
byte b= (byte)l;
char ch = (char)l	 ;


	  //System.out.println(l);
	  System.out.println(i);
	  System.out.println(s);
	  System.out.println(b);
	  System.out.println(ch);

		}
		
		
				System.out.println("this is for int");
		{



int i = 123430;
short s = (short)i;
byte b= (byte)i;
char ch = (char)i	 ;




	  System.out.println(s);
	  System.out.println(b);
	  System.out.println(ch);

		}
		
		
				System.out.println("this is for short");
		{




short s = 197;
byte b= (byte)s;
char ch = (char)s	 ;


	  System.out.println(b);
	  System.out.println(ch);

		}
		
			System.out.println("this is for char");
		{


char ch = 'N';

short s = (short)ch;
byte b= (byte)ch;
	 


	  System.out.println(s);
	  System.out.println(b);

		}
		
		
		
				System.out.println("this is for byte");
		{


byte b= 97;
char ch = (char)b	 ;


	  
	  System.out.println(ch);

		}
		
		
		
		
		


	}
}
