package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.bourgeoisie.dao.StoreinfoDao;
import com.bourgeoisie.dto.Storeinfo;



class StoreinfoDaoTest {

	@Test
	void testGetStoreinfoList() {
		//fail("まだ実装されていません");
	}

	@Test
	void testFind() {

		Storeinfo si = StoreinfoDao.find(20748204);

		assertEquals("オリエンタルキッチン アンジュナ 恵比寿代官山店", si.getStorename());
	}

	@Test
	void testSearch() {

		List<Storeinfo> list = StoreinfoDao.search("",0);
		assertEquals(1000,list.size());

		list = StoreinfoDao.search("あ",0);
		assertEquals(17,list.size());

		list = StoreinfoDao.search("",3);
		assertEquals(712,list.size());

		list = StoreinfoDao.search("A",12);
		assertEquals(15,list.size());

		System.out.println("list.size():"+list.size());

	}

}
