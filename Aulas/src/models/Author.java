package models;

public class Author {
	private String name;
	private String email;
	private String website;
	
	public Author(){
		
	}
	/**
	 * 
	 * @param name
	 * @param email
	 * @param website
	 */
	public Author(String name,String email, String website){
		this.name=name;
		this.email=email;
		this.website=website;
		
	}
	/**
	 * Return the author name.
	 * @return
	 */
	public String getName(){
		return name;
		
	}
	/**
	 * return email.
	 * @return
	 */
	public String getEmail(){
		return email;
	}
	/* *
	 * return website.
	 * @return
	 */
	public String getWebsite(){
		return website;
		}
		
		
	public String toString(){
	
		return "name :" + this.name + " email : " + this.email + " website : " + this.website;
	}
	
}
