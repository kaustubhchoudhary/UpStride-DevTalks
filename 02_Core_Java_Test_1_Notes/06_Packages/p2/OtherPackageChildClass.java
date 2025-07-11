package ex01.p2;

class OtherPackageChildClass extends ParentClass {
	
	OtherPackageChildClass() {

		System.out.println("\n OtherPackageChildClass Constructor");

		System.out.println("\n n_default   = " + n_default);
	
		System.out.println("\n n_private   = " + n_private);
		
		System.out.println("\n n_protected = " + n_protected);
		
		System.out.println("\n n_public    = " + n_public);
	}
}
