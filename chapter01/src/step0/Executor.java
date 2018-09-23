package step0;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.domain.Shop;

public class Executor {

	public static void main(String[] args) {
		// 파라미터 객체 생성 및 파라미터 등록
		List<Object> parameters = new ArrayList<Object>();
		parameters.add(1);
		parameters.add("Y");
		
		// 조회 쿼리문 실행 및 결과 반환
		Application application = new Application();
		try {
			Shop shop = application.view(parameters);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
