package book.dhsjms.wish.designmodel._13memento;

/**
 * 备忘录类
 */
class Memento {
	private String state;
	
	public Memento(String state){
		this.state = state;
	}
	
	public String getState(){
		return state;
	}
}
