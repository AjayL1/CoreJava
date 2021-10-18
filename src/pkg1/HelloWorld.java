package pkg1;

// import statement

class HelloWorld {
	
	// Fields or variable
	private int stdId; // 0, 0.0, instance varible
	public String name; // Null, instance variable
	static int age; //  static variable

	// Constructor
    // no-arg constructor
	HelloWorld() {}
	
	// parameterized constructor
	HelloWorld(int stdId) {
		this.stdId = stdId;
	}
	HelloWorld(String name) {
		this.name = name;
	}
	HelloWorld(int stdId, String name) {
		this.stdId = stdId;
		this.name = name;
	}
	
	
	static {
		//static block
	}
	
	{
		// instance block
	}
	
	// Methods 
	public static void main(String[] args) {
		int y = 200; // local variable
		HelloWorld hello = new HelloWorld(1000, "Ram");
		System.out.println(hello.stdId);
		System.out.print(hello.name);
		System.out.println(hello.getStdId());
		System.out.println(age);
		System.out.println(y);

	}
	
	/**
	 * description:
	 * author
	 * revision history:
	 *  
	 * @return - int
	 */
	private int getStdId() {
		int x = 100; // local variable
		System.out.println(age);
		System.out.print(stdId);
		System.out.println(name);
		return stdId;
	}

}


/* 
 * Access modifiers - allowed class level modifiers
public - within pkg & outside of the pkg
default - within pkg


data types :
 primitive  - byte, short, char, int, long, float, boolean, double
 non primitive - String, Array, class, interface, wrapper classes
 
 
Variable types:
 static / class variable   - inside class, outside method/constructor/block and
  static keyword prepended to variable
 access - using class name & using object reference 
 non-static/instance variable - inside class, outside method/constructor/block and
    not prefix with static keyword
 access - using object reference
 local - within method/constructor/block
 
Default values:
 char - empty char
 boolean - false
 byte - 0
 short - 0 
 long - 0
 double - 0.0
 float - 0.0
 
Naming convensions:
 pkg - lowercase
 class & interfaces - UpperCamelCase
 variables & methods - lowerCamelCase
 
Order:
package statement
import statements
class declaration
Field/variable
Constructor declaration
method declaration

comments - 
 // - single line comment
 /* 
  * Multi line
  * comment 
 */

 /** 
  * Documentation string
  * author: 
  * revision history:
  */
 
//static block & instance block

//static {// static block}

// {// instance block}
 
//*/
