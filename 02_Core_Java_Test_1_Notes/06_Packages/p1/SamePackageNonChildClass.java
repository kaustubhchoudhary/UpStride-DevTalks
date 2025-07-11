package ex01.p1;

class SamePackageNonChildClass {

	SamePackageNonChildClass() {

		ParentClass b = new ParentClass();

		System.out.println("\n SamePackageNonChildClass Constructor");
		
		System.out.println("\n n_default   = " + b.n_default);

		System.out.println("\n n_private   = " + b.n_private);

		System.out.println("\n n_protected = " + b.n_protected);
		
		System.out.println("\n n_public    = " + b.n_public);
	}
}
