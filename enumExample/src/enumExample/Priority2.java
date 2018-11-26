package enumExample;

import static java.lang.String.format;

public enum Priority2 {
	MAX(1){
		public String toString () {
			return format("(%2d) - �̤j�v��",value);
		}
	},
	NORM(3){
		public String toString () {
			return format("(%2d) - ���q�v��",value);
		}
	},
	MIN(50/5){
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
