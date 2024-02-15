package m2_02_15;

public final class Test8_11 {
	private final String name;
	private final Integer age;
	
	public Test8_11(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	public String name() {
		return name;
	}
	public Integer age() {
		return age;
	}
	@Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Person) obj;
        return Objects.equals(this.name, that.name) &&
                Objects.equals(this.age, that.age);
    }
    @Override
     public int hashCode() {
         return Objects.hash(name, age);
     }
     @Override
     public String toString() {
         return “Person[“ + “name=“ +name +”, “ + “age=“ + age +’]’;
     }
	

	public static void main(String[] args) {
		

	}

}
