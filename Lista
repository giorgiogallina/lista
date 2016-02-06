public class Lista {
	
	private Nodo head;
	
	public Lista(){
		head = null;
	}
	public Nodo getHead(){
		return head;
	}
	public void setHead(Nodo n){
		head = n;
	}
	
	public int length(){
		return lengthR(head);
	}
	private int lengthR(Nodo p){
		if(p == null)
			return 0;
		return 1 + lengthR(p.getLink());
	}
	
	public String toString(){
		String s = "";
		for (Nodo pn = head; pn != null; pn = pn.getLink()){
			s += (pn.getInfo() + (pn.getLink() == null ? "" : ", "));
		}
		return s;
	}
	
	public void insTesta(int x){
		Nodo p = new Nodo(x);
		p.setLink(head);
		head = p;
	}
	public void append(int x){
		Nodo p = new Nodo(x);
		if(head == null){
			head = p;
		}
		Nodo pn;
		for (pn = head; pn.getLink() != null; pn = pn.getLink());
		pn.setLink(p);
	}
	public void ins(int value, int index){
		if(index == 0){
			insTesta(value);
		}else{
			Nodo p = new Nodo(value);
			Nodo n = head;
			for(int i = 0; i < index-1 && n.getLink() != null; i++, n = n.getLink());
			p.setLink(n.getLink());
			n.setLink(p);
		}
	}
	
	public void eliminaTesta(){
		if(head != null){
			head = head.getLink();
		}
	}
	public void eliminaCoda(){
		if(head != null){
			if(head.getLink() == null){
				head = null;
			}else{
				Nodo p;
				for (p = head; p.getLink().getLink() != null; p = p.getLink());
				p.setLink(null);
			}
		}
	}

}
