package test;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
//int - number ����װ����
//BaseTypeHandler<java����>
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
	//get ���ݿ⵽java
	@Override
	public Boolean getNullableResult(CallableStatement arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
    //set java�����ݿ�
	/**
	 * arg0:PreparedStatement����
	 * arg1:PreparedStatement��������Ĳ�����λ��
	 * arg2:java��ֵ
	 * jdbcType:jdbc���������ݿ�����
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
