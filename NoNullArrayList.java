import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
private T[] data;
private int size;
public NoNullArrayList () {
	super();
}

public NoNullArrayList (int capacity) {
	super(capacity);
}

public boolean add (T element) {
	if (element == null) {
		throw new IllegalArgumentException("NoNullArrayList does not accept nulls.");
	}
	super.add(element);
	return true;
}

public void add (int index, T element) {
	if (element == null) {
		throw new IllegalArgumentException("NoNullArrayList does not accept nulls.");
	}
	super.add(index, element);
	return;
}

public T set (int index, T element) {
	if (element == null) {
		throw new IllegalArgumentException("NoNullArrayList does not accept nulls.");
	}
	super.set(index, element);
	return element;
}
}
