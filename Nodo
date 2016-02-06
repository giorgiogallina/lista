public class Nodo {

	private int info;
	private Nodo link;
	
	public Nodo(){
		info = 0;
		link = null;
	}
	public Nodo(int info){
		setInfo(info);
		link = null;
	}
	public Nodo(int info, Nodo link){
		setInfo(info);
		setLink(link);
	}
	public Nodo(Nodo n){
		if(n == null){
			info = 0;
			link = null;
		}
		info = n.info;
		link = n.link;
	}
	
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	public Nodo getLink() {
		return link;
	}
	public void setLink(Nodo link) {
		this.link = link;
	}
	
	public boolean equals(Nodo n){
		return info == n.info && link == n.link;
	}
	public Nodo clone(){
		return new Nodo(this);
	}
}
