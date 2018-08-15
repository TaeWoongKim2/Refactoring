package site.book.user.dto;

public class JsTreeDTO {
	private String id;
	private String parent;
	private String text;
	private String icon;
	private String uid;
	private String sname;
	private String htag;
	
	public JsTreeDTO() {}
	public JsTreeDTO(String id, String uid) {
		this.id = id;
		this.parent = "#";
		this.text = "첫 카테고리";
		this.icon = "fa fa-folder";
		this.uid = uid;
	}
	public JsTreeDTO(String id, String parent, String text, String icon, String uid, String sname, String htag) {
		this.id = id;
		this.parent = parent;
		this.text = text;
		this.icon = icon;
		this.uid = uid;
		this.sname = sname;
		this.htag = htag;
	}
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getParent() {return parent;}
	public void setParent(String parent) {this.parent = parent;}
	public String getText() {return text;}
	public void setText(String text) {this.text = text;}
	public String getIcon() {return icon;}
	public void setIcon(String icon) {this.icon = icon;}
	public String getUid() {return uid;}
	public void setUid(String uid) {this.uid = uid;}
	public String getSname() {return sname;}
	public void setSname(String sname) {this.sname = sname;}
	public String getHtag() {return htag;}
	public void setHtag(String htag) {this.htag = htag;}
	
	@Override
	public String toString() {
		return "JsTreeDTO [id=" + id + ", parent=" + parent + ", text=" + text + ", icon=" + icon + ", uid=" + uid
				+ ", sname=" + "sname" + ", htag=" + htag + "]";
	}
}
