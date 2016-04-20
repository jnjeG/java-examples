package book.dhsjms.wish.designmodel._23visitor;

class Man extends Person {

	@Override
	public void accept(Action visitor) {
		visitor.getManConclusion(this);//双分派技术
	}

	@Override
	public String toString() {
		return "Man";
	}
}
