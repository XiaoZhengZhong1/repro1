package com.itheima.mybatis.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Ф����
 *
 */
/**
 * @author Ф����
 *
 */
public class orders  implements Serializable{


	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer userId;

    private String number;

    private Date createtime;

    private String note;
    
    private String username;
    
    //���Ӷ���  �û�����
   // private User user;
    
    
    
    
    

    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/*public User getUser() {
		return user;
	}
*/
	/*public void setUser(User user) {
		this.user = user;
	}
*/
	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

	@Override
	public String toString() {
		return "orders [id=" + id + ", userId=" + userId + ", number=" + number
				+ ", createtime=" + createtime + ", note=" + note
				+ ", username=" + username + "]";
	}

    
    
}