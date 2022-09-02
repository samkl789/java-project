package org.controlstatement;

public class AndandORFunctionInelseIf {

	public static void main(String[] args) {
		int a=10; int b=60; int c=100;
		
		if(a>b&&c>b) {
			System.out.println("Frist condtion true");
			
		}else if(b>c&&a<c) {
			System.out.println("Secound condition true");
		}
		else if(c<b||a>b) {
			System.out.println("Third condtion true");
			
		}else {
			System.out.println("noothing is true");
		}
	}
	
}
