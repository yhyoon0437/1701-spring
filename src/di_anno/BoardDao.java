package di_anno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

public class BoardDao {
	
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	public BoardDao() {
	}
	@Autowired
	public BoardDao(DBConnect conn) {
		this.conn = conn.getConn();
	}
	
	
	public BoardVo view(BoardVo vo) {
		BoardVo v = null;
		
		String sql = "select * from board where serial=?";
		
		try{
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getSerial());
			rs = ps.executeQuery();
			
			while(rs.next()) {
				v = new BoardVo();
				v.setSerial(rs.getInt("serial"));
				v.setmDate(rs.getString("mDate"));
				v.setWorker(rs.getString("worker"));
				v.setSubject(rs.getString("subject"));
				v.setContent(rs.getString("content"));
				v.setHit(rs.getInt("hit"));
				v.setGrp(rs.getInt("grp"));
				v.setDeep(rs.getString("deep"));
			}
			conn.close();
		}catch(Exception e) {
			v = null;
		}
		return v;
	}

}
