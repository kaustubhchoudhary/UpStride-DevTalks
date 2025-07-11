package ex01.p1;

class SamePackageChildClass extends ParentClass {

	SamePackageChildClass() {
		
		System.out.println("\n Same Package Child Class Constructor");

		System.out.println("\n n_default   = " + n_default);
		
		System.out.println("\n n_private   = " + n_private);
		
		System.out.println("\n n_protected = " + n_protected);
		
		System.out.println("\n n_public    = " + n_public);
	}
}
