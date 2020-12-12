//TODO: sort private method, add + set methods
public class OrderedArrayList<T extends Comparable<T> > extends NoNullArrayList<T> {
private T[] data;
private int size;
public OrderedArrayList () {
	super();
}

public OrderedArrayList (int capacity) {
	super(capacity);
}

private int sort (T input) {
	int index = 0;
	for (int i = 0; i < size(); i++) {
		if ((i == 0 || input.compareTo(get(i-1)) >= 0) && input.compareTo(get(i)) <= -1) {
			index = i;
			return index;
		}
	}
	return size();
}

public boolean add (T element) {
	if (element == null) {
		throw new IllegalArgumentException("NoNullArrayList does not accept nulls.");
	}
	super.add(sort(element), element);
	return true;
}

public void add (int index, T element) {
	if (element == null) {
		throw new IllegalArgumentException("NoNullArrayList does not accept nulls.");
	}
	super.add(sort(element), element);
	return;
}

public T set (int index, T element) {
	super.remove(index);
	add(element);
	return element;
}
}
