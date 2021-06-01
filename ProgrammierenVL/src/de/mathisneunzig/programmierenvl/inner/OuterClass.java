package de.mathisneunzig.programmierenvl.inner;

public class OuterClass {
	
	public static class InnerTopLevelClass {
		
		void print(String s) {
			System.out.println(InnerTopLevelClass.class.getName()+": "+s);
		}
		
	}
	
	public class InnerElementClass {
		
		void print(String s) {
			System.out.println(InnerElementClass.class.getName()+": "+s);
		}
		
	}
	
	private static interface Printable {
		
		void print(String s);
		
	}
	
	private static interface Printable_Lambda {
		
		void print(String s);
		
	}
	
	public void printAll(String s) {
		
		class InnerLocalClass {
			
			void print(String s) {
				System.out.println(InnerLocalClass.class.getName()+": "+s);
			}
			
		}

		//Top-Level-Klasse
		OuterClass.InnerTopLevelClass tlc = new OuterClass.InnerTopLevelClass();
		tlc.print(s);
		//Element-Klasse
		OuterClass.InnerElementClass ec = this.new InnerElementClass();
		ec.print(s);
		//Lokale Klasse
		InnerLocalClass lc = new InnerLocalClass();
		lc.print(s);
		//Anonyme Klasse
		OuterClass.Printable ac = new OuterClass.Printable() {
			@Override
			public void print(String s) {
				System.out.println(this.getClass().getName()+": "+s);
			}
		};
		ac.print(s);
		//Kambda-Funktion ohne Klasse
		OuterClass.Printable_Lambda lambda = (lambda_function) -> {
			System.out.println(this.getClass().getName()+": "+s);
		};
		lambda.print(s);
		
	}
	
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.printAll("HelloWorld");
	}
	
}
