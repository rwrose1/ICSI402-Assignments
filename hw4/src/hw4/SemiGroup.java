package hw4;
import java.util.ArrayList;

public abstract class SemiGroup<AnyType> {
	
	public abstract AnyType operator(AnyType two);
	public abstract AnyType combine(ArrayList<AnyType> collection);
}
