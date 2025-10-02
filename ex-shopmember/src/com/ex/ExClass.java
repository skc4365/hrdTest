package com.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.conn.DBConnection;

public class ExClass {

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

//	테이블 삭제
	public void deleteAll(String tableName) {
		String sql = "delete table " + tableName;
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			int rows = pstmt.executeUpdate();
			System.out.println("----- 모든행: " + rows + "행이 삭제됨 -----");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt, conn);
		}
	}

//	auto_increment = 1
	public void setAuto_Increment(String tableName, int autoInit) {
		String sql = "alter table " + tableName + " auto_increment = " + autoInit;
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			int rows = pstmt.executeUpdate();
			System.out.println("----- " + rows + "auto_increment = 1로 셋팅됨 -----");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt, conn);
		}
	}

//	테이블 내용 출력
	public void selectAll(String tableName) {

		try {
			String SQL = "select * from " + tableName;
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();

			if (tableName == "ShopMember") {
				// rs 출력
				System.out.println("----- 고객테이블의 전체데이터 확인 -----");
				while (rs.next()) {

					int CustNo = rs.getInt("CustNo");
					String CustName = rs.getString("CustName");
					String Phone = rs.getString("Phone");
					String Address = rs.getString("Address");
					String JoinDate = rs.getString("JoinDate");
					String Grade = rs.getString("Grade");
					String City = rs.getString("City");

					System.out.print("회원번호:" + CustNo + "  회원성명:" + CustName + "  전화번호:" + Phone + "  주소:" + Address
							+ "  가입일자:" + JoinDate + "  고객등급:" + Grade + "  도시코드:" + City + "\n");
				}
			} else if (tableName == "Sale") {
				// rs 출력
				System.out.println("----- 판매테이블의 전체데이터 확인 -----");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(rs, pstmt, conn);
		}
	}

	public void insertShopMember(String CustName, String Phone, String Address, String JoinDate, char Grade,
			String City) {
//		String sql = "insert into ShopMember(CustName, Phone, Address, JoinDate, Grade, City) \r\n"
//				+ "	values(?, ?, ?, ?, ?, ?)";
//		try {
//			conn = DBConnection.getConnection();
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, CustName);
//			pstmt.setString(2, Phone);
//			pstmt.setString(3, Address);
//			pstmt.setString(4, JoinDate);
////			pstmt.setString(5, Character.toString(Grade));
//			pstmt.setString(5, String.valueOf(Grade));
//			pstmt.setString(6, City);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			// 깔끔하게 자원 해제
//			DBConnection.close(pstmt, conn);
//		}

	}

}
