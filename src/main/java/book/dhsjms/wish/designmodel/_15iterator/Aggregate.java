package book.dhsjms.wish.designmodel._15iterator;

/**
 * 聚集抽象类
 */
abstract class Aggregate {
	public abstract int getCount();
	public abstract Object get(int index);
	public abstract void set(int index, Object obj);
	public abstract Iterator createIterator();
}
