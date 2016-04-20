package book.dhsjms.wish.designmodel._17bridge;

class Abstraction {
	protected Implementor imp;//聚合关系
	
	public void setImplementor(Implementor imp){
		this.imp = imp;
	}
	public void operation(){
		imp.operation();
	}
}
