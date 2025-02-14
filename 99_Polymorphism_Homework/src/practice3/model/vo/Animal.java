package practice3.model.vo;
// abstract 추상 메서드를 쓰기 위해서는 class도 추상클래스이어야지만 사용할 수 있음
public abstract class Animal {
//필드
	private String name;
	private String kinds;
//메서드
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	//Getter
	public String getName() {
		return name;
	}
	public String getKinds() {
		return kinds;
	}
	
	//생성자 : 기본
	public Animal() {

	}
	//생성자 : 필수
	public Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	//toString 
	@Override //javaAPI String toString
	public String toString() {
		return "저의 이름은" + name + "이고, 종류는 " + kinds + "입니다.";
	}
	
	public abstract void speak();
}
