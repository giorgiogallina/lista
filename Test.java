public class Test {

	public static void main(String[] args) {
		Lista l = new Lista();
		System.out.println(l + " - " + l.length());
		l.insTesta(10);
		l.append(12);
		l.insTesta(7);
		l.insTesta(5);
		l.append(13);
		l.insTesta(0);
		
		System.out.println(l + " - " + l.length());
		
		l.ins(34, 0);
		System.out.println(l + " - " + l.length());
		l.ins(23, 9);
		System.out.println(l + " - " + l.length());
		l.eliminaTesta();
		System.out.println(l + " - " + l.length());
		l.eliminaCoda();
		System.out.println(l + " - " + l.length());
	}

}
