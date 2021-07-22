package de.mathisneunzig.klausur.innereKlassen;

public class OuterClass {
	
	//Innere Top Level Klasse
	
	public static class InnerTopLevelClass {
		void print(String s) {
			System.out.println(this.getClass().getName()+": "+s);
		}
	}
	
	public void printFromInnerTopLevelClass(String s) {
		
		InnerTopLevelClass itlc = new InnerTopLevelClass();
		itlc.print(s);
		
	}
	
	//Innere Element Klasse
	
	public class InnerElementClass {
		void print(String s) {
			System.out.println(this.getClass().getName()+": "+s);
		}
	}
	
	public void printFromElementClass(String s) {
		
		InnerElementClass iec = new InnerElementClass();
		iec.print(s);
		
	}
	
	//Lokale Innere Klasse innerhalb einer Methode. Die Innere Klasse kann nur in der Methode aufgerufen werden.
	
	void printFromLocalClass(String s) {
		
		class LocalClass {
			void print(String s) {
				System.out.println(this.getClass().getName()+": "+s);
			}
		}
		
		LocalClass lc = new LocalClass();
		lc.print(s);
		
	}
	
	//Anonyme Klasse
	
	private static interface Printable {
		void print(String s);
		void print2(String s);
	}
	
	void printFromAnonymClass(String s) {
		
		Printable myAnonymousClass = new Printable() {
			@Override
			public void print(String text) {
				System.out.println(this.getClass().getName()+": "+text);
			}

			@Override
			public void print2(String s) {
				System.out.println(this.getClass().getName()+"(2): "+s);
			}
		};
		
		myAnonymousClass.print(s);
		myAnonymousClass.print2(s);
		
	}
	
	//Lambda Funktion (Anonyme Funktion)
	
	private static interface PrintableLambda {
		void print(String s);
	}
	
	void printFromLambda(String s) {
		
		PrintableLambda myLambda = (text) -> { System.out.println(this.getClass().getName()+": "+text); };
		myLambda.print(s);
		
	}
	
}
