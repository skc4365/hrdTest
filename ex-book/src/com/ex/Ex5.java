package com.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.conn.DBConnection;

public class Ex5 {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public void result() {

		try {
			String SQL = "select title, Price\r\n"
					+ "from Book\r\n"
					+ "where Price = \r\n"
					+ "	( select MAX(Price) from book )";

			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(SQL);

			rs = pstmt.executeQuery();

			// rs 출력
			System.out.println("(5) 가격이 가장 비싼 도서를 출력하시오.");
			while (rs.next()) {
				String title = rs.getString("title");
				System.out.print("책 제목: " + title + "\t");

				String maxPrice = rs.getString("Price");
				System.out.println("최고가의 책: " + maxPrice);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(rs, pstmt, conn);
		}

	}
}