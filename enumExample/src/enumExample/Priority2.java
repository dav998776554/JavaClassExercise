package enumExample;

import static java.lang.String.format;

public enum Priority2 {
<<<<<<< HEAD
	MAX(1){
=======
	MAX(10){
>>>>>>> ca876777bb6d0926e47467f6996e3cda1912744b
		public String toString () {
			return format("(%2d) - �̤j�v��",value);
		}
	},
<<<<<<< HEAD
	NORM(3){
=======
	NORM(5){
>>>>>>> ca876777bb6d0926e47467f6996e3cda1912744b
		public String toString () {
			return format("(%2d) - ���q�v��",value);
		}
	},
<<<<<<< HEAD
	MIN(50/5){
=======
	MIN(1){
>>>>>>> ca876777bb6d0926e47467f6996e3cda1912744b
		public String toString () {
			return format("(%2d) - �̤p�v��",value);
		}
	};
	
	protected int value;

	private Priority2(int value) {
		this.value = value;
	}
	
	public int value() {
		return value;
	}
	
	public static void main(String[] args) {
		for(Priority2 pri : Priority2.values()) {
			System.out.println(pri);
		}
	}
}
