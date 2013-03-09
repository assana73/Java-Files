public interface SimpleList<T>
{
   void add(T element);
   void add(int index, T element);
   boolean contains(T element);
   T get(int index);
   int indexOf(T element);
   T remove(int index);
   T set(int index, T element);
   int size();
   boolean isEmpty();
}
