package mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	Connection conn;
	
	
	public MemberDao(DBConnect db){
		this.conn = db.getConn();
		if(conn != null){
			System.out.println("DB가 정상적으로 연결됨");
		}
	}
	
	public int input(MemberVo vo){
		int r=0;
		PreparedStatement ps = null;
		
		try{
			String sql = "insert into  member values (?,?)";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getUserid());
			ps.setString(2, vo.getUserpwd());
			
			r = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return r;
	}
	
	public MemberVo view(MemberVo vo){
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		MemberVo v = new MemberVo();
		
		try{
			String sql = "select * from member where userid=?";
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, vo.getUserid());
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				v.setUserpwd(rs.getString("userpwd"));
				v.setUserid(vo.getUserid());
			} else {
				System.out.println("없음");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return v;
	}
	
	public List<MemberVo>  list(MemberVo vo){
		List<MemberVo> list = new ArrayList<MemberVo>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try{
			String sql = "select * from member where userid like ?";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+vo.getUserid()+"%");
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				MemberVo v = new MemberVo();
				v.setUserid(rs.getString("userid"));
				v.setUserpwd(rs.getString("userpwd"));
				list.add(v);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public int delete(MemberVo vo) {
		int r=0;
		PreparedStatement ps = null;
		try{
			String sql = "delete from member where userid = ?";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getUserid());
			
			r = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return r;
	}
	
	public int modify(MemberVo vo) {
		int r=0;
		PreparedStatement ps = null;
		try{
			String sql = "update member set userpwd = ? where userid = ?";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getUserpwd());
			ps.setString(2, vo.getUserid());
			
			r = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return r;
	}
}