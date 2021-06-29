package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Bean.result;
import Bean.shengfen;
import DBUtil.DBUtil;

public class Dao {
static int id = 1;
	public List<shengfen> selecttime(String starttime) {
		String sql="select * from world_map where time = '"+starttime+"' and continents = '北美洲'";
        System.out.println(sql);
	    Connection conn = DBUtil.getConn();
		Statement stat = null;
		List<shengfen> list = new ArrayList<>();
		ResultSet rs = null;
		shengfen sf =null;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while(rs.next()) {
				String Province = rs.getString("provinceName");
				int Confirmed_num = rs.getInt("confirmedCount");
				int Cured_num = rs.getInt("curedCount");
				int Dead_num = rs.getInt("deadCount");
				sf = new shengfen(Province,id,Confirmed_num,Cured_num,Dead_num);
				id++;
				list.add(sf);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		id = 1;
		return list;
	}
	public List<shengfen> Ajax() {
		String sql="select * from world_map";
        System.out.println(sql);
	    Connection conn = DBUtil.getConn();
		Statement stat = null;
		List<shengfen> list = new ArrayList<>();
		ResultSet rs = null;
		shengfen sf =null;
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while(rs.next()) {
				String Province = rs.getString("provinceName");
				int Confirmed_num = rs.getInt("confirmedCount");
				int Cured_num = rs.getInt("curedCount");
				int Dead_num = rs.getInt("deadCount");
				sf = new shengfen(Province,id,Confirmed_num,Cured_num,Dead_num);
				id++;
				list.add(sf);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		id = 1;
		return list;
	}
	public List<result> echart() {
		// TODO Auto-generated method stub
		return null;
	}

}
