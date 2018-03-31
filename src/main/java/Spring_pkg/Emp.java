package Spring_pkg;

public class Emp {
	String name,email;
	int id;
	public Emp(String name,String email,int id)
	{
		this.name=name;
		this.email=email;
		this.id=id;
	}
	public String getName() {
	    return this.name;
	}

	public void setName(String name) {
	    this.name = name;
	}
	public String getEmail() {
	    return this.email;
	}

	public void setEmail(String email) {
	    this.email = email;
	}
	public int getId() {
	    return this.id;
	}

	public void setId(int id) {
	    this.id = id;
	}
}
