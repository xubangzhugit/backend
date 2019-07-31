package test;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
//int - number 类型装换器
//BaseTypeHandler<java类型>
public class TestTypeHandler extends BaseTypeHandler<Boolean>{

	@Override
	public Boolean getNullableResult(ResultSet arg0, String arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean getNullableResult(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	//get 数据库到java
	@Override
	public Boolean getNullableResult(CallableStatement arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
    //set java到数据库
	/**
	 * arg0:PreparedStatement对象
	 * arg1:PreparedStatement对象操作的参数的位置
	 * arg2:java的值
	 * jdbcType:jdbc操作的数据库类型
	 */
	@Override
	public void setNonNullParameter(PreparedStatement arg0, int arg1, Boolean arg2, JdbcType arg3) throws SQLException {
		// TODO Auto-generated method stub
		if(arg2) {
			arg0.setInt(arg1, 1);
		}else {
			arg0.setInt(arg1, 0);
		}
	}
	

	

}
