/*
 * @Project : DeepRoot
 * @FileName : G_JstreeDTO.java
 * @Date : 2018. 6. 24.
 * @Author : 김태웅
*/

package site.book.team.dto;

/**
 * @Class : G_JstreeDTO.java
 * @Date : 2018. 6. 24.
 * @Author : 김태웅
 */
public class G_JstreeDTO {
	private int id;
	private String nname;
	private String parent;
	private String text;
	private String icon;
	
	public G_JstreeDTO() {}
	public G_JstreeDTO(int id, String nname, String parent, String text, String icon) {
		this.id = id;
		this.nname = nname;
		this.parent = parent;
		this.text = text;
		this.icon = icon;
	}

	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	public String getNname() {return nname;}
	public void setNname(String nname) {this.nname = nname;}
	public String getParent() { return parent; }
	public void setParent(String parent) { this.parent = parent; }
	public String getText() { return text; }
	public void setText(String text) { this.text = text; }
	public String getIcon() { return icon; }
	public void setIcon(String icon) { this.icon = icon;}

	@Override
	public String toString() {
		return "G_JstreeDTO [id=" + id + ", nname=" + nname + ", parent=" + parent
				+ ", text=" + text + ", icon=" + icon + "]";
	} 
}
