package javaLectures.interfaces.interfaceDemoGoceva;

public interface IComparable {
	double getArea();
	default boolean isEqual(IComparable c) {
		return !isNull(c);
	}
	IComparable less(IComparable c);
	
	static boolean isNull(IComparable c) {
		return c==null;
	}
}

@FunctionalInterface //lambda function setup
interface IPerimeter {
	double getPerimeter();
}