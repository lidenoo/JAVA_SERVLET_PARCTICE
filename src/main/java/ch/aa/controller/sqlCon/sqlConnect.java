package ch.aa.controller.sqlCon;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sqlConnect {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/csii_db?useUnicode=true&characterEncoding=utf8";
    	// データベースのユーザー名
	private static final String USER = "root";

	// データベースのパスワード
	private static final String PASSWD = "sqlau4a83";

	// DBコネクション保持用
	private Connection con = null;

	// ステートメント保持用
	private Statement smt = null;
    
    public boolean connect(){

        
        try {

			Class.forName(JDBC_DRIVER);//step1. Load driver
			this.con = DriverManager.getConnection(URL, USER, PASSWD);//step2. input URL,USERNAME,PW to this.con
			this.smt = this.con.createStatement();//step3. define smt form con.creatStatment
            return true;

		} catch (Exception e) {
			throw new IllegalStateException(e);
		}

	}





    }





    

