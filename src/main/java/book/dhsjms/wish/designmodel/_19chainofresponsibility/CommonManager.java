package book.dhsjms.wish.designmodel._19chainofresponsibility;

class CommonManager extends Manager {

	public CommonManager(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		if(request.getRequestType().equals("leave") && request.getNumber() <= 2){
			System.out.println(name + " : " + request.getRequestContent() + " number " + request.getNumber() + " is authorized.");
		}
		else{
			if(superior != null){
				superior.requestApplications(request);
			}
		}
	}

}
